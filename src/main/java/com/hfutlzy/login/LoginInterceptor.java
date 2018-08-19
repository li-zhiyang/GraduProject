package com.hfutlzy.login;


import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * ClassName:    LoginInterceptor
 * Description:  登陆拦截控制器
 * @author :       lzyli
 * CreateDate:   2018/4/9 21:39
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        String loginUrl = "/view/login";
        String url = httpServletRequest.getRequestURI();
        if(StringUtils.equals(url,loginUrl)){
            return true;
        }else{
            HttpSession httpSession = httpServletRequest.getSession();
            String username = (String)httpSession.getAttribute("username");
            if(username != null){
                return true;
            }else{
                httpServletResponse.sendRedirect(loginUrl);
                return false;
            }
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
