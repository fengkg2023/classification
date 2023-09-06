package com.psbc.dams.classification.web.domain;


import java.util.List;

public class JsonsRootBean {

    private List<Cols> cols;
    private String dbName;
    private String dbType;
    private String tableName;
    private String tableNameCn;

    public List<Cols> getCols() {
        return cols;
    }

    public void setCols(List<Cols> cols) {
        this.cols = cols;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableNameCn() {
        return tableNameCn;
    }

    public void setTableNameCn(String tableNameCn) {
        this.tableNameCn = tableNameCn;
    }

    @Override
    public String toString() {
        return "JsonsRootBean{" +
                "cols=" + cols +
                ", dbName='" + dbName + '\'' +
                ", dbType='" + dbType + '\'' +
                ", tableName='" + tableName + '\'' +
                ", tableNameCn='" + tableNameCn + '\'' +
                '}';
    }
}
