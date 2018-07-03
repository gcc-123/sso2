package com.bdqn.sso2.service;

import com.bdqn.sso2.pojo.LocalAuth;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 账户业务逻辑
 **/
public interface LocalAuthService {
    /**
     * 登陆
     * @param userName
     * @param password
     * @return
     */
    LocalAuth login(String userName,String password);
}
