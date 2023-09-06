package com.psbc.dams.classification.web.service.impl;

import com.psbc.dams.classification.web.mapper.TStdBaseDataMapper;
import com.psbc.dams.classification.web.service.ITStdBaseDataService;
import org.apache.commons.collections4.ListUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 基础数据规范Service业务层处理
 * 
 * @author classification
 * @date 2023-07-25
 */
@Service
public class TStdBaseDataServiceImpl implements ITStdBaseDataService
{
    @Resource
    private TStdBaseDataMapper tStdBaseDataMapper;
    @Resource
    private com.psbc.dams.classification.web.service.impl.test test;

    /**
     * 查询基础数据规范
     *
     * @return 基础数据规范
     */
    @Override
    public void selectTStdBaseDataByStdNo() {
        long begin = System.currentTimeMillis();
        List<String> list = tStdBaseDataMapper.selectStdNo();
        //查询全部的库名
        List<List<String>> partition = ListUtils.partition(list, 20);
        final CountDownLatch countDownLatch = new CountDownLatch(partition.size());
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (List<String> vos:partition) {
            executorService.execute(()->{
                test.tempTStdBaseData(vos);
                countDownLatch.countDown();
                System.out.println("计数器的值："+countDownLatch.getCount());
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时"+(end-begin));
        executorService.shutdown();
    }
}
