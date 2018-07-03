package com.bdqn.sso2.service.impl;

import com.bdqn.sso2.dao.LocalAuthMapper;
import com.bdqn.sso2.pojo.LocalAuth;
import com.bdqn.sso2.service.LocalAuthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
@Service
public class LocalAuthServiceImpl implements LocalAuthService {

    @Resource
    private LocalAuthMapper localAuthMapper;

    @Override
    public LocalAuth login(String userName, String password) {
        return localAuthMapper.getUserByNameAndPassword(userName, password);
    }
}
