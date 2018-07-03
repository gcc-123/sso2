package com.bdqn.sso2.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 新浪微博
 **/
@Controller
public class WeiBoController {
    /**
     * 进入微博首页
     *
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/weibo.html")
    public String enter(HttpServletRequest request, Model model) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("sso") && cookie.getValue().equals("content")) {
                    // 之前已经登陆过，无需再次登陆
                    return "weibo";
                }
            }
        }
        model.addAttribute("goUrl", "weibo");
        return "login";
    }
}
