package com.hfutlzy.dao;

import com.hfutlzy.entity.car.CompanyEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : lzyli
 * CreateDate : 2018/5/6 16:52
 * Description :
 */
@Repository
public class CompanyDao {

    private SessionFactory sessionFactory;
    @Autowired
    public CompanyDao(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    public List<CompanyEntity> getAllCompany(){

        String hql = "from "+CompanyEntity.class.getName();
        return (List<CompanyEntity>) sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    @SuppressWarnings("unchecked")
    public List<Object> getCom(){

        String hql = "select com.companyid,com.companyname from "+CompanyEntity.class.getName() +" as com";
        return (List<Object>) sessionFactory.getCurrentSession().createQuery(hql).list();
    }

}
