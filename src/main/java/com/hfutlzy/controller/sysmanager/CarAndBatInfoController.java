package com.hfutlzy.controller.sysmanager;

import com.hfutlzy.dto.battery.BatInfoDto;
import com.hfutlzy.dto.car.CarInfoDto;
import com.hfutlzy.service.CarAndBatInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : lzyli
 * CreateDate : 2018/6/6 8:51
 * Description :
 */
@Controller
public class CarAndBatInfoController {

    private CarAndBatInfoService carAndBatInfoService;

    @Autowired
    public CarAndBatInfoController(CarAndBatInfoService carAndBatInfoService) {
        this.carAndBatInfoService = carAndBatInfoService;
    }

    @RequestMapping("/carinfoin/getinfo")
    @ResponseBody
    public List<CarInfoDto> getCarInfo(){

        return carAndBatInfoService.getCarInf();
    }

    @RequestMapping("/batinfoin/getinfo")
    @ResponseBody
    public List<BatInfoDto> getBatInfo(){

        return carAndBatInfoService.getBatInf();
    }

}
