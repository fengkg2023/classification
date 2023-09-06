package com.psbc.dams.classification.web.mapper;

import com.psbc.dams.classification.common.annotation.DataSource;
import com.psbc.dams.classification.web.domain.SummaryData;
import com.psbc.dams.classification.web.domain.TAstAssetInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.cursor.Cursor;

import java.util.List;

import static com.psbc.dams.classification.common.enums.DataSourceType.SLAVE;

/**
 * 数据资产Mapper接口
 * 
 * @author classification
 * @date 2023-07-25
 */
@Mapper
public interface TAstAssetInfoMapper
{
    /**
     * 查询数据资产
     * @return 数据资产
     */
    @DataSource(value = SLAVE)
    public List<TAstAssetInfo> selectTAstAssetInfoByAssetNo();

    /**
     * 查询数据资产列表
     * 
     * @param tAstAssetInfo 数据资产
     * @return 数据资产集合
     */
    public List<TAstAssetInfo> selectTAstAssetInfoList(TAstAssetInfo tAstAssetInfo);

    /**
     * 新增数据资产
     *
     * @return 结果
     */
    @DataSource(value = SLAVE)
    public int insertTAstAssetInfo(List<TAstAssetInfo> list);

    /**
     * 修改数据资产
     * 
     * @param tAstAssetInfo 数据资产
     * @return 结果
     */
    public int updateTAstAssetInfo(TAstAssetInfo tAstAssetInfo);

    /**
     * 删除数据资产
     * 
     * @param assetNo 数据资产主键
     * @return 结果
     */
    public int deleteTAstAssetInfoByAssetNo(String assetNo);

    /**
     * 批量删除数据资产
     * 
     * @param assetNos 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTAstAssetInfoByAssetNos(String[] assetNos);

    /**
     * 查询全部数据
     * @param begin   开始数量
     * @param end     结束数量
     * @return   1
     */
    Cursor<TAstAssetInfo> selectAll(@Param(value = "begin") Integer begin, @Param(value = "end") Integer end);

    @DataSource(value = SLAVE)
    List<String> selectAssetNo();

    @DataSource(value = SLAVE)
    List<SummaryData> selectAll2(List<String> vos);
}
