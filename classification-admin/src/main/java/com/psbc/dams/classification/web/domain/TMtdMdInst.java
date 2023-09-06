package com.psbc.dams.classification.web.domain;

import com.psbc.dams.classification.common.annotation.Excel;
import com.psbc.dams.classification.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 【请填写功能名称】对象 t_mtd_md_inst
 * 
 * @author classification
 * @date 2023-07-24
 */
public class TMtdMdInst extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String instId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String clsId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String supInstId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dsId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String instCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String instName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String instPath;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private long verNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date effTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String createUser;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String deptId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String schemaInstId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String instPathName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String blgEnviron;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sysCd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String projId;

    public void setInstId(String instId) 
    {
        this.instId = instId;
    }

    public String getInstId() 
    {
        return instId;
    }
    public void setClsId(String clsId) 
    {
        this.clsId = clsId;
    }

    public String getClsId() 
    {
        return clsId;
    }
    public void setSupInstId(String supInstId) 
    {
        this.supInstId = supInstId;
    }

    public String getSupInstId() 
    {
        return supInstId;
    }
    public void setDsId(String dsId) 
    {
        this.dsId = dsId;
    }

    public String getDsId() 
    {
        return dsId;
    }
    public void setInstCode(String instCode) 
    {
        this.instCode = instCode;
    }

    public String getInstCode() 
    {
        return instCode;
    }
    public void setInstName(String instName) 
    {
        this.instName = instName;
    }

    public String getInstName() 
    {
        return instName;
    }
    public void setInstPath(String instPath) 
    {
        this.instPath = instPath;
    }

    public String getInstPath() 
    {
        return instPath;
    }
    public void setVerNo(long verNo)
    {
        this.verNo = verNo;
    }

    public long getVerNo()
    {
        return verNo;
    }
    public void setEffTime(Date effTime)
    {
        this.effTime = effTime;
    }

    public Date getEffTime()
    {
        return effTime;
    }
    public void setCreateUser(String createUser) 
    {
        this.createUser = createUser;
    }

    public String getCreateUser() 
    {
        return createUser;
    }
    public void setDeptId(String deptId) 
    {
        this.deptId = deptId;
    }

    public String getDeptId() 
    {
        return deptId;
    }
    public void setSchemaInstId(String schemaInstId) 
    {
        this.schemaInstId = schemaInstId;
    }

    public String getSchemaInstId() 
    {
        return schemaInstId;
    }
    public void setInstPathName(String instPathName) 
    {
        this.instPathName = instPathName;
    }

    public String getInstPathName() 
    {
        return instPathName;
    }
    public void setBlgEnviron(String blgEnviron) 
    {
        this.blgEnviron = blgEnviron;
    }

    public String getBlgEnviron() 
    {
        return blgEnviron;
    }
    public void setSysCd(String sysCd) 
    {
        this.sysCd = sysCd;
    }

    public String getSysCd() 
    {
        return sysCd;
    }
    public void setProjId(String projId) 
    {
        this.projId = projId;
    }

    public String getProjId() 
    {
        return projId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("instId", getInstId())
            .append("clsId", getClsId())
            .append("supInstId", getSupInstId())
            .append("dsId", getDsId())
            .append("instCode", getInstCode())
            .append("instName", getInstName())
            .append("instPath", getInstPath())
            .append("verNo", getVerNo())
            .append("effTime", getEffTime())
            .append("createUser", getCreateUser())
            .append("deptId", getDeptId())
            .append("schemaInstId", getSchemaInstId())
            .append("instPathName", getInstPathName())
            .append("blgEnviron", getBlgEnviron())
            .append("sysCd", getSysCd())
            .append("projId", getProjId())
            .toString();
    }
}
