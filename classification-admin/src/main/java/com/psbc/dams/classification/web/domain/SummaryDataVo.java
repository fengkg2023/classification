package com.psbc.dams.classification.web.domain;

import java.util.List;

public class SummaryDataVo {

    private int source;
    private List<JsonsRootBean> tableVoList;

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public List<JsonsRootBean> getTableVoList() {
        return tableVoList;
    }

    public void setTableVoList(List<JsonsRootBean> tableVoList) {
        this.tableVoList = tableVoList;
    }

    @Override
    public String toString() {
        return "SummaryDataVo{" +
                "source=" + source +
                ", tableVoList=" + tableVoList +
                '}';
    }
}
