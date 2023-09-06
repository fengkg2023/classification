package com.psbc.dams.classification.web.mapper;


import com.psbc.dams.classification.web.domain.SummaryData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author classification
 * @date 2023-08-14
 */
@Mapper
public interface SummaryDataCollectMapper {

    /**
     * 采集状态为0的所有的数据
     * @return
     */
    List<SummaryData> selectAllByStatus();
}
