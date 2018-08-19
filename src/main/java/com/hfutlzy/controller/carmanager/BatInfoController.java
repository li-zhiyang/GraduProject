package com.hfutlzy.controller.carmanager;

import com.hfutlzy.common.jstree.ChildNode;
import com.hfutlzy.common.jstree.TreeNode;
import com.hfutlzy.service.BatInfoService;
import com.hfutlzy.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : lzyli
 * CreateDate : 2018/5/6 17:26
 * Description :
 */
@Controller
public class BatInfoController {

    private CompanyService companyService;
    private BatInfoService batInfoService;

    @Autowired
    public BatInfoController(CompanyService companyService, BatInfoService batInfoService) {
        this.companyService = companyService;
        this.batInfoService = batInfoService;
    }

    @RequestMapping("/carManager/batTreeNode.json")
    @ResponseBody
    public List<TreeNode> getBatTreeNode(){

        return companyService.getAllCompany();

    }

    @RequestMapping("/carManager/batChildNode.json")
    @ResponseBody
    public List<ChildNode> getBatChildNode(@RequestParam(value = "id") String com){

        return batInfoService.getBatInfoByCom(com);
    }

    @RequestMapping("/carManager/getWorkEcharts.json")
    @ResponseBody
    public List<Object> getBatWorkEcharts(@RequestParam(value = "deviceid") String deviceid){

        return batInfoService.getBatWorkEcharts(deviceid);
    }
}
