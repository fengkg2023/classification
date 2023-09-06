package com.psbc.dams.classification.web.mapper;

import com.psbc.dams.classification.web.domain.JsonsRootBean;
import com.psbc.dams.classification.web.domain.SummaryData;
import org.apache.ibatis.annotations.Param;
//import org.springframework.security.core.parameters.P;

import java.util.ArrayList;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author classification
 * @date 2023-08-14
 */
public interface SummaryDataMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SummaryData selectSummaryDataById(String id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param summaryData 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SummaryData> selectSummaryDataList(SummaryData summaryData);

    /**
     * 新增【请填写功能名称】
     *
     * @param summaryData 【请填写功能名称】
     * @return 结果
     */
    public int insertSummaryData(SummaryData summaryData);

    /**
     * 修改【请填写功能名称】
     *
     * @param summaryData 【请填写功能名称】
     * @return 结果
     */
    public int updateSummaryData(SummaryData summaryData);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSummaryDataById(String id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSummaryDataByIds(String[] ids);

    int insertIfNoExists(SummaryData summaryData);

    void insertAll(List<SummaryData> vos);

    List<SummaryData> selectAll(@Param("tableName") String tableName,@Param("dbName") String dbName, @Param("authorization") String authorization);

    List<JsonsRootBean> selectVo(String authorization);

    void batchinsert(ArrayList<SummaryData> arrayList);
}
