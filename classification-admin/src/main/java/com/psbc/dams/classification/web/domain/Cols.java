package com.psbc.dams.classification.web.domain;

import java.util.List;

public class Cols {

    private String classification1;
    private String classification2;
    private String classification3;
    private String classification4;
    private String colComment;
    private String colName;
    private String colnamecn;
    private List<String> depts;
    private String entDictCode;
    private String level;
    private String projectName;
    private String remark;

    public String getClassification1() {
        return classification1;
    }

    public void setClassification1(String classification1) {
        this.classification1 = classification1;
    }

    public String getClassification2() {
        return classification2;
    }

    public void setClassification2(String classification2) {
        this.classification2 = classification2;
    }

    public String getClassification3() {
        return classification3;
    }

    public void setClassification3(String classification3) {
        this.classification3 = classification3;
    }

    public String getClassification4() {
        return classification4;
    }

    public void setClassification4(String classification4) {
        this.classification4 = classification4;
    }

    public String getColComment() {
        return colComment;
    }

    public void setColComment(String colComment) {
        this.colComment = colComment;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public String getColnamecn() {
        return colnamecn;
    }

    public void setColnamecn(String colnamecn) {
        this.colnamecn = colnamecn;
    }

    public List<String> getDepts() {
        return depts;
    }

    public void setDepts(List<String> depts) {
        this.depts = depts;
    }

    public String getEntDictCode() {
        return entDictCode;
    }

    public void setEntDictCode(String entDictCode) {
        this.entDictCode = entDictCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Cols{" +
                "classification1='" + classification1 + '\'' +
                ", classification2='" + classification2 + '\'' +
                ", classification3='" + classification3 + '\'' +
                ", classification4='" + classification4 + '\'' +
                ", colComment='" + colComment + '\'' +
                ", colName='" + colName + '\'' +
                ", colnamecn='" + colnamecn + '\'' +
                ", depts=" + depts +
                ", entDictCode='" + entDictCode + '\'' +
                ", level='" + level + '\'' +
                ", projectName='" + projectName + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
