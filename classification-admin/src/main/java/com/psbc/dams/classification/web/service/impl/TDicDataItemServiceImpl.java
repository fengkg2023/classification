package com.psbc.dams.classification.web.service.impl;

import com.psbc.dams.classification.web.mapper.TDicDataItemMapper;
import com.psbc.dams.classification.web.service.ITDicDataItemService;
import org.apache.commons.collections4.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 字典Service业务层处理
 * 
 * @author classification
 * @date 2023-07-25
 */
@Service
public class TDicDataItemServiceImpl implements ITDicDataItemService
{
    @Autowired
    private TDicDataItemMapper tDicDataItemMapper;
    @Resource
    private com.psbc.dams.classification.web.service.impl.test test;

    /**
     * 查询字典
     *
     * @return 字典
     */
    @Override
    public void selectTDicDataItemByDataItemId() {
        long begin = System.currentTimeMillis();
        //查询全部的库名
        List<String> schemaList = tDicDataItemMapper.selectDataItemId();
        List<List<String>> partition = ListUtils.partition(schemaList, 20);
        final CountDownLatch countDownLatch = new CountDownLatch(partition.size());
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (List<String> vos:partition) {
            executorService.execute(()->{
                test.tempDicData(vos);
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
