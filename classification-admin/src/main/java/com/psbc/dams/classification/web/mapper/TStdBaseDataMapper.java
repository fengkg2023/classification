package com.psbc.dams.classification.web.mapper;

import com.psbc.dams.classification.common.annotation.DataSource;
import com.psbc.dams.classification.web.domain.SummaryData;
import com.psbc.dams.classification.web.domain.TStdBaseData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.cursor.Cursor;

import java.util.List;

import static com.psbc.dams.classification.common.enums.DataSourceType.SLAVE;

/**
 * 基础数据规范Mapper接口
 * 
 * @author classification
 * @date 2023-07-25
 */
@Mapper
public interface TStdBaseDataMapper 
{
    /**
     * 查询基础数据规范
     * 
     * @param stdNo 基础数据规范主键
     * @return 基础数据规范
     */
    public TStdBaseData selectTStdBaseDataByStdNo(String stdNo);

    /**
     * 查询基础数据规范列表
     * 
     * @param tStdBaseData 基础数据规范
     * @return 基础数据规范集合
     */
    public List<TStdBaseData> selectTStdBaseDataList(TStdBaseData tStdBaseData);

    /**
     * 新增基础数据规范
     * 
     * @param tStdBaseData 基础数据规范
     * @return 结果
     */
    public int insertTStdBaseData(TStdBaseData tStdBaseData);

    /**
     * 修改基础数据规范
     * 
     * @param tStdBaseData 基础数据规范
     * @return 结果
     */
    public int updateTStdBaseData(TStdBaseData tStdBaseData);

    /**
     * 删除基础数据规范
     * 
     * @param stdNo 基础数据规范主键
     * @return 结果
     */
    public int deleteTStdBaseDataByStdNo(String stdNo);

    /**
     * 批量删除基础数据规范
     * 
     * @param stdNos 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTStdBaseDataByStdNos(String[] stdNos);

    Cursor<TStdBaseData> selectAll(@Param(value = "begin") Integer begin, @Param(value = "end") Integer end);

    @DataSource(value = SLAVE)
    List<String> selectStdNo();

    List<String> selectTMtdMdInstListSchema();

    @DataSource(value = SLAVE)
    List<SummaryData> selectAll2(List<String> vos);
}
