package com.houkai.controller;

import com.houkai.filter.MyHttpSessionListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ThymeleafController {
    /*@RequestMapping("/login")
    public String login(HttpServletRequest request){
        HttpSession session = request.getSession(true);
        return "login";
    }

    @RequestMapping("online")
    @ResponseBody
    public String online(){
        return "当前在线人数："+MyHttpSessionListener.online +"人";
    }*/
}