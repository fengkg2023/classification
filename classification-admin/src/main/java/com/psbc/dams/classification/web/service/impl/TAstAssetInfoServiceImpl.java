package com.psbc.dams.classification.web.service.impl;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.psbc.dams.classification.common.annotation.DataSource;
import com.psbc.dams.classification.web.mapper.TAstAssetInfoMapper;
import com.psbc.dams.classification.web.service.ITAstAssetInfoService;
import org.apache.commons.collections4.ListUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import static com.psbc.dams.classification.common.enums.DataSourceType.SLAVE;

/**
 * 数据资产Service业务层处理
 * 
 * @author classification
 * @date 2023-07-25
 */
@Service
public class TAstAssetInfoServiceImpl implements ITAstAssetInfoService {

    @Resource
    private TAstAssetInfoMapper tAstAssetInfoMapper;
    @Resource
    private test test;

    /**
     * 查询数据资产
     * @return 数据资产
     */
    @Override
    @Async
    @DataSource(value = SLAVE)
    public void selectTAstAssetInfoByAssetNo() {
        long begin = System.currentTimeMillis();
        List<String> assetNo = tAstAssetInfoMapper.selectAssetNo();
        List<List<String>> partition = ListUtils.partition(assetNo, 20);
        final CountDownLatch countDownLatch = new CountDownLatch(partition.size());
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (List<String> vos:partition) {
            executorService.execute(()->{
                test.tempAsset(vos);
                countDownLatch.countDown();
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
