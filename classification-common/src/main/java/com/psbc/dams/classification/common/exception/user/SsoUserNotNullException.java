package com.psbc.dams.classification.common.exception.user;

/**
 * @ClassName: com.psbc.dams.classification.common.exception.user
 * @Description: ******
 * @author: andy-zhangbingbing
 * @version: V1.0
 * @Date: 2020/7/17 10:58
 **/
public class SsoUserNotNullException extends UserException{
    public SsoUserNotNullException() {
        super("sso.not.null", null);
    }
}
