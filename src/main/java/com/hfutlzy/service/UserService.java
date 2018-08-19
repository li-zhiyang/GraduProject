package com.hfutlzy.service;

import com.hfutlzy.dao.UserDao;
import com.hfutlzy.entity.user.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:    UserService
 * Description:  用户服务类
 * @author :       lzyli
 * CreateDate:   2018/4/9 21:39
 */
@Service
public class UserService {

    private final UserDao userDao;
    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserEntity getUser(String username,String password){
        return userDao.getUser(username,password);
    }

    public List<UserEntity> getAllUser(){
        return userDao.getAllUser();
    }

    public boolean addUser(UserEntity userEntity){
        return userDao.addUser(userEntity);
    }

    public boolean deleteUser(UserEntity userEntity){
        return userDao.deleteUser(userEntity);
    }

    public boolean updateUser(UserEntity userEntity){
        return userDao.updateUser(userEntity);
    }

    /*public boolean deleteUser(String userid){
        return userDao.deleteUser(userid);
    }*/
}
