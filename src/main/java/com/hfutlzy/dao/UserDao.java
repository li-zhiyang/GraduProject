package com.hfutlzy.dao;

import com.hfutlzy.entity.user.UserEntity;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * ClassName:    UserDao
 * Description:  [一句话描述该类的功能]
 * @author :       lzyli
 * CreateDate:   2018/4/9 21:39
 */
@Repository
public class UserDao {

    private final SessionFactory sessionFactory;
    @Autowired
    public UserDao(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    /**
     * @author : lzyli
     * MethodName : getUser
     * Description : 根据用户名和密码获取用户信息
     */
    public UserEntity getUser(String username , String password){
        String hql = "from "+UserEntity.class.getName()+" as u where u.username = :username and u.password = :password";
        Map<String,String> map = new HashMap<>(2);
        map.put("username",username);
        map.put("password",password);

        return  (UserEntity)sessionFactory.getCurrentSession().createQuery(hql).setProperties(map).uniqueResult();
    }

    /**
     * @author : lzyli
     * MethodName : getAllUser
     * Description : 获取所有用户的信息
     */
    @SuppressWarnings("unchecked")
    public List<UserEntity> getAllUser(){
        String hql = "from "+UserEntity.class.getName();
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    public boolean addUser(UserEntity userEntity){
        try{
            sessionFactory.getCurrentSession().save(userEntity);
            return true;
        }catch (HibernateException e){
            return false;
        }

    }

    public boolean deleteUser(UserEntity userEntity){

        try{
            sessionFactory.getCurrentSession().delete(userEntity);
            return true;
        }catch (HibernateException e){
            return false;
        }
    }

    public boolean updateUser(UserEntity userEntity){
        try{
            sessionFactory.getCurrentSession().update(userEntity);
            return true;
        }catch (HibernateException e){
            return false;
        }
    }

    /*public boolean deleteUser(String userid){

        UserEntity userEntity =new UserEntity();
        userEntity.setUserid(userid);
        try{
            sessionFactory.getCurrentSession().delete(userEntity);
            return true;
        }catch (HibernateException e){
            return false;
        }
    }*/
}
