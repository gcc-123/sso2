package com.bdqn.sso2.controller;

import com.bdqn.sso2.service.LocalAuthService;
import org.springframework.http.HttpCookie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 登陆控制器
 **/
@Controller
public class LoginController {

    @Resource
    private LocalAuthService localAuthService;
    /**
     * 验证账户是否正确
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public  String loginCheck(String username, String password, HttpServletResponse response,String goUrl){
        if (localAuthService.login(username, password) != null) {
            // 登陆成功
            // 向cookie中写入信息
            Cookie cookie = new Cookie("sso","content");
            cookie.setPath("/");
            response.addCookie(cookie);
            return goUrl;
        }else{
            // 登陆失败
            return "login";
        }
    }
}
