package com.lsgf.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor  implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //发行：判断什么情况下登录
        if (request.getRequestURI().contains("goLogin")){
            System.out.println(1);
            return true;
        }
        if (request.getRequestURI().contains("login")){
            System.out.println(2);

            return true;
        }
        if (session.getAttribute("userLoginInfo")!=null){
            System.out.println(3);

            return true;
        }

        //判断什么情况下没登录
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        System.out.println(4);

        return false;
    }
}
