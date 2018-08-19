package com.hfutlzy.controller.report;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : lzyli
 * CreateDate : 2018/5/19 15:08
 * Description :  echarts图表html视图控制
 */
@Controller
public class EchartsViewController {

    @RequestMapping("/echarts/echarts")
    public String getEcharts(){
        return "/echarts/echarts";
    }
}
