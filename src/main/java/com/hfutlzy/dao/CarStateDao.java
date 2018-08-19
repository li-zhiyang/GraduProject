package com.hfutlzy.dao;

import com.hfutlzy.entity.car.CarBaseInfoEntity;
import com.hfutlzy.entity.car.CarStateEntity;
import com.hfutlzy.entity.car.MaxStateDateEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @author : lzyli
 * CreateDate : 2018/4/29 11:08
 * Description :
 */
@Repository
public class CarStateDao {

    private SessionFactory sessionFactory;
    @Autowired
    public CarStateDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    public List<CarStateEntity> getAllState(){

        String hql = "select cs from "+CarStateEntity.class.getName()+" as cs, "
                + MaxStateDateEntity.class.getName()+" AS date where cs.carBaseInfoEntity.carno=date.carno" +
                " and cs.reporttime=date.maxdate";
        return (List<CarStateEntity>) sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    @SuppressWarnings("unchecked")
    public List<CarBaseInfoEntity> getCarInfoByCom(String com){

        String hql = "from "+CarBaseInfoEntity.class.getName()+" as car where car.companyEntity.companyid=:com";

        return (List<CarBaseInfoEntity>) sessionFactory.getCurrentSession().createQuery(hql).setParameter("com",com).list();
    }

    @SuppressWarnings("unchecked")
    public List<Object> getCarOilInfo(String carno){
        String hql = "select to_char(car.reporttime,\'YYYY-MM-DD hh24:mi:ss\'),car.oilmass from "+
                CarStateEntity.class.getName()
                +" as car where car.carBaseInfoEntity.carno=:carno order by car.reporttime";
        return (List<Object>) sessionFactory.getCurrentSession().createQuery(hql).setParameter("carno",carno).list();

    }

    @SuppressWarnings("unchecked")
    public List<CarStateEntity> getCarInfoByCarno(String carno){
        String hql = "select cs from "+CarStateEntity.class.getName()+" as cs, "
                + MaxStateDateEntity.class.getName()+" AS date where cs.carBaseInfoEntity.carno=date.carno" +
                " and cs.reporttime=date.maxdate and cs.carBaseInfoEntity.carno=:carno";
        return (List<CarStateEntity>) sessionFactory.getCurrentSession().createQuery(hql).setParameter("carno",carno).list();
    }

    @SuppressWarnings("unchecked")
    public List<Object> getCarBycom(String com){
        String hql = "select car.carno,car.licplate from "+CarBaseInfoEntity.class.getName()+" as car where car.companyEntity.companyid=:com";

        return (List<Object>) sessionFactory.getCurrentSession().createQuery(hql).setParameter("com",com).list();
    }

    @SuppressWarnings("unchecked")
    public List<Object> getLnglat(String carno, Date starttime, Date endtime){

        String hql = "select car.longitude,car.latitude from "+CarStateEntity.class.getName()+" as car " +
                "where car.carBaseInfoEntity.carno=:carno and car.reporttime>=:starttime and car.reporttime<=:endtime order by car.reporttime";
        Map<String,Object> map = new HashMap<>(100);
        map.put("carno",carno);
        map.put("starttime",starttime);
        map.put("endtime",endtime);
        return (List<Object>) sessionFactory.getCurrentSession().createQuery(hql).setProperties(map).list();
    }

    @SuppressWarnings("unchecked")
    public List<CarStateEntity> getCarWorkRec(String carno){
        String hql = "select cs from "+CarStateEntity.class.getName()+" as cs where cs.carBaseInfoEntity.carno=:carno";
        return (List<CarStateEntity>) sessionFactory.getCurrentSession().createQuery(hql).setParameter("carno",carno).list();
    }

}
