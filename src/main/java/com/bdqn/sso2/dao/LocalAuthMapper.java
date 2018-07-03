package com.bdqn.sso2.dao;

import com.bdqn.sso2.pojo.LocalAuth;
import org.apache.ibatis.annotations.Param;

import javax.xml.soap.SAAJResult;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 账户接口
 **/
public interface LocalAuthMapper {
    /**
     * 通过用户名和密码获取用户
     *
     * @param userName
     * @param password
     * @return
     */
    LocalAuth getUserByNameAndPassword(@Param("userName") String userName, @Param("password") String password);
}
