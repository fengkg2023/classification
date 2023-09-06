package com.psbc.dams.classification.web.service;

import com.psbc.dams.classification.web.domain.TStdMasterBusiTerm;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * 业务术语信息Service接口
 * 
 * @author classification
 * @date 2023-07-25
 */
public interface ITStdMasterBusiTermService 
{
    /**
     * 查询业务术语信息
     * 
     * @param termNo 业务术语信息主键
     * @return 业务术语信息
     */
    public TStdMasterBusiTerm selectTStdMasterBusiTermByTermNo(String termNo);

    /**
     * 查询业务术语信息列表
     * 
     * @param tStdMasterBusiTerm 业务术语信息
     * @return 业务术语信息集合
     */
    public List<TStdMasterBusiTerm> selectTStdMasterBusiTermList(TStdMasterBusiTerm tStdMasterBusiTerm);

    /**
     * 新增业务术语信息
     * 
     * @param tStdMasterBusiTerm 业务术语信息
     * @return 结果
     */
    public int insertTStdMasterBusiTerm(TStdMasterBusiTerm tStdMasterBusiTerm);

    /**
     * 修改业务术语信息
     * 
     * @param tStdMasterBusiTerm 业务术语信息
     * @return 结果
     */
    public int updateTStdMasterBusiTerm(TStdMasterBusiTerm tStdMasterBusiTerm);

    /**
     * 批量删除业务术语信息
     * 
     * @param termNos 需要删除的业务术语信息主键集合
     * @return 结果
     */
    public int deleteTStdMasterBusiTermByTermNos(String termNos);

    /**
     * 删除业务术语信息信息
     * 
     * @param termNo 业务术语信息主键
     * @return 结果
     */
    public int deleteTStdMasterBusiTermByTermNo(String termNo);


    /**
     * 定时任务查询
     */
    void selectTStdMasterBusiTerm(Integer begin, Integer end, CountDownLatch countDownLatch);
}
