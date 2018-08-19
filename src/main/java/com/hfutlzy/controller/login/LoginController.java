package com.hfutlzy.controller.login;

import com.hfutlzy.entity.user.UserEntity;
import com.hfutlzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:    LoginController  
 * Description:  用户登录控制类，实现用户的登录和登出操作
 * @author :       lzyli   
 * CreateDate:   2018/4/9 21:36
 *    
 */
@Controller
@RequestMapping("/")
public class LoginController {

    private final UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("login.json")
    @ResponseBody
    /**
     * @author : lzyli
     * MethodName: loginIn
     * @param: [username, password, httpServletRequest, httpServletResponse]
     * @return: java.util.List
     * Description: 用户登入响应，保存用户信息进入session
     */
    public List loginIn(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest httpServletRequest){

        List<String> statusList = new ArrayList<>();
        UserEntity userEntity = userService.getUser(username,password);
        if(userEntity == null){
            statusList.add(0,"0");
            //用户为空时返回false重新登录
            return statusList;
        }else{
            httpServletRequest.getSession().setAttribute("username",userEntity.getUsername());
            httpServletRequest.getSession().setAttribute("userid",userEntity.getUserid());
            httpServletRequest.getSession().setAttribute("authority",userEntity.getAuthority().trim());
            statusList.add(0,"1");
            return statusList;
        }

    }
    
    @RequestMapping("logout.json")
    @ResponseBody
    /**
     * @author : lzyli
     * MethodName: loginOut
     * @param: [httpServletRequest, httpServletResponse]
     * @return: void
     * Description: 用户退出系统操作，清除session
     */
    public void loginOut(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws IOException {
        HttpSession httpSession = httpServletRequest.getSession();
        httpSession.invalidate();
        httpServletResponse.sendRedirect("/view/login");

    }

}
