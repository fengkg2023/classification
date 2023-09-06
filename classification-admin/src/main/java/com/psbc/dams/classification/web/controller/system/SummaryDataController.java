package com.psbc.dams.classification.web.controller.system;

import com.psbc.dams.classification.common.annotation.Log;
import com.psbc.dams.classification.common.core.controller.BaseController;
import com.psbc.dams.classification.common.core.domain.AjaxResult;
import com.psbc.dams.classification.common.core.page.TableDataInfo;
import com.psbc.dams.classification.common.enums.BusinessType;
import com.psbc.dams.classification.common.utils.poi.ExcelUtil;
import com.psbc.dams.classification.web.domain.SummaryData;
import com.psbc.dams.classification.web.service.ISummaryDataService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/system/summaryData")
public class SummaryDataController extends BaseController {

    @Autowired
    private ISummaryDataService summaryDataService;

    private String prefix = "system/summaryData";

    @Log(title = "导入模板", businessType = BusinessType.IMPORT)
    @PostMapping("/importTemplate")
    @ResponseBody
    @Validated
    public AjaxResult importTemplate(MultipartFile file, boolean updateSupport,String user
            ,HttpServletRequest request) throws Exception{
        String authorization = request.getHeader("Authorization");
        String s = authorization.replaceAll("%20", " ");
        ExcelUtil<SummaryData> util = new ExcelUtil<SummaryData>(SummaryData.class);
        List<SummaryData> summaryDataList = util.importExcel(file.getInputStream());
        String message = summaryDataService.importExcel(summaryDataList, updateSupport,user,s);
        return AjaxResult.success(message);
    }


    @Log(title = "导入模板", businessType = BusinessType.IMPORT)
    @PostMapping("/importTemplateResult")
    @ResponseBody
    @Validated
    public AjaxResult importTemplateResult(MultipartFile file, boolean updateSupport
            ,HttpServletRequest request,String user) throws Exception{
        int source = 2;
        String authorization = request.getHeader("Authorization");
        String s = authorization.replaceAll("%20", " ");
        ExcelUtil<SummaryData> util = new ExcelUtil<SummaryData>(SummaryData.class);
        List<SummaryData> summaryDataList = util.importExcel(file.getInputStream());
        String message = summaryDataService.importExcelResult(summaryDataList, updateSupport,user,s,source);
        return AjaxResult.success(message);
    }


    @Log(title = "导入模板", businessType = BusinessType.IMPORT)
    @PostMapping("/importTemplateResultArt")
    @ResponseBody
    @Validated
    public AjaxResult importTemplateResultArt(MultipartFile file, boolean updateSupport
            ,HttpServletRequest request,String user) throws Exception{
        int source = 3;
        String authorization = request.getHeader("Authorization");
        String s = authorization.replaceAll("%20", " ");
//        CasdoorUser casdoorUser = casdoorAuthService.parseJwtToken(authorization);
        ExcelUtil<SummaryData> util = new ExcelUtil<SummaryData>(SummaryData.class);
        List<SummaryData> summaryDataList = util.importExcel(file.getInputStream());
        String message = summaryDataService.importExcelResult(summaryDataList, updateSupport,user,s,source);
        return AjaxResult.success(message);
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @PostMapping("confirm")
    @ResponseBody
    public TableDataInfo list(@RequestBody(required = false) SummaryData summaryData,HttpServletRequest request,String user) {
        String authorization = request.getHeader("Authorization");
        String s = authorization.replaceAll("%20", " ");
        //根据token去解析   调用数安接口
        startPage();
        List<SummaryData> list = summaryDataService.selectSummaryDataList(summaryData,user);
        return getDataTable(list);
    }


    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@RequestBody SummaryData summaryData , String user) {
        summaryDataService.updateSummaryData(summaryData,user);
        return AjaxResult.success("修改成功");
    }



    /**
     * 修改保存【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/delete")
    @ResponseBody
    public AjaxResult delete(HttpServletRequest request,String user) {
        String authorization = request.getHeader("Authorization");
        String s = authorization.replaceAll("%20", " ");
        summaryDataService.deleteSummary(s,user);
        return AjaxResult.success("删除成功");
    }


    /**
     * 提交导入的数据
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.COMMIT)
    @PostMapping( "/commit")
    @ResponseBody
    public AjaxResult commit(HttpServletRequest request,String user) {
        String authorization = request.getHeader("Authorization");
        String s = authorization.replaceAll("%20", " ");
        summaryDataService.commitSummaryData(user,s);
        return AjaxResult.success("提交成功");
    }
}
