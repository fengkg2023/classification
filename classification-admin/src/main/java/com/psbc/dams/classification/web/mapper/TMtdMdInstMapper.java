package com.psbc.dams.classification.web.mapper;

import java.util.List;

import com.psbc.dams.classification.common.annotation.DataSource;
import com.psbc.dams.classification.web.domain.SummaryData;
import com.psbc.dams.classification.web.domain.TMtdMdInst;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.transaction.annotation.Transactional;

import static com.psbc.dams.classification.common.enums.DataSourceType.MASTER;
import static com.psbc.dams.classification.common.enums.DataSourceType.SLAVE;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author classification
 * @date 2023-07-24
 */
@Mapper
public interface TMtdMdInstMapper 
{
    /**
     * 根据部门分组查询
     *
     * @return 【请填写功能名称】
     */
    @DataSource(value = SLAVE)
    public List<TMtdMdInst> selectTMtdMdInstByInstId();

    /**
     * 根据部门进行查询
     *
     * @return 【请填写功能名称】集合
     */
    @DataSource(value = SLAVE)
    public List<TMtdMdInst> selectTMtdMdInstList(String deptId);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tMtdMdInst 【请填写功能名称】
     * @return 结果
     */
    @DataSource(value = MASTER)
    public int insertTMtdMdInst(List<TMtdMdInst> tMtdMdInst);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tMtdMdInst 【请填写功能名称】
     * @return 结果
     */
    public int updateTMtdMdInst(TMtdMdInst tMtdMdInst);

    /**
     * 删除【请填写功能名称】
     * 
     * @param instId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTMtdMdInstByInstId(String instId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param instIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMtdMdInstByInstIds(String[] instIds);


    Cursor<TMtdMdInst> selectAll(@Param(value = "begin") Integer begin, @Param(value = "end") Integer end);

    List<TMtdMdInst> selectAll1(@Param(value = "begin") Integer begin, @Param(value = "end") Integer end);

    /**
     * 查询全部的库的id
     * @return
     */
    @DataSource(value = SLAVE)
    List<String> selectTMtdMdInstListSchema();

    /**
     *
     * @param vos
     * @return
     */
    @DataSource(value = SLAVE)
    List<SummaryData> selectAll2(List<String> vos);
}
