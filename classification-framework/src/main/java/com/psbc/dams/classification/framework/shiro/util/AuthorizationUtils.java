package com.psbc.dams.classification.framework.shiro.util;

import com.psbc.dams.classification.framework.shiro.realm.BaseUserRealm;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.RealmSecurityManager;

/**
 * 用户授权信息
 * 
 * @author classification
 */
public class AuthorizationUtils
{
    /**
     * 清理所有用户授权信息缓存
     */
    public static void clearAllCachedAuthorizationInfo()
    {
        getUserRealm().clearAllCachedAuthorizationInfo();
    }

    /**
     * 获取自定义Realm
     */
    public static BaseUserRealm getUserRealm()
    {
        RealmSecurityManager rsm = (RealmSecurityManager) SecurityUtils.getSecurityManager();
        return (BaseUserRealm) rsm.getRealms().iterator().next();
    }
}
