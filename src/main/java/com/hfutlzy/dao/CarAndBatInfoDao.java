package com.hfutlzy.dao;

import com.hfutlzy.entity.car.BatteryInfoEntity;
import com.hfutlzy.entity.car.CarBaseInfoEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : lzyli
 * CreateDate : 2018/6/6 8:52
 * Description :
 */
@Repository
public class CarAndBatInfoDao {

    private SessionFactory sessionFactory;

    @Autowired
    public CarAndBatInfoDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    public List<CarBaseInfoEntity> getCarInfo(){
        String hql = "from "+CarBaseInfoEntity.class.getName();
        return (List<CarBaseInfoEntity>)sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    @SuppressWarnings("unchecked")
    public List<BatteryInfoEntity> getBatInfo(){
        String hql = "from "+BatteryInfoEntity.class.getName();
        return (List<BatteryInfoEntity>)sessionFactory.getCurrentSession().createQuery(hql).list();
    }
}
