package com.hfutlzy.service;

import com.hfutlzy.common.jstree.ChildNode;
import com.hfutlzy.dao.BatInfoDao;
import com.hfutlzy.entity.car.BatteryInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : lzyli
 * CreateDate : 2018/5/6 17:17
 * Description :
 */
@Service
public class BatInfoService {

    private BatInfoDao batInfoDao;

    @Autowired
    public BatInfoService(BatInfoDao batInfoDao) {
        this.batInfoDao = batInfoDao;
    }

    /**
     * @author : lzyli
     * Description : 获取树形菜单的公司含有的电池列表
     */
    public List<ChildNode> getBatInfoByCom(String com){
        List<ChildNode> childNodes = new ArrayList<>();
        ChildNode childNode;
        List<BatteryInfoEntity> batteryInfoEntities = batInfoDao.getBatInfoByCom(com);
        for(BatteryInfoEntity batteryInfoEntity : batteryInfoEntities){
            childNode = new ChildNode(batteryInfoEntity.getDeviceid(),
                    batteryInfoEntity.getDeviceid()+"-"+batteryInfoEntity.getBatteryid());
            childNodes.add(childNode);
        }

        return childNodes;
    }

    public List<Object> getBatWorkEcharts(String deviceid){

        return batInfoDao.getBatWorkEcharts(deviceid);
    }
}
