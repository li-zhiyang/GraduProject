package com.hfutlzy.dao;

import com.hfutlzy.entity.car.BatteryInfoEntity;
import com.hfutlzy.entity.car.CarStateEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : lzyli
 * CreateDate : 2018/5/6 17:10
 * Description :
 */
@Repository
public class BatInfoDao {

    private SessionFactory sessionFactory;

    @Autowired
    public BatInfoDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    /**
     * @author : lzyli
     * Description : 获取树形菜单的公司含有的电池信息
     */
    public List<BatteryInfoEntity> getBatInfoByCom(String com){
        String hql = "from "+BatteryInfoEntity.class.getName()+" as bat where bat.companyEntity.companyid=:com";
        return (List<BatteryInfoEntity>) sessionFactory.getCurrentSession().createQuery(hql).setParameter("com",com).list();
    }

    @SuppressWarnings("unchecked")
    public List<Object> getBatWorkEcharts(String deviceid){

        String hql = "select to_char(car.reporttime,\'YYYY-MM-DD hh24:mi:ss\'),car.elecquantity,car.voltage,car.eleccurrent,car.batterytemp from "+ CarStateEntity.class.getName()
                +" as car where car.batteryInfoEntity.deviceid=:deviceid order by car.reporttime";
        return (List<Object>) sessionFactory.getCurrentSession().createQuery(hql).setParameter("deviceid",deviceid).list();
    }
}
