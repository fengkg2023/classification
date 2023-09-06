package com.psbc.dams.classification.framework.shiro.authc;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @ClassName: com.psbc.dams.classification.framework.shiro.authc
 * @Description: ******
 * @author: andy-zhangbingbing
 * @version: V1.0
 * @Date: 2020/7/17 12:11
 **/
public class UserLoginToken extends UsernamePasswordToken {

    private static final long serialVersionUID = -7238870303376628499L;
    /**
     * 登录类型
     */
    private String loginType;

    /**
     * 机构号
     */
    private String branchId;

    /**
     * 授权码
     */
    private String authCode;

    /**
     * 记住我
     */
    private Boolean rememberMe;


    public UserLoginToken(){

    }

    public UserLoginToken(final String username,final String password ,final String loginType,final String branchId,final String authCode,final boolean rememberMe){
        super(username,password);
        this.loginType = loginType;
        this.branchId = branchId;
        this.authCode = authCode;
        this.rememberMe = rememberMe;

    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public Boolean getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(Boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
}
