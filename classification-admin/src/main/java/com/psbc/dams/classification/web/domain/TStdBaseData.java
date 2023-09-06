package com.psbc.dams.classification.web.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.psbc.dams.classification.common.annotation.Excel;
import com.psbc.dams.classification.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 基础数据规范对象 t_std_base_data
 * 
 * @author classification
 * @date 2023-07-25
 */
public class TStdBaseData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 标准编号 */
    private String stdNo;

    /** 主题编号 */
    @Excel(name = "主题编号")
    private String topicNo;

    /** 所属分类1 */
    @Excel(name = "所属分类1")
    private String blgCls1;

    /** 所属分类2 */
    @Excel(name = "所属分类2")
    private String blgCls2;

    /** 所属分类3 */
    @Excel(name = "所属分类3")
    private String blgCls3;

    /** 所属分类4 */
    @Excel(name = "所属分类4")
    private String blgCls4;

    /** 所属分类5 */
    @Excel(name = "所属分类5")
    private String blgCls5;

    /** 中文名称 */
    private String stdCnName;

    /** 英文名称 */
    @Excel(name = "英文名称")
    private String stdEnName;

    /** 标准说明 */
    @Excel(name = "标准说明")
    private String stdDesc;

    /** 标准状态:01新建，02待发布，03已发布，04已废止 */
    @Excel(name = "标准状态:01新建，02待发布，03已发布，04已废止")
    private String stdSta;

    /** 数据类型 */
    @Excel(name = "数据类型")
    private String dataType;

    /** 数据长度 */
    @Excel(name = "数据长度")
    private String dataLen;

    /** 数据格式 */
    @Excel(name = "数据格式")
    private String dataFmt;

    /** 小数位 */
    @Excel(name = "小数位")
    private String dataDecimalBit;

    /** 业务含义 */
    @Excel(name = "业务含义")
    private String busiMeaning;

    /** 业务主管部门 */
    @Excel(name = "业务主管部门")
    private String busiMgrDept;

    /** 协管部门 */
    @Excel(name = "协管部门")
    private String assitDept;

    /** 引用公共代码 */
    @Excel(name = "引用公共代码")
    private String quotePubCd;

    /** 制定依据 */
    @Excel(name = "制定依据")
    private String formuateAccord;

    /** 指定依据说明 */
    @Excel(name = "指定依据说明")
    private String formuateAccordDesc;

    /** 创建用户 */
    @Excel(name = "创建用户")
    private String createUser;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date bgnTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date issuTime;

    /** 失效时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "失效时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date invalidTime;

    /** 标准版本号 */
    @Excel(name = "标准版本号")
    private String stdVerNo;

    /** 版本号 */
    @Excel(name = "版本号")
    private String verNo;

    /** 标准别名 */
    @Excel(name = "标准别名")
    private String stdAlias;

    /** 代码编码规则 */
    @Excel(name = "代码编码规则")
    private String cdNoRule;

    /** 访问次数 */
    @Excel(name = "访问次数")
    private String accessTimes;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String chgReason;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String alshReason;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String relateStd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String relateStdRelat;

    public void setStdNo(String stdNo) 
    {
        this.stdNo = stdNo;
    }

    public String getStdNo() 
    {
        return stdNo;
    }
    public void setTopicNo(String topicNo) 
    {
        this.topicNo = topicNo;
    }

    public String getTopicNo() 
    {
        return topicNo;
    }
    public void setBlgCls1(String blgCls1) 
    {
        this.blgCls1 = blgCls1;
    }

    public String getBlgCls1() 
    {
        return blgCls1;
    }
    public void setBlgCls2(String blgCls2) 
    {
        this.blgCls2 = blgCls2;
    }

    public String getBlgCls2() 
    {
        return blgCls2;
    }
    public void setBlgCls3(String blgCls3) 
    {
        this.blgCls3 = blgCls3;
    }

    public String getBlgCls3() 
    {
        return blgCls3;
    }
    public void setBlgCls4(String blgCls4) 
    {
        this.blgCls4 = blgCls4;
    }

    public String getBlgCls4() 
    {
        return blgCls4;
    }
    public void setBlgCls5(String blgCls5) 
    {
        this.blgCls5 = blgCls5;
    }

    public String getBlgCls5() 
    {
        return blgCls5;
    }
    public void setStdCnName(String stdCnName) 
    {
        this.stdCnName = stdCnName;
    }

    public String getStdCnName() 
    {
        return stdCnName;
    }
    public void setStdEnName(String stdEnName) 
    {
        this.stdEnName = stdEnName;
    }

    public String getStdEnName() 
    {
        return stdEnName;
    }
    public void setStdDesc(String stdDesc) 
    {
        this.stdDesc = stdDesc;
    }

    public String getStdDesc() 
    {
        return stdDesc;
    }
    public void setStdSta(String stdSta) 
    {
        this.stdSta = stdSta;
    }

    public String getStdSta() 
    {
        return stdSta;
    }
    public void setDataType(String dataType) 
    {
        this.dataType = dataType;
    }

    public String getDataType() 
    {
        return dataType;
    }
    public void setDataLen(String dataLen) 
    {
        this.dataLen = dataLen;
    }

    public String getDataLen() 
    {
        return dataLen;
    }
    public void setDataFmt(String dataFmt) 
    {
        this.dataFmt = dataFmt;
    }

    public String getDataFmt() 
    {
        return dataFmt;
    }
    public void setDataDecimalBit(String dataDecimalBit) 
    {
        this.dataDecimalBit = dataDecimalBit;
    }

    public String getDataDecimalBit() 
    {
        return dataDecimalBit;
    }
    public void setBusiMeaning(String busiMeaning) 
    {
        this.busiMeaning = busiMeaning;
    }

    public String getBusiMeaning() 
    {
        return busiMeaning;
    }
    public void setBusiMgrDept(String busiMgrDept) 
    {
        this.busiMgrDept = busiMgrDept;
    }

    public String getBusiMgrDept() 
    {
        return busiMgrDept;
    }
    public void setAssitDept(String assitDept) 
    {
        this.assitDept = assitDept;
    }

    public String getAssitDept() 
    {
        return assitDept;
    }
    public void setQuotePubCd(String quotePubCd) 
    {
        this.quotePubCd = quotePubCd;
    }

    public String getQuotePubCd() 
    {
        return quotePubCd;
    }
    public void setFormuateAccord(String formuateAccord) 
    {
        this.formuateAccord = formuateAccord;
    }

    public String getFormuateAccord() 
    {
        return formuateAccord;
    }
    public void setFormuateAccordDesc(String formuateAccordDesc) 
    {
        this.formuateAccordDesc = formuateAccordDesc;
    }

    public String getFormuateAccordDesc() 
    {
        return formuateAccordDesc;
    }
    public void setCreateUser(String createUser) 
    {
        this.createUser = createUser;
    }

    public String getCreateUser() 
    {
        return createUser;
    }
    public void setBgnTime(Date bgnTime) 
    {
        this.bgnTime = bgnTime;
    }

    public Date getBgnTime() 
    {
        return bgnTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setIssuTime(Date issuTime) 
    {
        this.issuTime = issuTime;
    }

    public Date getIssuTime() 
    {
        return issuTime;
    }
    public void setInvalidTime(Date invalidTime) 
    {
        this.invalidTime = invalidTime;
    }

    public Date getInvalidTime() 
    {
        return invalidTime;
    }
    public void setStdVerNo(String stdVerNo) 
    {
        this.stdVerNo = stdVerNo;
    }

    public String getStdVerNo() 
    {
        return stdVerNo;
    }
    public void setVerNo(String verNo) 
    {
        this.verNo = verNo;
    }

    public String getVerNo() 
    {
        return verNo;
    }
    public void setStdAlias(String stdAlias) 
    {
        this.stdAlias = stdAlias;
    }

    public String getStdAlias() 
    {
        return stdAlias;
    }
    public void setCdNoRule(String cdNoRule) 
    {
        this.cdNoRule = cdNoRule;
    }

    public String getCdNoRule() 
    {
        return cdNoRule;
    }
    public void setAccessTimes(String accessTimes) 
    {
        this.accessTimes = accessTimes;
    }

    public String getAccessTimes() 
    {
        return accessTimes;
    }
    public void setChgReason(String chgReason) 
    {
        this.chgReason = chgReason;
    }

    public String getChgReason() 
    {
        return chgReason;
    }
    public void setAlshReason(String alshReason) 
    {
        this.alshReason = alshReason;
    }

    public String getAlshReason() 
    {
        return alshReason;
    }
    public void setRelateStd(String relateStd) 
    {
        this.relateStd = relateStd;
    }

    public String getRelateStd() 
    {
        return relateStd;
    }
    public void setRelateStdRelat(String relateStdRelat) 
    {
        this.relateStdRelat = relateStdRelat;
    }

    public String getRelateStdRelat() 
    {
        return relateStdRelat;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("stdNo", getStdNo())
            .append("topicNo", getTopicNo())
            .append("blgCls1", getBlgCls1())
            .append("blgCls2", getBlgCls2())
            .append("blgCls3", getBlgCls3())
            .append("blgCls4", getBlgCls4())
            .append("blgCls5", getBlgCls5())
            .append("stdCnName", getStdCnName())
            .append("stdEnName", getStdEnName())
            .append("stdDesc", getStdDesc())
            .append("stdSta", getStdSta())
            .append("dataType", getDataType())
            .append("dataLen", getDataLen())
            .append("dataFmt", getDataFmt())
            .append("dataDecimalBit", getDataDecimalBit())
            .append("busiMeaning", getBusiMeaning())
            .append("busiMgrDept", getBusiMgrDept())
            .append("assitDept", getAssitDept())
            .append("quotePubCd", getQuotePubCd())
            .append("formuateAccord", getFormuateAccord())
            .append("formuateAccordDesc", getFormuateAccordDesc())
            .append("createUser", getCreateUser())
            .append("bgnTime", getBgnTime())
            .append("endTime", getEndTime())
            .append("issuTime", getIssuTime())
            .append("invalidTime", getInvalidTime())
            .append("stdVerNo", getStdVerNo())
            .append("verNo", getVerNo())
            .append("stdAlias", getStdAlias())
            .append("cdNoRule", getCdNoRule())
            .append("accessTimes", getAccessTimes())
            .append("chgReason", getChgReason())
            .append("alshReason", getAlshReason())
            .append("relateStd", getRelateStd())
            .append("relateStdRelat", getRelateStdRelat())
            .toString();
    }
}
