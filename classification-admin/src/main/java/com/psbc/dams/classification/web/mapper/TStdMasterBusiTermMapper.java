package com.psbc.dams.classification.web.mapper;

import com.psbc.dams.classification.web.domain.TMtdMdInst;
import com.psbc.dams.classification.web.domain.TStdMasterBusiTerm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.cursor.Cursor;

import java.util.List;

/**
 * 业务术语信息Mapper接口
 * 
 * @author classification
 * @date 2023-07-25
 */
@Mapper
public interface TStdMasterBusiTermMapper 
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
     * 删除业务术语信息
     * 
     * @param termNo 业务术语信息主键
     * @return 结果
     */
    public int deleteTStdMasterBusiTermByTermNo(String termNo);

    /**
     * 批量删除业务术语信息
     * 
     * @param termNos 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTStdMasterBusiTermByTermNos(String[] termNos);

    Cursor<TStdMasterBusiTerm> selectAll(@Param(value = "begin") Integer begin, @Param(value = "end") Integer end);

    List<TMtdMdInst> selectAllList(List<String> vos);
}
