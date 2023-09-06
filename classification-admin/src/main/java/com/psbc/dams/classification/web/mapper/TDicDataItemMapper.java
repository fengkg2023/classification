package com.psbc.dams.classification.web.mapper;

import com.psbc.dams.classification.common.annotation.DataSource;
import com.psbc.dams.classification.web.domain.SummaryData;
import com.psbc.dams.classification.web.domain.TDicDataItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.cursor.Cursor;

import java.util.List;

import static com.psbc.dams.classification.common.enums.DataSourceType.SLAVE;

/**
 * 字典Mapper接口
 * 
 * @author classification
 * @date 2023-07-25
 */
@Mapper
public interface TDicDataItemMapper 
{
    /**
     * 查询字典
     * 
     * @param dataItemId 字典主键
     * @return 字典
     */
    public TDicDataItem selectTDicDataItemByDataItemId(String dataItemId);

    /**
     * 查询字典列表
     * 
     * @param tDicDataItem 字典
     * @return 字典集合
     */
    public List<TDicDataItem> selectTDicDataItemList(TDicDataItem tDicDataItem);

    /**
     * 新增字典
     * 
     * @param tDicDataItem 字典
     * @return 结果
     */
    public int insertTDicDataItem(TDicDataItem tDicDataItem);

    /**
     * 修改字典
     * 
     * @param tDicDataItem 字典
     * @return 结果
     */
    public int updateTDicDataItem(TDicDataItem tDicDataItem);

    /**
     * 删除字典
     * 
     * @param dataItemId 字典主键
     * @return 结果
     */
    public int deleteTDicDataItemByDataItemId(String dataItemId);

    /**
     * 批量删除字典
     * 
     * @param dataItemIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTDicDataItemByDataItemIds(String[] dataItemIds);

    /**
     * 查询全部数据
     * @param begin  开始
     * @param end   结束
     * @return  1
     */
    Cursor<TDicDataItem> selectAll(@Param(value = "begin") Integer begin, @Param(value = "end") Integer end);

    @DataSource(value = SLAVE)
    List<String> selectDataItemId();

    @DataSource(value = SLAVE)
    List<SummaryData> selectAll2(List<String> vos);
}
