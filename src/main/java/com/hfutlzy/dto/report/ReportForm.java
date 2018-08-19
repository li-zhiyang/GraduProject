package com.hfutlzy.dto.report;

/**
 * @author : lzyli
 * CreateDate : 2018/5/21 22:43
 * Description : 报表生成所需传递的信息
 */
public class ReportForm {

    private String reptype;
    private String starttime;
    private String endtime;
    private String com;
    private String carno;

    public String getReptype() {
        return reptype;
    }

    public void setReptype(String reptype) {
        this.reptype = reptype;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }
}
