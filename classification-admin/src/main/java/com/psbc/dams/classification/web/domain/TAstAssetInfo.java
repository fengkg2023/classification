package com.psbc.dams.classification.web.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.psbc.dams.classification.common.annotation.Excel;
import com.psbc.dams.classification.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 数据资产对象 t_ast_asset_info
 *
 * @author classification
 * @date 2023-07-26
 */
public class TAstAssetInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    @Excel(name = "")
    private String assetNo;

    /**  */
    @Excel(name = "")
    private String assetBcls;

    /**  */
    @Excel(name = "")
    private String assetSclass;

    /**  */
    @Excel(name = "")
    private String sysInfo;

    /**  */
    @Excel(name = "")
    private String environInfo;

    /**  */
    @Excel(name = "")
    private String schemaInfo;

    /**  */
    @Excel(name = "")
    private String tabInfo;

    /**  */
    @Excel(name = "")
    private String relDataInfo;

    /**  */
    @Excel(name = "")
    private String assetName;

    /**  */
    @Excel(name = "")
    private String assetEnName;

    /**  */
    @Excel(name = "")
    private String assetDesc;

    /**  */
    @Excel(name = "")
    private String assetSta;

    /**  */
    @Excel(name = "")
    private String assetDirLoc;

    /**  */
    @Excel(name = "")
    private String assetBusiDept;

    /**  */
    @Excel(name = "")
    private String busiConter;

    /**  */
    @Excel(name = "")
    private String sysCstndept;

    /**  */
    @Excel(name = "")
    private String techConter;

    /**  */
    @Excel(name = "")
    private String dataSafeLvl;

    /**  */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ltmUpdTime;

    /**  */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "", width = 30, dateFormat = "yyyy-MM-dd")
    private Date issuTime;

    /**  */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "", width = 30, dateFormat = "yyyy-MM-dd")
    private Date offlnTime;

    /**  */
    @Excel(name = "")
    private String verNo;

    /**  */
    @Excel(name = "")
    private String qualityScore;

    /**  */
    @Excel(name = "")
    private String valLvl;

    /**  */
    @Excel(name = "")
    private Integer hotScore;

    /**  */
    @Excel(name = "")
    private Integer visitNum;

    /**  */
    @Excel(name = "")
    private Integer commentNum;

    /**  */
    @Excel(name = "")
    private Integer likeNum;

    /**  */
    @Excel(name = "")
    private Integer labelCnt;

    /**  */
    @Excel(name = "")
    private Integer collectNum;

    /**  */
    @Excel(name = "")
    private Integer quoteNum;

    /**  */
    @Excel(name = "")
    private String createUserId;

    /**  */
    @Excel(name = "")
    private String directUpstr;

    /**  */
    @Excel(name = "")
    private String sectionCls;

    /**  */
    @Excel(name = "")
    private String appDomain;

    /**  */
    @Excel(name = "")
    private String appScene;

    /**  */
    @Excel(name = "")
    private String assetServMode;

    /**  */
    @Excel(name = "")
    private String updCycle;

    /**  */
    @Excel(name = "")
    private String relatDownstr;

    /**  */
    @Excel(name = "")
    private String openShareScope;

    /**  */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "", width = 30, dateFormat = "yyyy-MM-dd")
    private Date rolloutDt;

    /**  */
    @Excel(name = "")
    private String dataSafeClsNo;

    /**  */
    @Excel(name = "")
    private Integer hotScoreNum;

    public void setAssetNo(String assetNo)
    {
        this.assetNo = assetNo;
    }

    public String getAssetNo()
    {
        return assetNo;
    }
    public void setAssetBcls(String assetBcls)
    {
        this.assetBcls = assetBcls;
    }

    public String getAssetBcls()
    {
        return assetBcls;
    }
    public void setAssetSclass(String assetSclass)
    {
        this.assetSclass = assetSclass;
    }

    public String getAssetSclass()
    {
        return assetSclass;
    }
    public void setSysInfo(String sysInfo)
    {
        this.sysInfo = sysInfo;
    }

    public String getSysInfo()
    {
        return sysInfo;
    }
    public void setEnvironInfo(String environInfo)
    {
        this.environInfo = environInfo;
    }

    public String getEnvironInfo()
    {
        return environInfo;
    }
    public void setSchemaInfo(String schemaInfo)
    {
        this.schemaInfo = schemaInfo;
    }

    public String getSchemaInfo()
    {
        return schemaInfo;
    }
    public void setTabInfo(String tabInfo)
    {
        this.tabInfo = tabInfo;
    }

    public String getTabInfo()
    {
        return tabInfo;
    }
    public void setRelDataInfo(String relDataInfo)
    {
        this.relDataInfo = relDataInfo;
    }

    public String getRelDataInfo()
    {
        return relDataInfo;
    }
    public void setAssetName(String assetName)
    {
        this.assetName = assetName;
    }

    public String getAssetName()
    {
        return assetName;
    }
    public void setAssetEnName(String assetEnName)
    {
        this.assetEnName = assetEnName;
    }

    public String getAssetEnName()
    {
        return assetEnName;
    }
    public void setAssetDesc(String assetDesc)
    {
        this.assetDesc = assetDesc;
    }

    public String getAssetDesc()
    {
        return assetDesc;
    }
    public void setAssetSta(String assetSta)
    {
        this.assetSta = assetSta;
    }

    public String getAssetSta()
    {
        return assetSta;
    }
    public void setAssetDirLoc(String assetDirLoc)
    {
        this.assetDirLoc = assetDirLoc;
    }

    public String getAssetDirLoc()
    {
        return assetDirLoc;
    }
    public void setAssetBusiDept(String assetBusiDept)
    {
        this.assetBusiDept = assetBusiDept;
    }

    public String getAssetBusiDept()
    {
        return assetBusiDept;
    }
    public void setBusiConter(String busiConter)
    {
        this.busiConter = busiConter;
    }

    public String getBusiConter()
    {
        return busiConter;
    }
    public void setSysCstndept(String sysCstndept)
    {
        this.sysCstndept = sysCstndept;
    }

    public String getSysCstndept()
    {
        return sysCstndept;
    }
    public void setTechConter(String techConter)
    {
        this.techConter = techConter;
    }

    public String getTechConter()
    {
        return techConter;
    }
    public void setDataSafeLvl(String dataSafeLvl)
    {
        this.dataSafeLvl = dataSafeLvl;
    }

    public String getDataSafeLvl()
    {
        return dataSafeLvl;
    }
    public void setLtmUpdTime(Date ltmUpdTime)
    {
        this.ltmUpdTime = ltmUpdTime;
    }

    public Date getLtmUpdTime()
    {
        return ltmUpdTime;
    }
    public void setIssuTime(Date issuTime)
    {
        this.issuTime = issuTime;
    }

    public Date getIssuTime()
    {
        return issuTime;
    }
    public void setOfflnTime(Date offlnTime)
    {
        this.offlnTime = offlnTime;
    }

    public Date getOfflnTime()
    {
        return offlnTime;
    }
    public void setVerNo(String verNo)
    {
        this.verNo = verNo;
    }

    public String getVerNo()
    {
        return verNo;
    }
    public void setQualityScore(String qualityScore)
    {
        this.qualityScore = qualityScore;
    }

    public String getQualityScore()
    {
        return qualityScore;
    }
    public void setValLvl(String valLvl)
    {
        this.valLvl = valLvl;
    }

    public String getValLvl()
    {
        return valLvl;
    }
    public void setHotScore(Integer hotScore)
    {
        this.hotScore = hotScore;
    }

    public Integer getHotScore()
    {
        return hotScore;
    }
    public void setVisitNum(Integer visitNum)
    {
        this.visitNum = visitNum;
    }

    public Integer getVisitNum()
    {
        return visitNum;
    }
    public void setCommentNum(Integer commentNum)
    {
        this.commentNum = commentNum;
    }

    public Integer getCommentNum()
    {
        return commentNum;
    }
    public void setLikeNum(Integer likeNum)
    {
        this.likeNum = likeNum;
    }

    public Integer getLikeNum()
    {
        return likeNum;
    }
    public void setLabelCnt(Integer labelCnt)
    {
        this.labelCnt = labelCnt;
    }

    public Integer getLabelCnt()
    {
        return labelCnt;
    }
    public void setCollectNum(Integer collectNum)
    {
        this.collectNum = collectNum;
    }

    public Integer getCollectNum()
    {
        return collectNum;
    }
    public void setQuoteNum(Integer quoteNum)
    {
        this.quoteNum = quoteNum;
    }

    public Integer getQuoteNum()
    {
        return quoteNum;
    }
    public void setCreateUserId(String createUserId)
    {
        this.createUserId = createUserId;
    }

    public String getCreateUserId()
    {
        return createUserId;
    }
    public void setDirectUpstr(String directUpstr)
    {
        this.directUpstr = directUpstr;
    }

    public String getDirectUpstr()
    {
        return directUpstr;
    }
    public void setSectionCls(String sectionCls)
    {
        this.sectionCls = sectionCls;
    }

    public String getSectionCls()
    {
        return sectionCls;
    }
    public void setAppDomain(String appDomain)
    {
        this.appDomain = appDomain;
    }

    public String getAppDomain()
    {
        return appDomain;
    }
    public void setAppScene(String appScene)
    {
        this.appScene = appScene;
    }

    public String getAppScene()
    {
        return appScene;
    }
    public void setAssetServMode(String assetServMode)
    {
        this.assetServMode = assetServMode;
    }

    public String getAssetServMode()
    {
        return assetServMode;
    }
    public void setUpdCycle(String updCycle)
    {
        this.updCycle = updCycle;
    }

    public String getUpdCycle()
    {
        return updCycle;
    }
    public void setRelatDownstr(String relatDownstr)
    {
        this.relatDownstr = relatDownstr;
    }

    public String getRelatDownstr()
    {
        return relatDownstr;
    }
    public void setOpenShareScope(String openShareScope)
    {
        this.openShareScope = openShareScope;
    }

    public String getOpenShareScope()
    {
        return openShareScope;
    }
    public void setRolloutDt(Date rolloutDt)
    {
        this.rolloutDt = rolloutDt;
    }

    public Date getRolloutDt()
    {
        return rolloutDt;
    }
    public void setDataSafeClsNo(String dataSafeClsNo)
    {
        this.dataSafeClsNo = dataSafeClsNo;
    }

    public String getDataSafeClsNo()
    {
        return dataSafeClsNo;
    }
    public void setHotScoreNum(Integer hotScoreNum)
    {
        this.hotScoreNum = hotScoreNum;
    }

    public Integer getHotScoreNum()
    {
        return hotScoreNum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("assetNo", getAssetNo())
                .append("assetBcls", getAssetBcls())
                .append("assetSclass", getAssetSclass())
                .append("sysInfo", getSysInfo())
                .append("environInfo", getEnvironInfo())
                .append("schemaInfo", getSchemaInfo())
                .append("tabInfo", getTabInfo())
                .append("relDataInfo", getRelDataInfo())
                .append("assetName", getAssetName())
                .append("assetEnName", getAssetEnName())
                .append("assetDesc", getAssetDesc())
                .append("assetSta", getAssetSta())
                .append("assetDirLoc", getAssetDirLoc())
                .append("assetBusiDept", getAssetBusiDept())
                .append("busiConter", getBusiConter())
                .append("sysCstndept", getSysCstndept())
                .append("techConter", getTechConter())
                .append("dataSafeLvl", getDataSafeLvl())
                .append("ltmUpdTime", getLtmUpdTime())
                .append("issuTime", getIssuTime())
                .append("offlnTime", getOfflnTime())
                .append("verNo", getVerNo())
                .append("qualityScore", getQualityScore())
                .append("valLvl", getValLvl())
                .append("hotScore", getHotScore())
                .append("visitNum", getVisitNum())
                .append("commentNum", getCommentNum())
                .append("likeNum", getLikeNum())
                .append("labelCnt", getLabelCnt())
                .append("collectNum", getCollectNum())
                .append("quoteNum", getQuoteNum())
                .append("createTime", getCreateTime())
                .append("createUserId", getCreateUserId())
                .append("directUpstr", getDirectUpstr())
                .append("sectionCls", getSectionCls())
                .append("appDomain", getAppDomain())
                .append("appScene", getAppScene())
                .append("assetServMode", getAssetServMode())
                .append("updCycle", getUpdCycle())
                .append("relatDownstr", getRelatDownstr())
                .append("openShareScope", getOpenShareScope())
                .append("rolloutDt", getRolloutDt())
                .append("dataSafeClsNo", getDataSafeClsNo())
                .append("hotScoreNum", getHotScoreNum())
                .toString();
    }
}
