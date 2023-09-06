package com.psbc.dams.classification.web.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.psbc.dams.classification.web.mapper.TMtdMdInstMapper;
import com.psbc.dams.classification.web.service.ITMtdMdInstService;
import org.apache.commons.collections4.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author classification
 * @date 2023-07-24
 */
@Service
public class TMtdMdInstServiceImpl implements ITMtdMdInstService {
    @Autowired
    private TMtdMdInstMapper tMtdMdInstMapper;
    @Resource
    private test test;

    /**
     * 多线程查询数据
     */
    @Override
    public void selectTMtdMdInstByInstId() {
        long begin = System.currentTimeMillis();
        //查询全部的库名
        List<String> schemaList = tMtdMdInstMapper.selectTMtdMdInstListSchema();
        List<List<String>> partition = ListUtils.partition(schemaList, 20);
        final CountDownLatch countDownLatch = new CountDownLatch(partition.size());
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (List<String> vos : partition) {
            executorService.execute(() -> {
                test.tempTest(vos);
                countDownLatch.countDown();
                System.out.println("计数器的值：" + countDownLatch.getCount());
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时" + (end - begin));
        executorService.shutdown();
    }
}
