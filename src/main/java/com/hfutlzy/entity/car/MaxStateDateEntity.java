package com.hfutlzy.entity.car;

import java.util.Date;
/**
 * @author : lzyli
 * CreateDate : 2018/5/15 20:26
 * Description :
 */
public class MaxStateDateEntity {


    private String carno;
    private String deviceid;
    private Date maxdate;

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public Date getMaxdate() {
        return maxdate;
    }

    public void setMaxdate(Date maxdate) {
        this.maxdate = maxdate;
    }

}
