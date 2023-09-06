package com.psbc.dams.classification.web.mapper;

import com.psbc.dams.classification.web.domain.TStdIdx;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.cursor.Cursor;

import java.util.List;

/**
 * 指标标准Mapper接口
 * 
 * @author classification
 * @date 2023-07-25
 */
@Mapper
public interface TStdIdxMapper 
{
    /**
     * 查询指标标准
     * 
     * @param idxNo 指标标准主键
     * @return 指标标准
     */
    public TStdIdx selectTStdIdxByIdxNo(String idxNo);

    /**
     * 查询指标标准列表
     * 
     * @param tStdIdx 指标标准
     * @return 指标标准集合
     */
    public List<TStdIdx> selectTStdIdxList(TStdIdx tStdIdx);

    /**
     * 新增指标标准
     * 
     * @param tStdIdx 指标标准
     * @return 结果
     */
    public int insertTStdIdx(TStdIdx tStdIdx);

    /**
     * 修改指标标准
     * 
     * @param tStdIdx 指标标准
     * @return 结果
     */
    public int updateTStdIdx(TStdIdx tStdIdx);

    /**
     * 删除指标标准
     * 
     * @param idxNo 指标标准主键
     * @return 结果
     */
    public int deleteTStdIdxByIdxNo(String idxNo);

    /**
     * 批量删除指标标准
     * 
     * @param idxNos 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTStdIdxByIdxNos(String[] idxNos);

    Cursor<TStdIdx> selectAll(@Param(value = "begin") Integer begin, @Param(value = "end") Integer end);
}
