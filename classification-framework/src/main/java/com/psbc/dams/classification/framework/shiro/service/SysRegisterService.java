package com.psbc.dams.classification.framework.shiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.psbc.dams.classification.common.constant.Constants;
import com.psbc.dams.classification.common.constant.ShiroConstants;
import com.psbc.dams.classification.common.constant.UserConstants;
import com.psbc.dams.classification.common.core.domain.entity.SysUser;
import com.psbc.dams.classification.common.utils.DateUtils;
import com.psbc.dams.classification.common.utils.MessageUtils;
import com.psbc.dams.classification.common.utils.ServletUtils;
import com.psbc.dams.classification.common.utils.ShiroUtils;
import com.psbc.dams.classification.common.utils.StringUtils;
import com.psbc.dams.classification.framework.manager.AsyncManager;
import com.psbc.dams.classification.framework.manager.factory.AsyncFactory;
import com.psbc.dams.classification.system.service.ISysUserService;

/**
 * 注册校验方法
 * 
 * @author classification
 */
@Component
public class SysRegisterService
{
    @Autowired
    private ISysUserService userService;

    @Autowired
    private SysPasswordService passwordService;

    /**
     * 注册
     */
    public String register(SysUser user)
    {
        String msg = "", loginName = user.getLoginName(), password = user.getPassword();

        if (ShiroConstants.CAPTCHA_ERROR.equals(ServletUtils.getRequest().getAttribute(ShiroConstants.CURRENT_CAPTCHA)))
        {
            msg = "验证码错误";
        }
        else if (StringUtils.isEmpty(loginName))
        {
            msg = "用户名不能为空";
        }
        else if (StringUtils.isEmpty(password))
        {
            msg = "用户密码不能为空";
        }
        else if (password.length() < UserConstants.PASSWORD_MIN_LENGTH
                || password.length() > UserConstants.PASSWORD_MAX_LENGTH)
        {
            msg = "密码长度必须在5到20个字符之间";
        }
        else if (loginName.length() < UserConstants.USERNAME_MIN_LENGTH
                || loginName.length() > UserConstants.USERNAME_MAX_LENGTH)
        {
            msg = "账户长度必须在2到20个字符之间";
        }
        else if (!userService.checkLoginNameUnique(user))
        {
            msg = "保存用户'" + loginName + "'失败，注册账号已存在";
        }
        else
        {
            user.setPwdUpdateDate(DateUtils.getNowDate());
            user.setUserName(loginName);
            user.setSalt(ShiroUtils.randomSalt());
            user.setPassword(passwordService.encryptPassword(loginName, password, user.getSalt()));
            boolean regFlag = userService.registerUser(user);
            if (!regFlag)
            {
                msg = "注册失败,请联系系统管理人员";
            }
            else
            {
                AsyncManager.me().execute(AsyncFactory.recordLogininfor(loginName, Constants.REGISTER, MessageUtils.message("user.register.success")));
            }
        }
        return msg;
    }
}
