package com.psbc.dams.classification.web.controller.system;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.psbc.dams.classification.common.constant.UserConstants;
import com.psbc.dams.classification.framework.shiro.authc.UserLoginToken;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.psbc.dams.classification.common.core.controller.BaseController;
import com.psbc.dams.classification.common.core.domain.AjaxResult;
import com.psbc.dams.classification.common.core.text.Convert;
import com.psbc.dams.classification.common.utils.ServletUtils;
import com.psbc.dams.classification.common.utils.StringUtils;
import com.psbc.dams.classification.framework.web.service.ConfigService;

/**
 * 登录验证
 * 
 * @author classification
 */
@Controller
public class SysLoginController extends BaseController
{
    /**
     * 是否开启记住我功能
     */
    @Value("${shiro.rememberMe.enabled: false}")
    private boolean rememberMe;

    @Autowired
    private ConfigService configService;

    @GetMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response, ModelMap mmap)
    {
        // 如果是Ajax请求，返回Json字符串。
        if (ServletUtils.isAjaxRequest(request))
        {
            return ServletUtils.renderString(response, "{\"code\":\"1\",\"msg\":\"未登录或登录超时。请重新登录\"}");
        }
        // 是否开启记住我
        mmap.put("isRemembered", rememberMe);
        // 是否开启用户注册
        mmap.put("isAllowRegister", Convert.toBool(configService.getKey("sys.account.registerUser"), false));
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public AjaxResult ajaxLogin(String username, String password, Boolean rememberMe)
    {
//        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        UserLoginToken token = new UserLoginToken(username, password, UserConstants.USER_LOGIN_TYPE_NORMAL,"","",rememberMe);
        Subject subject = SecurityUtils.getSubject();
        try
        {
            subject.login(token);
            return success();
        }
        catch (AuthenticationException e)
        {
            String msg = "用户或密码错误";
            if (StringUtils.isNotEmpty(e.getMessage()))
            {
                msg = e.getMessage();
            }
            return error(msg);
        }
    }

//    /**
//     * 这里是一个租户的入口。后期如果配合登录页面进行改造。这里可以合并为一个登录扣。只是通过登录类型变量来控制就可以。
//     * @param username
//     * @param branchId
//     * @param authCode
//     * @return
//     */
//    @GetMapping("/ssoLogin")
//    public String ssoLogin(String username,String branchId,String authCode){
//        UserLoginToken token = new UserLoginToken(username,"", UserConstants.USER_LOGIN_TYPE_SSO,branchId,authCode,false);
//        Subject subject = SecurityUtils.getSubject();
//        try
//        {
//            subject.login(token);
//            return "ssoLogin";
//        }
//        catch (AuthenticationException e)
//        {
//            String msg = "用户或密码错误";
//            if (StringUtils.isNotEmpty(e.getMessage()))
//            {
//                msg = e.getMessage();
//            }
//            return "login";
//        }
//    }

    @GetMapping("/unauth")
    public String unauth()
    {
        return "error/unauth";
    }
}
