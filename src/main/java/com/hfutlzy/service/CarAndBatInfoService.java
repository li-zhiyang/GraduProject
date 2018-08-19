package com.hfutlzy.service;

import com.hfutlzy.dao.CarAndBatInfoDao;
import com.hfutlzy.dto.battery.BatInfoDto;
import com.hfutlzy.dto.car.CarInfoDto;
import com.hfutlzy.entity.car.BatteryInfoEntity;
import com.hfutlzy.entity.car.CarBaseInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : lzyli
 * CreateDate : 2018/6/6 8:52
 * Description :
 */
@Service
public class CarAndBatInfoService {

    private CarAndBatInfoDao carAndBatInfoDao;

    @Autowired
    public CarAndBatInfoService(CarAndBatInfoDao carAndBatInfoDao) {
        this.carAndBatInfoDao = carAndBatInfoDao;
    }

    public List<CarInfoDto> getCarInf(){
        List<CarInfoDto> carInfoDtoList = new ArrayList<>();

        List<CarBaseInfoEntity> carBaseInfoEntities = carAndBatInfoDao.getCarInfo();
        for(CarBaseInfoEntity carBaseInfoEntity :carBaseInfoEntities){
            carInfoDtoList.add(new CarInfoDto(carBaseInfoEntity,carBaseInfoEntity.getCompanyEntity()));
        }
        return carInfoDtoList;
    }
    public List<BatInfoDto> getBatInf(){
        List<BatInfoDto> batInfoDtoList = new ArrayList<>();

        List<BatteryInfoEntity> batteryInfoEntities = carAndBatInfoDao.getBatInfo();
        for(BatteryInfoEntity batteryInfoEntity :batteryInfoEntities){
            batInfoDtoList.add(new BatInfoDto(batteryInfoEntity,batteryInfoEntity.getCompanyEntity()));
        }
        return batInfoDtoList;
    }
}
