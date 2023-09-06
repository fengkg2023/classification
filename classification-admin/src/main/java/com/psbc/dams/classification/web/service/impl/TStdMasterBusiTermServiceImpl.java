package com.psbc.dams.classification.web.service.impl;

import com.psbc.dams.classification.common.annotation.DataSource;
import com.psbc.dams.classification.common.core.text.Convert;
import com.psbc.dams.classification.common.utils.DateUtils;
import com.psbc.dams.classification.web.domain.TStdMasterBusiTerm;
import com.psbc.dams.classification.web.mapper.TStdMasterBusiTermMapper;
import com.psbc.dams.classification.web.service.ITStdMasterBusiTermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import static com.psbc.dams.classification.common.enums.DataSourceType.SLAVE;

/**
 * 业务术语信息Service业务层处理
 * 
 * @author classification
 * @date 2023-07-25
 */
@Service
public class TStdMasterBusiTermServiceImpl implements ITStdMasterBusiTermService
{
    @Autowired
    private TStdMasterBusiTermMapper tStdMasterBusiTermMapper;
    @Resource
    private com.psbc.dams.classification.web.service.impl.test test;

    /**
     * 查询业务术语信息
     * 
     * @param termNo 业务术语信息主键
     * @return 业务术语信息
     */
    @Override
    public TStdMasterBusiTerm selectTStdMasterBusiTermByTermNo(String termNo)
    {
        return tStdMasterBusiTermMapper.selectTStdMasterBusiTermByTermNo(termNo);
    }

    /**
     * 查询业务术语信息列表
     * 
     * @param tStdMasterBusiTerm 业务术语信息
     * @return 业务术语信息
     */
    @Override
    public List<TStdMasterBusiTerm> selectTStdMasterBusiTermList(TStdMasterBusiTerm tStdMasterBusiTerm)
    {
        return tStdMasterBusiTermMapper.selectTStdMasterBusiTermList(tStdMasterBusiTerm);
    }

    /**
     * 新增业务术语信息
     * 
     * @param tStdMasterBusiTerm 业务术语信息
     * @return 结果
     */
    @Override
    public int insertTStdMasterBusiTerm(TStdMasterBusiTerm tStdMasterBusiTerm)
    {
        tStdMasterBusiTerm.setCreateTime(DateUtils.getNowDate());
        return tStdMasterBusiTermMapper.insertTStdMasterBusiTerm(tStdMasterBusiTerm);
    }

    /**
     * 修改业务术语信息
     * 
     * @param tStdMasterBusiTerm 业务术语信息
     * @return 结果
     */
    @Override
    public int updateTStdMasterBusiTerm(TStdMasterBusiTerm tStdMasterBusiTerm)
    {
        return tStdMasterBusiTermMapper.updateTStdMasterBusiTerm(tStdMasterBusiTerm);
    }

    /**
     * 批量删除业务术语信息
     * 
     * @param termNos 需要删除的业务术语信息主键
     * @return 结果
     */
    @Override
    public int deleteTStdMasterBusiTermByTermNos(String termNos)
    {
        return tStdMasterBusiTermMapper.deleteTStdMasterBusiTermByTermNos(Convert.toStrArray(termNos));
    }

    /**
     * 删除业务术语信息信息
     * 
     * @param termNo 业务术语信息主键
     * @return 结果
     */
    @Override
    public int deleteTStdMasterBusiTermByTermNo(String termNo)
    {
        return tStdMasterBusiTermMapper.deleteTStdMasterBusiTermByTermNo(termNo);
    }

    @Override
    @Async
    @DataSource(value = SLAVE)
    public void selectTStdMasterBusiTerm(Integer begin, Integer end, CountDownLatch countDownLatch) {
        test.tempTStdMasterBusiTerm(begin, end,countDownLatch);
    }
}
