package com.hfutlzy.controller.report;

import com.hfutlzy.dto.report.ReportForm;
import com.hfutlzy.service.CarStateService;
import com.hfutlzy.service.CompanyService;
import com.hfutlzy.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : lzyli
 * CreateDate : 2018/5/21 14:17
 * Description :  生成报表http请求入口
 */
@Controller
public class ReportController {

    private CompanyService companyService;
    private CarStateService carStateService;
    private ReportService reportService;

    @Autowired
    public ReportController(CompanyService companyService, CarStateService carStateService, ReportService reportService) {
        this.companyService = companyService;
        this.carStateService = carStateService;
        this.reportService = reportService;
    }

    @RequestMapping(value = "/report/getcom", method = RequestMethod.GET)
    @ResponseBody
    public List<Object> getCom() {
        return companyService.getCom();
    }

    @RequestMapping(value = "/report/getcar", method = RequestMethod.GET)
    @ResponseBody
    public List<Object> getCar(@RequestParam(value = "companyid") String com) {
        return carStateService.getCarByCom(com);
    }

    @RequestMapping(value = "/report/createrep", method = RequestMethod.POST)
    @ResponseBody
    public List<String> getCreateRepUrl(ReportForm reportForm) throws IOException, InterruptedException {
        List<String> strings = new ArrayList<>(1);

        String result = null;
        String workrecord = "workrecord";
        String analysis = "analysis";
        if(workrecord.equals(reportForm.getReptype())){
            result = reportService.createWorkRecordRep(reportForm);
        }else if(analysis.equals(reportForm.getReptype())){
            result = reportService.createAnalysisRep(reportForm);
        }
        strings.add(result);
        return strings;
    }

}
