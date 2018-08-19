package com.hfutlzy.common.pdf;

import com.hfutlzy.dto.car.CarStateDto;
import com.hfutlzy.dto.report.ReportForm;
import com.hfutlzy.service.CarStateService;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.UnitValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author : lzyli
 * CreateDate : 2018/5/21 14:19
 * Description : 创建PDF文件
 */
public class CreatePdf {

    private final String PDF_PATH_PREFIX = "E:\\JAVAProject\\GraduProject\\target\\GraduProject\\assets\\pdf\\";
    private final String ECHARTS_IMAGE_PATH = "E:\\JAVAProject\\GraduProject\\target\\GraduProject\\assets\\img\\echarts\\";
    private PdfWriter pdfWriter;
    private PdfDocument pdfDocument;
    private Document document = null;
    private PdfFont titleFont;


    private CarStateService carStateService;

    @Autowired
    public CreatePdf(CarStateService carStateService) {
        this.carStateService = carStateService;
    }

    public String createWorkPdf(ReportForm reportForm, long curdate) {


        String reportName = curdate + "-" + reportForm.getCarno() + ".pdf";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStr = sdf.format(curdate);

        try {
            pdfWriter = new PdfWriter(PDF_PATH_PREFIX + reportName);
            pdfDocument = new PdfDocument(pdfWriter);
            document = new Document(pdfDocument);
            document.setMargins(20, 20, 20, 20);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "false";
        }
        try {
            titleFont = PdfFontFactory.createFont("STSong-Light", "UniGB-UCS2-H", true);
            if (document != null) {

                document.add(new Paragraph("车辆作业记录报表").setFont(titleFont).setFontSize(24));
                document.add(new Paragraph("报表生成时间： " + timeStr).setFont(titleFont));
                document.add(new Paragraph("报表统计时间： " + reportForm.getStarttime() + " 至 " + reportForm.getEndtime()).setFont(titleFont));
                document.add(new Paragraph("车辆编号： " + reportForm.getCarno()).setFont(titleFont));

                List<CarStateDto> carStateDtos = carStateService.getCarWorkRec(reportForm.getCarno());
                PdfFont sysFont = PdfFontFactory.createFont("STSongStd-Light", "UniGB-UCS2-H", false);
                Table table = new Table(new float[]{3, 5, 3, 2, 5, 2, 5});
                table.setWidth(UnitValue.createPercentValue(100));

                Cell licplate = new Cell().add(new Paragraph("车牌号")).setFont(sysFont);
                Cell curuser = new Cell().add(new Paragraph("当前用户")).setFont(sysFont);
                Cell driver = new Cell().add(new Paragraph("驾驶员")).setFont(sysFont);
                Cell speed = new Cell().add(new Paragraph("车速")).setFont(sysFont);
                Cell tspeed = new Cell().add(new Paragraph("发动机转速")).setFont(sysFont);
                Cell oilmass = new Cell().add(new Paragraph("油量%")).setFont(sysFont);
                Cell reporttime = new Cell().add(new Paragraph("上报时间")).setFont(sysFont);

                table.addCell(licplate);
                table.addCell(curuser);
                table.addCell(driver);
                table.addCell(speed);
                table.addCell(tspeed);
                table.addCell(oilmass);
                table.addCell(reporttime);

                for (CarStateDto carStateDto : carStateDtos) {

                    licplate = new Cell().add(new Paragraph(carStateDto.getLicplate())).setFont(sysFont);
                    curuser = new Cell().add(new Paragraph(carStateDto.getCuruser())).setFont(sysFont);
                    driver = new Cell().add(new Paragraph(carStateDto.getDriver())).setFont(sysFont);
                    speed = new Cell().add(new Paragraph(carStateDto.getSpeed()+"")).setFont(sysFont);
                    tspeed = new Cell().add(new Paragraph(carStateDto.getTspeed()+"")).setFont(sysFont);
                    oilmass = new Cell().add(new Paragraph(carStateDto.getOilmass()+"")).setFont(sysFont);
                    reporttime = new Cell().add(new Paragraph(sdf.format(carStateDto.getReporttime()))).setFont(sysFont);

                    table.addCell(licplate);
                    table.addCell(curuser);
                    table.addCell(driver);
                    table.addCell(speed);
                    table.addCell(tspeed);
                    table.addCell(oilmass);
                    table.addCell(reporttime);
                }

                document.add(table);

                document.close();
                return reportName;

            }
        } catch (IOException e) {
            e.printStackTrace();
            return "false";
        }
        return "false";

    }

    public String createAnalysisPdf(ReportForm reportForm, long curdate) throws FileNotFoundException, InterruptedException {

        String reportName = curdate + "-" + reportForm.getCarno() + ".pdf";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStr = sdf.format(curdate);

        try {
            pdfWriter = new PdfWriter(PDF_PATH_PREFIX + reportName);
            pdfDocument = new PdfDocument(pdfWriter);
            document = new Document(pdfDocument);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "false";
        }
        try {
            titleFont = PdfFontFactory.createFont("STSong-Light", "UniGB-UCS2-H", true);
            if (document != null) {

                Thread.sleep(1000 * 3);
                File file = new File(ECHARTS_IMAGE_PATH + curdate + "111.png");
                if (!file.exists()) {
                    return "false";
                }

                document.add(new Paragraph("车辆效率分析报表").setFont(titleFont).setFontSize(24));
                document.add(new Paragraph("报表生成时间： " + timeStr).setFont(titleFont));
                document.add(new Paragraph("报表统计时间： " + reportForm.getStarttime() + " 至 " + reportForm.getEndtime()).setFont(titleFont));
                document.add(new Paragraph("车辆编号： " + reportForm.getCarno()).setFont(titleFont));

                Image echarts = new Image(ImageDataFactory.create(ECHARTS_IMAGE_PATH + curdate + "111.png"));
                document.add(echarts);

                document.close();
                return reportName;

            }
        } catch (IOException e) {
            e.printStackTrace();
            return "false";
        }
        return "false";
    }

}
