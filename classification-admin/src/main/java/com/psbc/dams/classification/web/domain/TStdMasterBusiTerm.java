package com.psbc.dams.classification.web.domain;

import com.psbc.dams.classification.common.annotation.Excel;
import com.psbc.dams.classification.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 业务术语信息对象 t_std_master_busi_term
 * 
 * @author classification
 * @date 2023-07-25
 */
public class TStdMasterBusiTerm extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 术语编号 */
    private String termNo;

    /** 所属主题 */
    @Excel(name = "所属主题")
    private String blgTopic;

    /** 术语名称 */
    @Excel(name = "术语名称")
    private String termName;

    /** 术语来源 */
    @Excel(name = "术语来源")
    private String termSource;

    /** 业务部门 */
    @Excel(name = "业务部门")
    private String busiDept;

    /** 业务定义 */
    @Excel(name = "业务定义")
    private String busiDefine;

    /** 创建用户 */
    @Excel(name = "创建用户")
    private String createUser;

    /** 备用字段1 */
    @Excel(name = "备用字段1")
    private String bkupField1;

    /** 备用字段2 */
    @Excel(name = "备用字段2")
    private String bkupField2;

    /** 备用字段3 */
    @Excel(name = "备用字段3")
    private String bkupField3;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String termAliasName;

    public void setTermNo(String termNo) 
    {
        this.termNo = termNo;
    }

    public String getTermNo() 
    {
        return termNo;
    }
    public void setBlgTopic(String blgTopic) 
    {
        this.blgTopic = blgTopic;
    }

    public String getBlgTopic() 
    {
        return blgTopic;
    }
    public void setTermName(String termName) 
    {
        this.termName = termName;
    }

    public String getTermName() 
    {
        return termName;
    }
    public void setTermSource(String termSource) 
    {
        this.termSource = termSource;
    }

    public String getTermSource() 
    {
        return termSource;
    }
    public void setBusiDept(String busiDept) 
    {
        this.busiDept = busiDept;
    }

    public String getBusiDept() 
    {
        return busiDept;
    }
    public void setBusiDefine(String busiDefine) 
    {
        this.busiDefine = busiDefine;
    }

    public String getBusiDefine() 
    {
        return busiDefine;
    }
    public void setCreateUser(String createUser) 
    {
        this.createUser = createUser;
    }

    public String getCreateUser() 
    {
        return createUser;
    }
    public void setBkupField1(String bkupField1) 
    {
        this.bkupField1 = bkupField1;
    }

    public String getBkupField1() 
    {
        return bkupField1;
    }
    public void setBkupField2(String bkupField2) 
    {
        this.bkupField2 = bkupField2;
    }

    public String getBkupField2() 
    {
        return bkupField2;
    }
    public void setBkupField3(String bkupField3) 
    {
        this.bkupField3 = bkupField3;
    }

    public String getBkupField3() 
    {
        return bkupField3;
    }
    public void setTermAliasName(String termAliasName) 
    {
        this.termAliasName = termAliasName;
    }

    public String getTermAliasName() 
    {
        return termAliasName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("termNo", getTermNo())
            .append("blgTopic", getBlgTopic())
            .append("termName", getTermName())
            .append("termSource", getTermSource())
            .append("busiDept", getBusiDept())
            .append("busiDefine", getBusiDefine())
            .append("createUser", getCreateUser())
            .append("createTime", getCreateTime())
            .append("bkupField1", getBkupField1())
            .append("bkupField2", getBkupField2())
            .append("bkupField3", getBkupField3())
            .append("termAliasName", getTermAliasName())
            .append("remark", getRemark())
            .toString();
    }
}
