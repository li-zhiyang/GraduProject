package com.hfutlzy.controller.sysmanager;

import com.hfutlzy.entity.user.UserEntity;
import com.hfutlzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
/**
 * ClassName : UserManagerController
 * @author : lzyli
 * CreateDate : 2018/4/10 21:50
 ** Description : 用户功能控制器
 */
@Controller
@RequestMapping("/usermanager")
public class UserManagerController {

    private final UserService userService;

    private String def = "default";

    @Autowired
    public UserManagerController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/alluserlist")
    @ResponseBody
    /**
     * @author : lzyli
     * MethodName : getAllUser
     * @param : []
     * @return : java.util.List<com.hfutlzy.entity.user.UserEntity>
     * Description : 获取所有的用户
     */
    public List<UserEntity> getAllUser(){

        return userService.getAllUser();

    }

    @RequestMapping(value="/addUser",method = RequestMethod.POST)
    @ResponseBody
    public boolean addUser(UserEntity userEntity) {

        return !def.equals(userEntity.getAuthority()) && userService.addUser(userEntity);
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    @ResponseBody
    public boolean updateUser(UserEntity userEntity){

        return !def.equals(userEntity.getAuthority()) && userService.updateUser(userEntity);
    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    @ResponseBody
    public boolean deleteUser(UserEntity userEntity){

        return userService.deleteUser(userEntity);

    }

    /*@RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    @ResponseBody
    public boolean deleteUser(String userid){

        return userService.deleteUser(userid);

    }*/
}
