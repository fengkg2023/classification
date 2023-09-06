package com.psbc.dams.classification.web.domain;

import com.psbc.dams.classification.common.annotation.Excel;
import com.psbc.dams.classification.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 字典对象 t_dic_data_item
 * 
 * @author classification
 * @date 2023-07-25
 */
public class TDicDataItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dataItemId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dataItemNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String infoBigClass;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String infoSmallClass;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dataItemClass;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String nameCn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String nameEn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String nameEns;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String busiMeaning;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String busiValScope;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String busiRule;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String busiScene;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String busiDimension;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String clangNameRule;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String javaNameRule;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String busiSource;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String busiStdNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String techDomainNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String differHash;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String domainId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String regSys;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String source;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String clsWordCheckFlagCd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String auditor;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String domainDifferHash;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String codeDifferHash;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contacter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contTel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private int verIdNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private int innerVerNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String operator;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date updTime;

    /** $column.columnComment */
    private String delFlag;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String regSysNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String regProj;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String regProjNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String reason;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String operatorId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String auditorId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String contacterId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String applicant;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String applicantId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String inputChannel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String modContentDesc;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String suggNameCn;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String staCd;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String infoSmallClassId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String sourceId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String recFlag;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkExceptionFlag;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkState;

    /** 质量规则编号 */
    @Excel(name = "质量规则编号")
    private String dtqRuleNo;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String elementId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String modelId;

    /** 安全分类编号 */
    @Excel(name = "安全分类编号")
    private String dataSafeClsNo;

    /** 数据安全一级分类 */
    @Excel(name = "数据安全一级分类")
    private String dataSafeLvl1Cls;

    /** 数据安全二级分类 */
    @Excel(name = "数据安全二级分类")
    private String dataSafeLvl2Cls;

    /** 数据安全三级分类 */
    @Excel(name = "数据安全三级分类")
    private String dataSafeLvl3Cls;

    /** 数据安全四级分类 */
    @Excel(name = "数据安全四级分类")
    private String dataSafeLvl4Cls;

    /** 数据安全等级 */
    @Excel(name = "数据安全等级")
    private String dataSafeLvl;

    /** 安全信息来源系统 */
    @Excel(name = "安全信息来源系统")
    private String safeInfoSrcSys;

    /** 安全信息备注 */
    @Excel(name = "安全信息备注")
    private String safeInfoRemark;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private int checkVersion;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String checkMsg;

    public void setDataItemId(String dataItemId) 
    {
        this.dataItemId = dataItemId;
    }

    public String getDataItemId() 
    {
        return dataItemId;
    }
    public void setDataItemNo(String dataItemNo) 
    {
        this.dataItemNo = dataItemNo;
    }

    public String getDataItemNo() 
    {
        return dataItemNo;
    }
    public void setInfoBigClass(String infoBigClass) 
    {
        this.infoBigClass = infoBigClass;
    }

    public String getInfoBigClass() 
    {
        return infoBigClass;
    }
    public void setInfoSmallClass(String infoSmallClass) 
    {
        this.infoSmallClass = infoSmallClass;
    }

    public String getInfoSmallClass() 
    {
        return infoSmallClass;
    }
    public void setDataItemClass(String dataItemClass) 
    {
        this.dataItemClass = dataItemClass;
    }

    public String getDataItemClass() 
    {
        return dataItemClass;
    }
    public void setNameCn(String nameCn) 
    {
        this.nameCn = nameCn;
    }

    public String getNameCn() 
    {
        return nameCn;
    }
    public void setNameEn(String nameEn) 
    {
        this.nameEn = nameEn;
    }

    public String getNameEn() 
    {
        return nameEn;
    }
    public void setNameEns(String nameEns) 
    {
        this.nameEns = nameEns;
    }

    public String getNameEns() 
    {
        return nameEns;
    }
    public void setBusiMeaning(String busiMeaning) 
    {
        this.busiMeaning = busiMeaning;
    }

    public String getBusiMeaning() 
    {
        return busiMeaning;
    }
    public void setBusiValScope(String busiValScope) 
    {
        this.busiValScope = busiValScope;
    }

    public String getBusiValScope() 
    {
        return busiValScope;
    }
    public void setBusiRule(String busiRule) 
    {
        this.busiRule = busiRule;
    }

    public String getBusiRule() 
    {
        return busiRule;
    }
    public void setBusiScene(String busiScene) 
    {
        this.busiScene = busiScene;
    }

    public String getBusiScene() 
    {
        return busiScene;
    }
    public void setBusiDimension(String busiDimension) 
    {
        this.busiDimension = busiDimension;
    }

    public String getBusiDimension() 
    {
        return busiDimension;
    }
    public void setClangNameRule(String clangNameRule) 
    {
        this.clangNameRule = clangNameRule;
    }

    public String getClangNameRule() 
    {
        return clangNameRule;
    }
    public void setJavaNameRule(String javaNameRule) 
    {
        this.javaNameRule = javaNameRule;
    }

    public String getJavaNameRule() 
    {
        return javaNameRule;
    }
    public void setBusiSource(String busiSource) 
    {
        this.busiSource = busiSource;
    }

    public String getBusiSource() 
    {
        return busiSource;
    }
    public void setBusiStdNo(String busiStdNo) 
    {
        this.busiStdNo = busiStdNo;
    }

    public String getBusiStdNo() 
    {
        return busiStdNo;
    }
    public void setTechDomainNo(String techDomainNo) 
    {
        this.techDomainNo = techDomainNo;
    }

    public String getTechDomainNo() 
    {
        return techDomainNo;
    }
    public void setDifferHash(String differHash) 
    {
        this.differHash = differHash;
    }

    public String getDifferHash() 
    {
        return differHash;
    }
    public void setDomainId(String domainId) 
    {
        this.domainId = domainId;
    }

    public String getDomainId() 
    {
        return domainId;
    }
    public void setRegSys(String regSys) 
    {
        this.regSys = regSys;
    }

    public String getRegSys() 
    {
        return regSys;
    }
    public void setSource(String source) 
    {
        this.source = source;
    }

    public String getSource() 
    {
        return source;
    }
    public void setClsWordCheckFlagCd(String clsWordCheckFlagCd) 
    {
        this.clsWordCheckFlagCd = clsWordCheckFlagCd;
    }

    public String getClsWordCheckFlagCd() 
    {
        return clsWordCheckFlagCd;
    }
    public void setAuditor(String auditor) 
    {
        this.auditor = auditor;
    }

    public String getAuditor() 
    {
        return auditor;
    }
    public void setDomainDifferHash(String domainDifferHash) 
    {
        this.domainDifferHash = domainDifferHash;
    }

    public String getDomainDifferHash() 
    {
        return domainDifferHash;
    }
    public void setCodeDifferHash(String codeDifferHash) 
    {
        this.codeDifferHash = codeDifferHash;
    }

    public String getCodeDifferHash() 
    {
        return codeDifferHash;
    }
    public void setContacter(String contacter) 
    {
        this.contacter = contacter;
    }

    public String getContacter() 
    {
        return contacter;
    }
    public void setContTel(String contTel) 
    {
        this.contTel = contTel;
    }

    public String getContTel() 
    {
        return contTel;
    }
    public void setVerIdNo(int verIdNo)
    {
        this.verIdNo = verIdNo;
    }

    public int getVerIdNo()
    {
        return verIdNo;
    }
    public void setInnerVerNo(int innerVerNo)
    {
        this.innerVerNo = innerVerNo;
    }

    public int getInnerVerNo()
    {
        return innerVerNo;
    }
    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }
    public void setUpdTime(Date updTime) 
    {
        this.updTime = updTime;
    }

    public Date getUpdTime() 
    {
        return updTime;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setRegSysNo(String regSysNo) 
    {
        this.regSysNo = regSysNo;
    }

    public String getRegSysNo() 
    {
        return regSysNo;
    }
    public void setRegProj(String regProj) 
    {
        this.regProj = regProj;
    }

    public String getRegProj() 
    {
        return regProj;
    }
    public void setRegProjNo(String regProjNo) 
    {
        this.regProjNo = regProjNo;
    }

    public String getRegProjNo() 
    {
        return regProjNo;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }
    public void setOperatorId(String operatorId) 
    {
        this.operatorId = operatorId;
    }

    public String getOperatorId() 
    {
        return operatorId;
    }
    public void setAuditorId(String auditorId) 
    {
        this.auditorId = auditorId;
    }

    public String getAuditorId() 
    {
        return auditorId;
    }
    public void setContacterId(String contacterId) 
    {
        this.contacterId = contacterId;
    }

    public String getContacterId() 
    {
        return contacterId;
    }
    public void setApplicant(String applicant) 
    {
        this.applicant = applicant;
    }

    public String getApplicant() 
    {
        return applicant;
    }
    public void setApplicantId(String applicantId) 
    {
        this.applicantId = applicantId;
    }

    public String getApplicantId() 
    {
        return applicantId;
    }
    public void setInputChannel(String inputChannel) 
    {
        this.inputChannel = inputChannel;
    }

    public String getInputChannel() 
    {
        return inputChannel;
    }
    public void setModContentDesc(String modContentDesc) 
    {
        this.modContentDesc = modContentDesc;
    }

    public String getModContentDesc() 
    {
        return modContentDesc;
    }
    public void setSuggNameCn(String suggNameCn) 
    {
        this.suggNameCn = suggNameCn;
    }

    public String getSuggNameCn() 
    {
        return suggNameCn;
    }
    public void setStaCd(String staCd) 
    {
        this.staCd = staCd;
    }

    public String getStaCd() 
    {
        return staCd;
    }
    public void setInfoSmallClassId(String infoSmallClassId) 
    {
        this.infoSmallClassId = infoSmallClassId;
    }

    public String getInfoSmallClassId() 
    {
        return infoSmallClassId;
    }
    public void setSourceId(String sourceId) 
    {
        this.sourceId = sourceId;
    }

    public String getSourceId() 
    {
        return sourceId;
    }
    public void setRecFlag(String recFlag) 
    {
        this.recFlag = recFlag;
    }

    public String getRecFlag() 
    {
        return recFlag;
    }
    public void setCheckExceptionFlag(String checkExceptionFlag) 
    {
        this.checkExceptionFlag = checkExceptionFlag;
    }

    public String getCheckExceptionFlag() 
    {
        return checkExceptionFlag;
    }
    public void setCheckState(String checkState) 
    {
        this.checkState = checkState;
    }

    public String getCheckState() 
    {
        return checkState;
    }
    public void setDtqRuleNo(String dtqRuleNo) 
    {
        this.dtqRuleNo = dtqRuleNo;
    }

    public String getDtqRuleNo() 
    {
        return dtqRuleNo;
    }
    public void setElementId(String elementId) 
    {
        this.elementId = elementId;
    }

    public String getElementId() 
    {
        return elementId;
    }
    public void setModelId(String modelId) 
    {
        this.modelId = modelId;
    }

    public String getModelId() 
    {
        return modelId;
    }
    public void setDataSafeClsNo(String dataSafeClsNo) 
    {
        this.dataSafeClsNo = dataSafeClsNo;
    }

    public String getDataSafeClsNo() 
    {
        return dataSafeClsNo;
    }
    public void setDataSafeLvl1Cls(String dataSafeLvl1Cls) 
    {
        this.dataSafeLvl1Cls = dataSafeLvl1Cls;
    }

    public String getDataSafeLvl1Cls() 
    {
        return dataSafeLvl1Cls;
    }
    public void setDataSafeLvl2Cls(String dataSafeLvl2Cls) 
    {
        this.dataSafeLvl2Cls = dataSafeLvl2Cls;
    }

    public String getDataSafeLvl2Cls() 
    {
        return dataSafeLvl2Cls;
    }
    public void setDataSafeLvl3Cls(String dataSafeLvl3Cls) 
    {
        this.dataSafeLvl3Cls = dataSafeLvl3Cls;
    }

    public String getDataSafeLvl3Cls() 
    {
        return dataSafeLvl3Cls;
    }
    public void setDataSafeLvl4Cls(String dataSafeLvl4Cls) 
    {
        this.dataSafeLvl4Cls = dataSafeLvl4Cls;
    }

    public String getDataSafeLvl4Cls() 
    {
        return dataSafeLvl4Cls;
    }
    public void setDataSafeLvl(String dataSafeLvl) 
    {
        this.dataSafeLvl = dataSafeLvl;
    }

    public String getDataSafeLvl() 
    {
        return dataSafeLvl;
    }
    public void setSafeInfoSrcSys(String safeInfoSrcSys) 
    {
        this.safeInfoSrcSys = safeInfoSrcSys;
    }

    public String getSafeInfoSrcSys() 
    {
        return safeInfoSrcSys;
    }
    public void setSafeInfoRemark(String safeInfoRemark) 
    {
        this.safeInfoRemark = safeInfoRemark;
    }

    public String getSafeInfoRemark() 
    {
        return safeInfoRemark;
    }
    public void setCheckVersion(int checkVersion)
    {
        this.checkVersion = checkVersion;
    }

    public int getCheckVersion()
    {
        return checkVersion;
    }
    public void setCheckMsg(String checkMsg) 
    {
        this.checkMsg = checkMsg;
    }

    public String getCheckMsg() 
    {
        return checkMsg;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("dataItemId", getDataItemId())
            .append("dataItemNo", getDataItemNo())
            .append("infoBigClass", getInfoBigClass())
            .append("infoSmallClass", getInfoSmallClass())
            .append("dataItemClass", getDataItemClass())
            .append("nameCn", getNameCn())
            .append("nameEn", getNameEn())
            .append("nameEns", getNameEns())
            .append("busiMeaning", getBusiMeaning())
            .append("busiValScope", getBusiValScope())
            .append("busiRule", getBusiRule())
            .append("busiScene", getBusiScene())
            .append("busiDimension", getBusiDimension())
            .append("clangNameRule", getClangNameRule())
            .append("javaNameRule", getJavaNameRule())
            .append("busiSource", getBusiSource())
            .append("busiStdNo", getBusiStdNo())
            .append("techDomainNo", getTechDomainNo())
            .append("differHash", getDifferHash())
            .append("domainId", getDomainId())
            .append("regSys", getRegSys())
            .append("source", getSource())
            .append("remark", getRemark())
            .append("clsWordCheckFlagCd", getClsWordCheckFlagCd())
            .append("auditor", getAuditor())
            .append("domainDifferHash", getDomainDifferHash())
            .append("codeDifferHash", getCodeDifferHash())
            .append("contacter", getContacter())
            .append("contTel", getContTel())
            .append("verIdNo", getVerIdNo())
            .append("innerVerNo", getInnerVerNo())
            .append("operator", getOperator())
            .append("createTime", getCreateTime())
            .append("updTime", getUpdTime())
            .append("delFlag", getDelFlag())
            .append("regSysNo", getRegSysNo())
            .append("regProj", getRegProj())
            .append("regProjNo", getRegProjNo())
            .append("reason", getReason())
            .append("operatorId", getOperatorId())
            .append("auditorId", getAuditorId())
            .append("contacterId", getContacterId())
            .append("applicant", getApplicant())
            .append("applicantId", getApplicantId())
            .append("inputChannel", getInputChannel())
            .append("modContentDesc", getModContentDesc())
            .append("suggNameCn", getSuggNameCn())
            .append("staCd", getStaCd())
            .append("infoSmallClassId", getInfoSmallClassId())
            .append("sourceId", getSourceId())
            .append("recFlag", getRecFlag())
            .append("checkExceptionFlag", getCheckExceptionFlag())
            .append("checkState", getCheckState())
            .append("dtqRuleNo", getDtqRuleNo())
            .append("elementId", getElementId())
            .append("modelId", getModelId())
            .append("dataSafeClsNo", getDataSafeClsNo())
            .append("dataSafeLvl1Cls", getDataSafeLvl1Cls())
            .append("dataSafeLvl2Cls", getDataSafeLvl2Cls())
            .append("dataSafeLvl3Cls", getDataSafeLvl3Cls())
            .append("dataSafeLvl4Cls", getDataSafeLvl4Cls())
            .append("dataSafeLvl", getDataSafeLvl())
            .append("safeInfoSrcSys", getSafeInfoSrcSys())
            .append("safeInfoRemark", getSafeInfoRemark())
            .append("checkVersion", getCheckVersion())
            .append("checkMsg", getCheckMsg())
            .toString();
    }
}
