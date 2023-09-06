package com.psbc.dams.classification.web.service.impl;

import com.psbc.dams.classification.web.domain.*;
import com.psbc.dams.classification.web.mapper.*;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

@Service
public class test {

    @Resource
    private TMtdMdInstMapper tMtdMdInstMapper;
    @Resource
    private TAstAssetInfoMapper tAstAssetInfoMapper;
    @Resource
    private TDicDataItemMapper tDicDataItemMapper;
    @Resource
    private TStdBaseDataMapper tStdBaseDataMapper;
    @Resource
    private TStdIdxMapper tStdIdxMapper;
    @Resource
    private TStdMasterBusiTermMapper tStdMasterBusiTermMapper;
    @Resource
    private SummaryDataMapper summaryDataMapper;
    @Resource
    private RedisTemplate redisTemplate;



    @Transactional
    public void tempAsset(List<String> vos) {
        List<SummaryData> list = tAstAssetInfoMapper.selectAll2(vos);
        ArrayList<SummaryData> arrayList = new ArrayList<>();
        for (SummaryData summaryData:list) {
            int value = 1;
            String key = summaryData.getDatabaseEnglish() +summaryData.getFieldChinese()
                    +summaryData.getFieldEnglish()+summaryData.getFieldMean()+summaryData.getProjectName()
                    +summaryData.getTableChinese()+summaryData.getTableEnglish() +summaryData.getDataType();
            if (redisTemplate.opsForSet().add(key,value)==1){
                //将数据插入到集合里面
                arrayList.add(summaryData);
            }
            if (arrayList.size()>1000){
                //异步插入到数据库里面，并发送给数安
                summaryDataMapper.batchinsert(arrayList);
                arrayList = new ArrayList<>();
            }
        }
        if(arrayList!=null&&arrayList.size()>0){
            summaryDataMapper.batchinsert(arrayList);
        }
    }

    @Transactional
    public void tempDicData(List<String> vos) {
        List<SummaryData> list = tDicDataItemMapper.selectAll2(vos);
        ArrayList<SummaryData> arrayList = new ArrayList<>();
        for (SummaryData summaryData:list) {
            int value = 1;
            String key = summaryData.getDatabaseEnglish() +summaryData.getFieldChinese()
                    +summaryData.getFieldEnglish()+summaryData.getFieldMean()+summaryData.getProjectName()
                    +summaryData.getTableChinese()+summaryData.getTableEnglish() +summaryData.getDataType();
            if (redisTemplate.opsForSet().add(key,value)==1){
                //将数据插入到集合里面
                arrayList.add(summaryData);
            }
            if (arrayList.size()>1000){
                //异步插入到数据库里面，并发送给数安
                summaryDataMapper.batchinsert(arrayList);
                arrayList = new ArrayList<>();
            }
        }
        if(arrayList!=null&&arrayList.size()>0){
            summaryDataMapper.batchinsert(arrayList);
        }
    }

    @Transactional
    public void tempTStdBaseData(List<String> vos) {
        List<SummaryData> list = tStdBaseDataMapper.selectAll2(vos);
        ArrayList<SummaryData> arrayList = new ArrayList<>();
        for (SummaryData summaryData:list) {
            int value = 1;
            String key = summaryData.getDatabaseEnglish() +summaryData.getFieldChinese()
                    +summaryData.getFieldEnglish()+summaryData.getFieldMean()+summaryData.getProjectName()
                    +summaryData.getTableChinese()+summaryData.getTableEnglish() +summaryData.getDataType();
            if (redisTemplate.opsForSet().add(key,value)==1){
                //将数据插入到集合里面
                arrayList.add(summaryData);
            }
            if (arrayList.size()>1000){
                //异步插入到数据库里面，并发送给数安
                summaryDataMapper.batchinsert(arrayList);
                arrayList = new ArrayList<>();
            }
        }
        if(arrayList!=null&&arrayList.size()>0){
            summaryDataMapper.batchinsert(arrayList);
        }
    }

    @Transactional
    public void tempTStdMasterBusiTerm(Integer begin, Integer end, CountDownLatch countDownLatch) {
        long begin1 = System.currentTimeMillis();
        Cursor<TStdMasterBusiTerm> list = tStdMasterBusiTermMapper.selectAll(begin, end);
        //List<TMtdMdInst> list = tMtdMdInstMapper.selectAll1(begin,end);
        List<TStdMasterBusiTerm> tStdMasterBusiTerm = null;
        int i = 0;
        for(TStdMasterBusiTerm masterBusiTerm:list){
            if(tStdMasterBusiTerm == null ||tStdMasterBusiTerm.size()==0){
                tStdMasterBusiTerm = new ArrayList<>();
            }
            if(tStdMasterBusiTerm.size()>10000){
                System.out.println("发送批次数据"+i++);
                tStdMasterBusiTerm = null;
                continue;
            }
            tStdMasterBusiTerm.add(masterBusiTerm);
        }
        long end1 = System.currentTimeMillis();
        System.out.println(Thread.currentThread()+"耗时："+(end1-begin1));
        countDownLatch.countDown();
    }

    


    public void tempTest(List<String> vos) {
        List<SummaryData> list = tMtdMdInstMapper.selectAll2(vos);
        ArrayList<SummaryData> arrayList = new ArrayList<>();
        for (SummaryData summaryData:list) {
            int value = 1;
            String key = summaryData.getDatabaseEnglish() +summaryData.getFieldChinese()
                    +summaryData.getFieldEnglish()+summaryData.getFieldMean()+summaryData.getProjectName()
                    +summaryData.getTableChinese()+summaryData.getTableEnglish() +summaryData.getDataType();
            if (redisTemplate.opsForSet().add(key,value)==1){
                //将数据插入到集合里面
                arrayList.add(summaryData);
            }
            if (arrayList.size()>1000){
                //异步插入到数据库里面，并发送给数安
                summaryDataMapper.batchinsert(arrayList);
                arrayList = new ArrayList<>();
            }
        }
        if(arrayList!=null&&arrayList.size()>0){
            summaryDataMapper.batchinsert(arrayList);
        }
    }
}
