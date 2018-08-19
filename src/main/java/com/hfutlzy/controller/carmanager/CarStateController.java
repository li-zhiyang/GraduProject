package com.hfutlzy.controller.carmanager;

import com.hfutlzy.common.jstree.ChildNode;
import com.hfutlzy.common.jstree.TreeNode;
import com.hfutlzy.dto.car.CarStateDto;
import com.hfutlzy.service.CarStateService;
import com.hfutlzy.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.List;

/**
 * @author : lzyli
 * CreateDate : 2018/4/29 11:04
 * Description :
 */
@Controller
public class CarStateController {

    private final CarStateService carStateService;
    private final CompanyService companyService;

    @Autowired
    public CarStateController(CarStateService carStateService, CompanyService companyService) {
        this.carStateService = carStateService;
        this.companyService = companyService;
    }


    @RequestMapping(value = "/carstate/getall")
    @ResponseBody
    public List<CarStateDto> getAllState() {

        return carStateService.getAllState();
    }

    @RequestMapping(value = "/carManager/carTreeNode.json")
    @ResponseBody
    public List<TreeNode> getOilTreeNode() {

        return companyService.getAllCompany();
    }

    @RequestMapping(value = "/carManager/carChildNode.json")
    @ResponseBody
    public List<ChildNode> getOilChildNode(@RequestParam(value = "id") String com) {

        return carStateService.getCarInfoByCom(com);
    }

    @RequestMapping(value = "/carManager/getOilEcharts.json")
    @ResponseBody
    public List<Object> getCarOilInfo(@RequestParam(value = "carno") String carno) {
        return carStateService.getCarOilInfo(carno);
    }

    @RequestMapping(value = "/carstate/getcarinfo")
    @ResponseBody
    public List<CarStateDto> getCarInfo(@RequestParam(value = "carno") String carno) {
        return carStateService.getCarInfo(carno);
    }

    @RequestMapping(value = "/carstate/getLnglat")
    @ResponseBody
    public List<Object> getLnglat(@RequestParam(value = "carno") String carno,
                                       @RequestParam(value = "starttime") String starttime,
                                       @RequestParam(value = "endtime") String endtime) throws ParseException {


        return carStateService.getLnglat(carno,starttime,endtime);
    }


}
