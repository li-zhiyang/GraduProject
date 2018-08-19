package com.hfutlzy.dao;

import com.hfutlzy.entity.menu.FirstmenuEntity;
import com.hfutlzy.entity.menu.SecondmenuEntity;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * ClassName:    MenuDao
 * Description:  通过hibernate获取数据库菜单信息
 * @author :       lzyli
 * CreateDate:   2018/4/9 21:39
 */
@Repository
public class MenuDao {


    private final SessionFactory sessionFactory;
    @Autowired
    public MenuDao(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    /**
     * @author : lzyli
     * MethodName : getFirstMenu
     * Description : 从数据库获取一级菜单
     */
    @SuppressWarnings("unchecked")
    public List<FirstmenuEntity> getFirstMenu(String authority){

        String hql = "from " +FirstmenuEntity.class.getName()
                +" as fm where fm.authority like \'%"+ authority+"%\'";

        return (List<FirstmenuEntity>) sessionFactory.getCurrentSession().createQuery(hql).list();


    }

    @SuppressWarnings("unchecked")
    public List<FirstmenuEntity> getFirstMenu(){

        String hql = "from " +FirstmenuEntity.class.getName();

        return (List<FirstmenuEntity>) sessionFactory.getCurrentSession().createQuery(hql).list();

    }


    /**
     * @author : lzyli
     * MethodName : getSecondMenu
     * Description : 从数据库获取二级菜单
     */
    @SuppressWarnings("unchecked")
    public List<SecondmenuEntity> getSecondMenu(int pid, String authority){

        String hql = "from "+SecondmenuEntity.class.getName()+" as sm where sm.pid = :pid"+" and sm.authority like \'%"+authority+"%\'";

        return (List<SecondmenuEntity>) sessionFactory.getCurrentSession().createQuery(hql).setParameter("pid",pid).list();
    }

    @SuppressWarnings("unchecked")
    public List<SecondmenuEntity> getSecondMenu(){

        String hql = "from "+SecondmenuEntity.class.getName();

        return (List<SecondmenuEntity>) sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    public boolean addFirstMenu(FirstmenuEntity firstmenuEntity){

        try{
            sessionFactory.getCurrentSession().save(firstmenuEntity);
            return true;
        }catch (HibernateException e){
            return false;
        }
    }

    public boolean addSecondMenu(SecondmenuEntity secondmenuEntity){

        try{
            sessionFactory.getCurrentSession().save(secondmenuEntity);
            return true;
        }catch (HibernateException e){
            return false;
        }
    }

    public boolean deleteFirstMenu(FirstmenuEntity firstmenuEntity){

        try{
            sessionFactory.getCurrentSession().delete(firstmenuEntity);
            return true;
        }catch (HibernateException e){
            return false;
        }
    }

    public boolean deleteSecondMenu(SecondmenuEntity secondmenuEntity){

        try{
            sessionFactory.getCurrentSession().delete(secondmenuEntity);
            return true;
        }catch (HibernateException e){
            return false;
        }
    }

    public boolean editFirstMenu(FirstmenuEntity firstmenuEntity){

        try{
            sessionFactory.getCurrentSession().update(firstmenuEntity);
            return true;
        }catch (HibernateException e){
            return false;
        }
    }

    public boolean editSecondMenu(SecondmenuEntity secondmenuEntity){

        try{
            sessionFactory.getCurrentSession().update(secondmenuEntity);
            return true;
        }catch (HibernateException e){
            return false;
        }
    }
}
