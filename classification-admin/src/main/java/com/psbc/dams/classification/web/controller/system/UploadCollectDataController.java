package com.psbc.dams.classification.web.controller.system;

import com.psbc.dams.classification.common.core.controller.BaseController;
import com.psbc.dams.classification.common.core.domain.AjaxResult;
import com.psbc.dams.classification.web.mapper.CollectStatus;
import com.psbc.dams.classification.web.service.ISummaryDataService;
import com.psbc.dams.classification.web.service.impl.SummaryDataServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/system/collectData")
public class UploadCollectDataController extends BaseController {


    @Resource
    private SummaryDataServiceImpl summaryDataService;
    @Resource
    private CollectStatus collectStatus;

    @PostMapping("/upload")
    public AjaxResult uploadData(String user){
        collectStatus.updateStatus(user);
        return AjaxResult.success("文件正在上传中。。。。。");
    }


    @GetMapping("/getStatus")
    public Integer status(String user){
        return collectStatus.getstatus(user);
    }

    @PostMapping("/uploadAll")
    public void uploadDataAll(String user, HttpServletRequest request){
        int source = 1;
        String authorization = request.getHeader("Authorization");
        String token = authorization.replaceAll("%20", " ");
        summaryDataService.sendSummaryData(token,source,user);
    }

}
