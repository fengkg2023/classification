package com.psbc.dams.classification.web.service;

import com.psbc.dams.classification.web.domain.SummaryData;

import java.util.List;

public interface ISummaryDataService {

    String importExcel(List<SummaryData> summaryDataList, boolean updateSupport, String authorization,String token);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param summaryData 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    List<SummaryData> selectSummaryDataList(SummaryData summaryData,String user);

    /**
     * 修改【请填写功能名称】
     *
     * @param summaryData 【请填写功能名称】
     * @return 结果
     */
    void updateSummaryData(SummaryData summaryData,String user);

    /**
     * 删除【请填写功能名称】信息
     *
     * @return 结果
     */
    void deleteSummary(String authorization,String user);

    void commitSummaryData(String authorization,String token);

    String importExcelResult(List<SummaryData> summaryDataList, boolean updateSupport, String authorization,String token,int source);
}
