package com.hfutlzy.service;

import com.hfutlzy.common.jstree.ChildNode;
import com.hfutlzy.dao.CarStateDao;
import com.hfutlzy.dto.car.CarStateDto;
import com.hfutlzy.entity.car.CarBaseInfoEntity;
import com.hfutlzy.entity.car.CarStateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author : lzyli
 * CreateDate : 2018/4/29 11:09
 * Description :
 */
@Service
public class CarStateService {


    private final CarStateDao carStateDao;

    @Autowired
    public CarStateService(CarStateDao carStateDao) {
        this.carStateDao = carStateDao;
    }

    public List<CarStateDto> getAllState() {
        List<CarStateDto> carStateDtos = new ArrayList<>();
        CarStateDto carStateDto;
        List<CarStateEntity> carStateEntities = carStateDao.getAllState();
        for (CarStateEntity carStateEntity : carStateEntities) {
            carStateDto = new CarStateDto(carStateEntity, carStateEntity.getBatteryInfoEntity(), carStateEntity.getCarBaseInfoEntity());
            carStateDtos.add(carStateDto);
        }
        return carStateDtos;
    }

    public List<ChildNode> getCarInfoByCom(String com) {
        List<ChildNode> childNodes = new ArrayList<>();
        ChildNode childNode;
        List<CarBaseInfoEntity> carBaseInfoEntities = carStateDao.getCarInfoByCom(com);
        for (CarBaseInfoEntity carBaseInfoEntity : carBaseInfoEntities) {
            childNode = new ChildNode(carBaseInfoEntity.getCarno(), carBaseInfoEntity.getLicplate());
            childNodes.add(childNode);
        }

        return childNodes;
    }

    public List<Object> getCarOilInfo(String carno) {
        return carStateDao.getCarOilInfo(carno);
    }

    public List<CarStateDto> getCarInfo(String carno) {
        List<CarStateDto> carStateDtos = new ArrayList<>();
        CarStateDto carStateDto;
        List<CarStateEntity> carStateEntities = carStateDao.getCarInfoByCarno(carno);
        for (CarStateEntity carStateEntity : carStateEntities) {
            carStateDto = new CarStateDto(carStateEntity, carStateEntity.getBatteryInfoEntity(), carStateEntity.getCarBaseInfoEntity());
            carStateDtos.add(carStateDto);
        }
        return carStateDtos;
    }

    public List<Object> getCarByCom(String com) {
        List<Object> carlist = new ArrayList<>();
        List<Object> objects = carStateDao.getCarBycom(com);
        carlist.addAll(objects);
        return carlist;
    }

    public List<Object> getLnglat(String carno, String starttime, String endtime) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date start = sdf.parse(starttime);
        Date end = sdf.parse(endtime);
        return carStateDao.getLnglat(carno,start,end);
    }

    public List<CarStateDto> getCarWorkRec(String carno){
        List<CarStateDto> carStateDtos = new ArrayList<>();
        CarStateDto carStateDto;
        List<CarStateEntity> carStateEntities = carStateDao.getCarWorkRec(carno);
        for (CarStateEntity carStateEntity : carStateEntities) {
            carStateDto = new CarStateDto(carStateEntity, carStateEntity.getBatteryInfoEntity(), carStateEntity.getCarBaseInfoEntity());
            carStateDtos.add(carStateDto);
        }
        return carStateDtos;
    }
}
