package com.psbc.dams.classification.web.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.psbc.dams.classification.common.annotation.Excel;
import com.psbc.dams.classification.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 指标标准对象 t_std_idx
 * 
 * @author classification
 * @date 2023-07-25
 */
public class TStdIdx extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 指标编号 */
    private String idxNo;

    /** 系统指标编号 */
    @Excel(name = "系统指标编号")
    private String sysIdxNo;

    /** 指标名称 */
    @Excel(name = "指标名称")
    private String idxName;

    /** 合并后指标名称 */
    @Excel(name = "合并后指标名称")
    private String mgIdxName;

    /** 合并后的指标定义 */
    @Excel(name = "合并后的指标定义")
    private String mgIdxDefine;

    /** 指标一级分类 */
    @Excel(name = "指标一级分类")
    private String idxLvl1Cls;

    /** 指标二级分类 */
    @Excel(name = "指标二级分类")
    private String idxLvl2Cls;

    /** 指标三级分类 */
    @Excel(name = "指标三级分类")
    private String idxLvl3Cls;

    /** 指标业务含义 */
    @Excel(name = "指标业务含义")
    private String idxBusiMeaning;

    /** 指标计算公式 */
    @Excel(name = "指标计算公式")
    private String idxCalFrml;

    /** 指标生成周期 */
    @Excel(name = "指标生成周期")
    private String idxGenCycle;

    /** 相关维度 */
    @Excel(name = "相关维度")
    private String relateDms;

    /** 使用公共统计规则 */
    @Excel(name = "使用公共统计规则")
    private String usePubStatisRule;

    /** 属于报表/实体表资产编号 */
    @Excel(name = "属于报表/实体表资产编号")
    private String rptEntityTabAstNo;

    /** 属于报表/实体表中文名称 */
    @Excel(name = "属于报表/实体表中文名称")
    private String rptEntityTabCnName;

    /** 属于报表/实体表英文名称  */
    @Excel(name = "属于报表/实体表英文名称 ")
    private String rptEntityTabEnName;

    /** 报表/实体表字段的资产编号 */
    @Excel(name = "报表/实体表字段的资产编号")
    private String rptEntityFieldAstNo;

    /** 报表/实体表字段中文名称 */
    @Excel(name = "报表/实体表字段中文名称")
    private String rptEntityFieldCnName;

    /** 报表/实体表字段英文名称 */
    @Excel(name = "报表/实体表字段英文名称")
    private String rptEntityFieldEnName;

    /** 指标加工系统 */
    @Excel(name = "指标加工系统")
    private String idxMachSys;

    /** 指标加工库名 */
    @Excel(name = "指标加工库名")
    private String idxMachDbName;

    /** 指标上游系统 */
    @Excel(name = "指标上游系统")
    private String idxLastHvSys;

    /** 指标下游系统 */
    @Excel(name = "指标下游系统")
    private String idxDownstrSys;

    /** 指标度量单位 */
    @Excel(name = "指标度量单位")
    private String idxMeasureU;

    /** 指标取值精度 */
    @Excel(name = "指标取值精度")
    private String idxValueAccuracy;

    /** 所用源表英文名 */
    @Excel(name = "所用源表英文名")
    private String oldTabEnName;

    /** 所用源表中文名 */
    @Excel(name = "所用源表中文名")
    private String oldTabCnName;

    /** 所用源字段英文 */
    @Excel(name = "所用源字段英文")
    private String oldFieldEnName;

    /** 所用源字段中文 */
    @Excel(name = "所用源字段中文")
    private String oldFieldCnName;

    /** 指标取数汇总逻辑 */
    @Excel(name = "指标取数汇总逻辑")
    private String idxFthgSumLogic;

    /** 指标取数筛选条件 */
    @Excel(name = "指标取数筛选条件")
    private String idxFthgFilterCond;

    /** 业务部门 */
    @Excel(name = "业务部门")
    private String busiDept;

    /** 业务联系人 */
    @Excel(name = "业务联系人")
    private String busiConter;

    /** 开发部门 */
    @Excel(name = "开发部门")
    private String dvlpDept;

    /** 技术联系人 */
    @Excel(name = "技术联系人")
    private String techConter;

    /** 是否对应指标数据标准 */
    @Excel(name = "是否对应指标数据标准")
    private String crspIdxDataStd;

    /** 指标数据标准编号 */
    @Excel(name = "指标数据标准编号")
    private String idxDataStdNo;

    /** 指标数据指标名称 */
    @Excel(name = "指标数据指标名称")
    private String idxDataIdxName;

    /** 指标数据标准统计规则 */
    @Excel(name = "指标数据标准统计规则")
    private String idxDataStdStatisRule;

    /** 指标数据标准相关维度 */
    @Excel(name = "指标数据标准相关维度")
    private String idxDataStdRelateDms;

    /** 版本号 */
    @Excel(name = "版本号")
    private String verNo;

    /** 组合编号 */
    @Excel(name = "组合编号")
    private String combNo;

    /** 组合说明 */
    @Excel(name = "组合说明")
    private String combDesc;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createTime;

    /** 修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modTime;

    public void setIdxNo(String idxNo) 
    {
        this.idxNo = idxNo;
    }

    public String getIdxNo() 
    {
        return idxNo;
    }
    public void setSysIdxNo(String sysIdxNo) 
    {
        this.sysIdxNo = sysIdxNo;
    }

    public String getSysIdxNo() 
    {
        return sysIdxNo;
    }
    public void setIdxName(String idxName) 
    {
        this.idxName = idxName;
    }

    public String getIdxName() 
    {
        return idxName;
    }
    public void setMgIdxName(String mgIdxName) 
    {
        this.mgIdxName = mgIdxName;
    }

    public String getMgIdxName() 
    {
        return mgIdxName;
    }
    public void setMgIdxDefine(String mgIdxDefine) 
    {
        this.mgIdxDefine = mgIdxDefine;
    }

    public String getMgIdxDefine() 
    {
        return mgIdxDefine;
    }
    public void setIdxLvl1Cls(String idxLvl1Cls) 
    {
        this.idxLvl1Cls = idxLvl1Cls;
    }

    public String getIdxLvl1Cls() 
    {
        return idxLvl1Cls;
    }
    public void setIdxLvl2Cls(String idxLvl2Cls) 
    {
        this.idxLvl2Cls = idxLvl2Cls;
    }

    public String getIdxLvl2Cls() 
    {
        return idxLvl2Cls;
    }
    public void setIdxLvl3Cls(String idxLvl3Cls) 
    {
        this.idxLvl3Cls = idxLvl3Cls;
    }

    public String getIdxLvl3Cls() 
    {
        return idxLvl3Cls;
    }
    public void setIdxBusiMeaning(String idxBusiMeaning) 
    {
        this.idxBusiMeaning = idxBusiMeaning;
    }

    public String getIdxBusiMeaning() 
    {
        return idxBusiMeaning;
    }
    public void setIdxCalFrml(String idxCalFrml) 
    {
        this.idxCalFrml = idxCalFrml;
    }

    public String getIdxCalFrml() 
    {
        return idxCalFrml;
    }
    public void setIdxGenCycle(String idxGenCycle) 
    {
        this.idxGenCycle = idxGenCycle;
    }

    public String getIdxGenCycle() 
    {
        return idxGenCycle;
    }
    public void setRelateDms(String relateDms) 
    {
        this.relateDms = relateDms;
    }

    public String getRelateDms() 
    {
        return relateDms;
    }
    public void setUsePubStatisRule(String usePubStatisRule) 
    {
        this.usePubStatisRule = usePubStatisRule;
    }

    public String getUsePubStatisRule() 
    {
        return usePubStatisRule;
    }
    public void setRptEntityTabAstNo(String rptEntityTabAstNo) 
    {
        this.rptEntityTabAstNo = rptEntityTabAstNo;
    }

    public String getRptEntityTabAstNo() 
    {
        return rptEntityTabAstNo;
    }
    public void setRptEntityTabCnName(String rptEntityTabCnName) 
    {
        this.rptEntityTabCnName = rptEntityTabCnName;
    }

    public String getRptEntityTabCnName() 
    {
        return rptEntityTabCnName;
    }
    public void setRptEntityTabEnName(String rptEntityTabEnName) 
    {
        this.rptEntityTabEnName = rptEntityTabEnName;
    }

    public String getRptEntityTabEnName() 
    {
        return rptEntityTabEnName;
    }
    public void setRptEntityFieldAstNo(String rptEntityFieldAstNo) 
    {
        this.rptEntityFieldAstNo = rptEntityFieldAstNo;
    }

    public String getRptEntityFieldAstNo() 
    {
        return rptEntityFieldAstNo;
    }
    public void setRptEntityFieldCnName(String rptEntityFieldCnName) 
    {
        this.rptEntityFieldCnName = rptEntityFieldCnName;
    }

    public String getRptEntityFieldCnName() 
    {
        return rptEntityFieldCnName;
    }
    public void setRptEntityFieldEnName(String rptEntityFieldEnName) 
    {
        this.rptEntityFieldEnName = rptEntityFieldEnName;
    }

    public String getRptEntityFieldEnName() 
    {
        return rptEntityFieldEnName;
    }
    public void setIdxMachSys(String idxMachSys) 
    {
        this.idxMachSys = idxMachSys;
    }

    public String getIdxMachSys() 
    {
        return idxMachSys;
    }
    public void setIdxMachDbName(String idxMachDbName) 
    {
        this.idxMachDbName = idxMachDbName;
    }

    public String getIdxMachDbName() 
    {
        return idxMachDbName;
    }
    public void setIdxLastHvSys(String idxLastHvSys) 
    {
        this.idxLastHvSys = idxLastHvSys;
    }

    public String getIdxLastHvSys() 
    {
        return idxLastHvSys;
    }
    public void setIdxDownstrSys(String idxDownstrSys) 
    {
        this.idxDownstrSys = idxDownstrSys;
    }

    public String getIdxDownstrSys() 
    {
        return idxDownstrSys;
    }
    public void setIdxMeasureU(String idxMeasureU) 
    {
        this.idxMeasureU = idxMeasureU;
    }

    public String getIdxMeasureU() 
    {
        return idxMeasureU;
    }
    public void setIdxValueAccuracy(String idxValueAccuracy) 
    {
        this.idxValueAccuracy = idxValueAccuracy;
    }

    public String getIdxValueAccuracy() 
    {
        return idxValueAccuracy;
    }
    public void setOldTabEnName(String oldTabEnName) 
    {
        this.oldTabEnName = oldTabEnName;
    }

    public String getOldTabEnName() 
    {
        return oldTabEnName;
    }
    public void setOldTabCnName(String oldTabCnName) 
    {
        this.oldTabCnName = oldTabCnName;
    }

    public String getOldTabCnName() 
    {
        return oldTabCnName;
    }
    public void setOldFieldEnName(String oldFieldEnName) 
    {
        this.oldFieldEnName = oldFieldEnName;
    }

    public String getOldFieldEnName() 
    {
        return oldFieldEnName;
    }
    public void setOldFieldCnName(String oldFieldCnName) 
    {
        this.oldFieldCnName = oldFieldCnName;
    }

    public String getOldFieldCnName() 
    {
        return oldFieldCnName;
    }
    public void setIdxFthgSumLogic(String idxFthgSumLogic) 
    {
        this.idxFthgSumLogic = idxFthgSumLogic;
    }

    public String getIdxFthgSumLogic() 
    {
        return idxFthgSumLogic;
    }
    public void setIdxFthgFilterCond(String idxFthgFilterCond) 
    {
        this.idxFthgFilterCond = idxFthgFilterCond;
    }

    public String getIdxFthgFilterCond() 
    {
        return idxFthgFilterCond;
    }
    public void setBusiDept(String busiDept) 
    {
        this.busiDept = busiDept;
    }

    public String getBusiDept() 
    {
        return busiDept;
    }
    public void setBusiConter(String busiConter) 
    {
        this.busiConter = busiConter;
    }

    public String getBusiConter() 
    {
        return busiConter;
    }
    public void setDvlpDept(String dvlpDept) 
    {
        this.dvlpDept = dvlpDept;
    }

    public String getDvlpDept() 
    {
        return dvlpDept;
    }
    public void setTechConter(String techConter) 
    {
        this.techConter = techConter;
    }

    public String getTechConter() 
    {
        return techConter;
    }
    public void setCrspIdxDataStd(String crspIdxDataStd) 
    {
        this.crspIdxDataStd = crspIdxDataStd;
    }

    public String getCrspIdxDataStd() 
    {
        return crspIdxDataStd;
    }
    public void setIdxDataStdNo(String idxDataStdNo) 
    {
        this.idxDataStdNo = idxDataStdNo;
    }

    public String getIdxDataStdNo() 
    {
        return idxDataStdNo;
    }
    public void setIdxDataIdxName(String idxDataIdxName) 
    {
        this.idxDataIdxName = idxDataIdxName;
    }

    public String getIdxDataIdxName() 
    {
        return idxDataIdxName;
    }
    public void setIdxDataStdStatisRule(String idxDataStdStatisRule) 
    {
        this.idxDataStdStatisRule = idxDataStdStatisRule;
    }

    public String getIdxDataStdStatisRule() 
    {
        return idxDataStdStatisRule;
    }
    public void setIdxDataStdRelateDms(String idxDataStdRelateDms) 
    {
        this.idxDataStdRelateDms = idxDataStdRelateDms;
    }

    public String getIdxDataStdRelateDms() 
    {
        return idxDataStdRelateDms;
    }
    public void setVerNo(String verNo) 
    {
        this.verNo = verNo;
    }

    public String getVerNo() 
    {
        return verNo;
    }
    public void setCombNo(String combNo) 
    {
        this.combNo = combNo;
    }

    public String getCombNo() 
    {
        return combNo;
    }
    public void setCombDesc(String combDesc) 
    {
        this.combDesc = combDesc;
    }

    public String getCombDesc() 
    {
        return combDesc;
    }
    public void setModTime(Date modTime) 
    {
        this.modTime = modTime;
    }

    public Date getModTime()
    {
        return modTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("idxNo", getIdxNo())
            .append("sysIdxNo", getSysIdxNo())
            .append("idxName", getIdxName())
            .append("mgIdxName", getMgIdxName())
            .append("mgIdxDefine", getMgIdxDefine())
            .append("remark", getRemark())
            .append("idxLvl1Cls", getIdxLvl1Cls())
            .append("idxLvl2Cls", getIdxLvl2Cls())
            .append("idxLvl3Cls", getIdxLvl3Cls())
            .append("idxBusiMeaning", getIdxBusiMeaning())
            .append("idxCalFrml", getIdxCalFrml())
            .append("idxGenCycle", getIdxGenCycle())
            .append("relateDms", getRelateDms())
            .append("usePubStatisRule", getUsePubStatisRule())
            .append("rptEntityTabAstNo", getRptEntityTabAstNo())
            .append("rptEntityTabCnName", getRptEntityTabCnName())
            .append("rptEntityTabEnName", getRptEntityTabEnName())
            .append("rptEntityFieldAstNo", getRptEntityFieldAstNo())
            .append("rptEntityFieldCnName", getRptEntityFieldCnName())
            .append("rptEntityFieldEnName", getRptEntityFieldEnName())
            .append("idxMachSys", getIdxMachSys())
            .append("idxMachDbName", getIdxMachDbName())
            .append("idxLastHvSys", getIdxLastHvSys())
            .append("idxDownstrSys", getIdxDownstrSys())
            .append("idxMeasureU", getIdxMeasureU())
            .append("idxValueAccuracy", getIdxValueAccuracy())
            .append("oldTabEnName", getOldTabEnName())
            .append("oldTabCnName", getOldTabCnName())
            .append("oldFieldEnName", getOldFieldEnName())
            .append("oldFieldCnName", getOldFieldCnName())
            .append("idxFthgSumLogic", getIdxFthgSumLogic())
            .append("idxFthgFilterCond", getIdxFthgFilterCond())
            .append("busiDept", getBusiDept())
            .append("busiConter", getBusiConter())
            .append("dvlpDept", getDvlpDept())
            .append("techConter", getTechConter())
            .append("crspIdxDataStd", getCrspIdxDataStd())
            .append("idxDataStdNo", getIdxDataStdNo())
            .append("idxDataIdxName", getIdxDataIdxName())
            .append("idxDataStdStatisRule", getIdxDataStdStatisRule())
            .append("idxDataStdRelateDms", getIdxDataStdRelateDms())
            .append("verNo", getVerNo())
            .append("combNo", getCombNo())
            .append("combDesc", getCombDesc())
            .append("createTime", getCreateTime())
            .append("modTime", getModTime())
            .toString();
    }
}
