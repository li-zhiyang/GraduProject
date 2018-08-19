package com.hfutlzy.service;

import com.hfutlzy.common.echarts.DownloadImage;
import com.hfutlzy.common.pdf.CreatePdf;
import com.hfutlzy.dto.report.ReportForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author : lzyli
 * CreateDate : 2018/5/21 23:20
 * Description :
 */
@Service
public class ReportService {

    private CreatePdf createPdf;
    @Autowired
    public ReportService(CreatePdf createPdf) {
        this.createPdf = createPdf;
    }

    public String createWorkRecordRep(ReportForm reportForm) throws IOException {

        long curdate = System.currentTimeMillis();

        String message = "false";

        String reportName = createPdf.createWorkPdf(reportForm, curdate);

        if (message.equals(reportName)) {
            return message;
        } else {
            return "/assets/pdf/" + reportName;
        }

    }

    public String createAnalysisRep(ReportForm reportForm) throws IOException, InterruptedException {

        long curdate = System.currentTimeMillis();
        boolean result = DownloadImage.downloadImage("/echarts/echarts", reportForm.getStarttime(), reportForm.getEndtime(), curdate);
        String message = "false";
        if (result) {
            String reportName = createPdf.createAnalysisPdf(reportForm, curdate);

            if (message.equals(reportName)) {
                return message;
            } else {
                return "/assets/pdf/" + reportName;
            }
        } else {
            return message;
        }
    }


}
