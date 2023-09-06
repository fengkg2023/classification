package com.psbc.dams.classification.web.domain;

import com.psbc.dams.classification.common.annotation.Excel;

import javax.validation.constraints.NotBlank;

public class SummaryDataCollect {

    private static final long serialVersionUID = 1L;

    @Excel(name = "序号",cellType = Excel.ColumnType.STRING)
    private Long id;
    @NotBlank
    @Excel(name = "工程名称（必填）",cellType = Excel.ColumnType.STRING)
    private String projectName;
    @Excel(name = "数据类型（必填）",cellType = Excel.ColumnType.STRING)
    private String dataType;
    @NotBlank
    @Excel(name = "数据库英文名（必填）",cellType = Excel.ColumnType.STRING)
    private String databaseEnglish;
    @NotBlank
    @Excel(name = "表英文名（必填）",cellType = Excel.ColumnType.STRING)
    private String tableEnglish;
    @Excel(name = "表中文名（必填）",cellType = Excel.ColumnType.STRING)
    private String tableChinese;
    @NotBlank
    @Excel(name = "字段英文名（必填）",cellType = Excel.ColumnType.STRING)
    private String fieldEnglish;
    @Excel(name = "字段中文名（必填）",cellType = Excel.ColumnType.STRING)
    private String fieldChinese;
    @NotBlank
    @Excel(name = "字段含义（必填）",cellType = Excel.ColumnType.STRING)
    private String fieldMean;
    @Excel(name = "企业级数据字典表号（6位）",cellType = Excel.ColumnType.STRING)
    private String enterpriseDataDictionary;
    @Excel(name = "数据安全一级子类",cellType = Excel.ColumnType.STRING)
    private String result1;
    @Excel(name = "数据安全二级子类",cellType = Excel.ColumnType.STRING)
    private String result2;
    @Excel(name = "数据安全三级子类",cellType = Excel.ColumnType.STRING)
    private String result3;
    @Excel(name = "数据安全四级子类",cellType = Excel.ColumnType.STRING)
    private String result4;
    @Excel(name = "数据安全级别",cellType = Excel.ColumnType.STRING)
    private String resultLevel;
    @Excel(name = "牵头业务部门（必填）",cellType = Excel.ColumnType.STRING)
    private String businessUnit;
    @Excel(name = "备注",cellType = Excel.ColumnType.STRING)
    private String remark;
    @Excel(name = "是否已确认",cellType = Excel.ColumnType.STRING)
    private String confirm;
    @Excel(name = "确认人",cellType = Excel.ColumnType.STRING)
    private String confirmor;

    private int status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDatabaseEnglish() {
        return databaseEnglish;
    }

    public void setDatabaseEnglish(String databaseEnglish) {
        this.databaseEnglish = databaseEnglish;
    }

    public String getTableEnglish() {
        return tableEnglish;
    }

    public void setTableEnglish(String tableEnglish) {
        this.tableEnglish = tableEnglish;
    }

    public String getTableChinese() {
        return tableChinese;
    }

    public void setTableChinese(String tableChinese) {
        this.tableChinese = tableChinese;
    }

    public String getFieldEnglish() {
        return fieldEnglish;
    }

    public void setFieldEnglish(String fieldEnglish) {
        this.fieldEnglish = fieldEnglish;
    }

    public String getFieldChinese() {
        return fieldChinese;
    }

    public void setFieldChinese(String fieldChinese) {
        this.fieldChinese = fieldChinese;
    }

    public String getFieldMean() {
        return fieldMean;
    }

    public void setFieldMean(String fieldMean) {
        this.fieldMean = fieldMean;
    }

    public String getEnterpriseDataDictionary() {
        return enterpriseDataDictionary;
    }

    public void setEnterpriseDataDictionary(String enterpriseDataDictionary) {
        this.enterpriseDataDictionary = enterpriseDataDictionary;
    }

    public String getResult1() {
        return result1;
    }

    public void setResult1(String result1) {
        this.result1 = result1;
    }

    public String getResult2() {
        return result2;
    }

    public void setResult2(String result2) {
        this.result2 = result2;
    }

    public String getResult3() {
        return result3;
    }

    public void setResult3(String result3) {
        this.result3 = result3;
    }

    public String getResult4() {
        return result4;
    }

    public void setResult4(String result4) {
        this.result4 = result4;
    }

    public String getResultLevel() {
        return resultLevel;
    }

    public void setResultLevel(String resultLevel) {
        this.resultLevel = resultLevel;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String isConfirm) {
        this.confirm = confirm;
    }

    public String getConfirmor() {
        return confirmor;
    }

    public void setConfirmor(String confirmor) {
        this.confirmor = confirmor;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SummaryDataCollect{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", dataType='" + dataType + '\'' +
                ", databaseEnglish='" + databaseEnglish + '\'' +
                ", tableEnglish='" + tableEnglish + '\'' +
                ", tableChinese='" + tableChinese + '\'' +
                ", fieldEnglish='" + fieldEnglish + '\'' +
                ", fieldChinese='" + fieldChinese + '\'' +
                ", fieldMean='" + fieldMean + '\'' +
                ", enterpriseDataDictionary='" + enterpriseDataDictionary + '\'' +
                ", result1='" + result1 + '\'' +
                ", result2='" + result2 + '\'' +
                ", result3='" + result3 + '\'' +
                ", result4='" + result4 + '\'' +
                ", resultLevel='" + resultLevel + '\'' +
                ", businessUnit='" + businessUnit + '\'' +
                ", remark='" + remark + '\'' +
                ", confirm='" + confirm + '\'' +
                ", confirmor='" + confirmor + '\'' +
                ", status=" + status +
                '}';
    }
}
