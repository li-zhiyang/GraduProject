package com.hfutlzy.common.echarts;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author : lzyli
 * CreateDate : 2018/5/19 14:55
 * Description : 下载echarts图片
 */
public class DownloadImage {

    private static final String PHANTOM_PATH = "phantomjs ";
    private static final String TEST_JS = "E:\\JAVAProject\\GraduProject\\src\\main\\webapp\\assets\\js\\echarts\\echarts_load.js ";

    private static final String LOCALHOST = "http://localhost:8080";

    /**
     * @author : lzyli
     * Description : 调用phantomJs命令加载含有Echarts图表的html文件，下载图片至服务器
     */
    public static boolean downloadImage(String url, String start, String end, long curdate) throws IOException {

        String cmdStr = PHANTOM_PATH + TEST_JS + LOCALHOST + url + " " + start + " " + end + " " + curdate;

        Runtime rt = Runtime.getRuntime();
        try {
            rt.exec(cmdStr);
            return true;
        } catch (IOException e) {
            System.out.println("执行phantomjs的指令失败！请检查是否安装有PhantomJs的环境或配置path路径！PhantomJs详情参考这里:http://phantomjs.org" + e.toString());

            return false;
        }
    }

    /**
     * 解析Base64位信息并输出到某个目录下面.
     *
     * @param base64Info base64串
     * @param picPath    生成的文件路径
     * @return 文件地址
     */
    public static String decodeBase64(String base64Info, File picPath) {

        if (StringUtils.isEmpty(base64Info)) {
            return null;
        }

        // 数据中：data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAABI4AAAEsCAYAAAClh/jbAAA
        String[] arr = base64Info.split("base64,");

        // 将图片输出到系统某目录.
        OutputStream out = null;
        try {
            byte[] buffer = Base64.decodeBase64(arr[1]);
            out = new FileOutputStream(picPath);
            out.write(buffer);
        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            IOUtils.closeQuietly(out);
        }

        return picPath.getAbsolutePath();
    }
}
