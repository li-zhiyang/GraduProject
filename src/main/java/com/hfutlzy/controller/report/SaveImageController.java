package com.hfutlzy.controller.report;

import com.hfutlzy.common.echarts.DownloadImage;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;

/**
 * @author : lzyli
 * CreateDate : 2018/5/18 13:50
 * Description :
 */
@Controller
public class SaveImageController {

    @RequestMapping(value = "/echarts/saveImage",method = RequestMethod.POST)
    public void getAndsaveImage(@RequestParam(value="picInfo") String picInfo,@RequestParam(value="picName") String picName){

        if (StringUtils.isBlank(picInfo)) {
            return;
        }
        String newPicInfo = picInfo.replaceAll(" ", "+");
        String imagePath = "E:\\JAVAProject\\GraduProject\\target\\GraduProject\\assets\\img\\echarts\\"+picName+".png";
        String picPath = DownloadImage.decodeBase64(newPicInfo, new File(imagePath));
        System.out.println(picPath);
    }


}
