package com.psbc.dams.classification.web.service.impl;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.psbc.dams.classification.common.exception.ServiceException;
import com.psbc.dams.classification.common.utils.StringUtils;
import com.psbc.dams.classification.web.core.config.HttpUtilss;
import com.psbc.dams.classification.web.domain.Cols;
import com.psbc.dams.classification.web.domain.JsonsRootBean;
import com.psbc.dams.classification.web.domain.SummaryData;
import com.psbc.dams.classification.web.mapper.SummaryDataCollectMapper;
import com.psbc.dams.classification.web.mapper.SummaryDataMapper;
import com.psbc.dams.classification.web.service.ISummaryDataService;
import org.apache.commons.collections4.ListUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class SummaryDataServiceImpl implements ISummaryDataService {

    private static final Logger log = LoggerFactory.getLogger(SummaryDataServiceImpl.class);

    @Resource
    private SummaryDataMapper summaryDataMapper;
    @Resource
    private RedisTemplate redisTemplate;

    @Value("upload.url")
    private String url;

    @Override
    public String importExcel(List<SummaryData> summaryDataList, boolean updateSupport, String authorization,String token)
    {
        if (StringUtils.isNull(summaryDataList) || summaryDataList.size() == 0)
        {
            throw new ServiceException("导入数据不能为空！");
        }
        int successNum = summaryDataList.size();
        int failureNum = 0;
        int faileAllNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        for (SummaryData summaryData : summaryDataList) {
            SummaryData temp = new SummaryData();
            temp.setProjectName(summaryData.getProjectName());
            temp.setDatabaseEnglish(summaryData.getDatabaseEnglish());
            temp.setTableEnglish(summaryData.getTableEnglish());
            temp.setFieldEnglish(summaryData.getFieldEnglish());
            temp.setFieldMean(summaryData.getFieldMean());
            try {
                String key = authorization+"_"+temp.toString();
                Long aLong = redisTemplate.opsForSet().add(key, "1");
                if (aLong==0) {
                    failureNum++;
                    failureMsg.append("<br/>" + failureNum + "、数据 " + temp.toString() + " 已存在");
                }
                String key1 = authorization+"_"+summaryData.getId();
                boolean add = redisTemplate.opsForValue().setIfAbsent(key1,summaryData);
                if (add){
                    successNum--;
                    successMsg.append("<br/>" + successNum + "、数据 " + temp.toString() + " 导入成功");
                }

            }
            catch (Exception e)
            {
                faileAllNum++;
                String msg = "<br/>" + failureNum + "、数据 " + temp.toString() + " 导入失败：";
                failureMsg.append(msg + e.getMessage());
                log.error(msg, e);
            }
        }
        if (faileAllNum > 0) {
            failureMsg.insert(0, "很抱歉，导入失败！共 " + faileAllNum + " 条数据格式不正确，错误如下：");
            throw new ServiceException(failureMsg.toString());
        } else{
            successMsg.insert(0, "恭喜您，数据已导入结束！共 " + successNum + " 条，数据如下：");
        }
        return successMsg.toString();
    }


    @Transactional
    @Override
    public String importExcelResult(List<SummaryData> summaryDataList, boolean updateSupport, String authorization,String token,int source) {
        if (StringUtils.isNull(summaryDataList) || summaryDataList.size() == 0) {
            throw new ServiceException("导入数据不能为空！");
        }
        StringBuilder failureMsg = new StringBuilder();
        StringBuilder successMsg = new StringBuilder();
        List<List<SummaryData>> lists = ListUtils.partition(summaryDataList, 1000);
        try{
            for (List<SummaryData> distinctList:lists) {
                distinctList.forEach(a->{
                    a.setCreateUser(authorization);
                });
                summaryDataMapper.insertAll(distinctList);
            }
            this.sendSummaryData(token,source,authorization);
        }catch (Exception e){
            e.getStackTrace();
            failureMsg.insert(0, "入库失败");
        }

        return successMsg.insert(0,"入库成功").toString();
    }


    public void sendSummaryData(String token,int source, String authorization) {
        //查询数据库
        List<JsonsRootBean> jsonsRootBeanList = summaryDataMapper.selectVo(authorization);
        for (JsonsRootBean e:jsonsRootBeanList) {
            ArrayList<JsonsRootBean> jsonsRootBeans = new ArrayList<>();
            JsonsRootBean rootBean = new JsonsRootBean();
            rootBean.setTableName(e.getTableName());
            rootBean.setDbName(e.getDbName());
            rootBean.setDbType("结构化");
            rootBean.setTableNameCn(e.getTableNameCn());
            List<SummaryData> lists = summaryDataMapper.selectAll(e.getTableNameCn(),e.getDbName(),authorization);
            for (SummaryData vo:lists) {
                Cols cols = new Cols();
                cols.setColName(vo.getFieldChinese()==null?"字段1": vo.getFieldChinese());
                cols.setColnamecn(vo.getFieldEnglish()==null?"字段英文": vo.getFieldEnglish());
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add("部门1");
                cols.setDepts(arrayList);
                cols.setProjectName(vo.getProjectName()==null ? "工程1":vo.getProjectName());
                cols.setColComment("1");
                cols.setClassification1(vo.getResult1()==null ? null:vo.getResult1());
                cols.setClassification2(vo.getResult2()==null ? null:vo.getResult2());
                cols.setClassification3(vo.getResult3()==null ? null:vo.getResult3());
                cols.setClassification4(vo.getResult4()==null ? null:vo.getResult4());
                cols.setEntDictCode(vo.getEnterpriseDataDictionary()==null ? "字典1" :vo.getEnterpriseDataDictionary());
                cols.setLevel("1");
                cols.setRemark(vo.getRemark()==null ? null:vo.getRemark());
                List<Cols> list = new ArrayList<>();
                list.add(cols);
                rootBean.setCols(list);
                jsonsRootBeans.add(rootBean);
            }
            Gson gson = new Gson();
            String s = gson.toJson(jsonsRootBeans);
            try {
                HttpUtilss.sendJson(url+source,s,token);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param summaryData 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SummaryData> selectSummaryDataList(SummaryData summaryData,String user)
    {
        Set keys = redisTemplate.keys(user + "*");
        List<SummaryData> redis = getRedis(keys);
        return redis;
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param summaryData 【请填写功能名称】
     * @return 结果
     */
    @Override
    public void updateSummaryData(SummaryData summaryData,String user) {
        String authorization = user+summaryData.getId();
        redisTemplate.opsForValue().getAndDelete(authorization);
        redisTemplate.opsForValue().set(authorization,summaryData);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @return 结果
     */
    @Override
    public void deleteSummary(String authorization,String user) {
        Set keys = redisTemplate.keys(user + "*");
        redisTemplate.delete(keys);
    }

    /**
     * 提交到数据库
     * @param authorization  用户
     * @param token  token
     */
    @Override
    public void commitSummaryData(String authorization,String token) {
        int source = 1;
        //从redis里面获取数据
        Set keys = redisTemplate.keys(authorization + "*");
        List<SummaryData> data = getRedis(keys);
        List<List<SummaryData>> listList = ListUtils.partition(data, 1000);
        //基于内存去重
        for (List<SummaryData> vos:listList) {
            List<SummaryData> distinctList = vos.stream()
                    .filter(distinctByKeys(SummaryData::getDatabaseEnglish, SummaryData::getProjectName
        ,SummaryData::getFieldChinese,SummaryData::getTableEnglish,SummaryData::getFieldMean))
                    .collect(Collectors.toList());
            distinctList.forEach(a->{
                a.setCreateUser(authorization);
            });
            summaryDataMapper.insertAll(distinctList);
        }
        //调用发送给数安的接口
        this.sendSummaryData(token,source,authorization);
        redisTemplate.delete(keys);
    }

    private List<SummaryData> getRedis(Set keys){
        List<SummaryData> lists = new ArrayList<>();
        List list = redisTemplate.opsForValue().multiGet(keys);
        System.out.println(list.size());
        if (list.size()!=0){
            String s = JSON.toJSONString(list);
            lists = JSON.parseArray(s, SummaryData.class);
        }
        for (SummaryData v:lists) {
            System.out.println(v);
        }
        return lists;
    }

    public static <T> Predicate<T> distinctByKeys(Function<? super T, ?>... keyExtractors) {
        Map<List<?>, Boolean> seen = new ConcurrentHashMap<>();
        return t -> {
            List<?> keys = Arrays.stream(keyExtractors)
                    .map(ke -> ke.apply(t))
                    .collect(Collectors.toList());
            return seen.putIfAbsent(keys, Boolean.TRUE) == null;
        };
    }
}
