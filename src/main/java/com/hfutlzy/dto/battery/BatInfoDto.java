package com.hfutlzy.dto.battery;

import com.hfutlzy.entity.car.BatteryInfoEntity;
import com.hfutlzy.entity.car.CompanyEntity;

/**
 * @author : lzyli
 * CreateDate : 2018/6/6 9:13
 * Description :
 */

public class BatInfoDto {

    private String deviceid;
    private String batteryid;
    private String brand;
    private String batmodel;
    private String battype;
    private String company;

    public BatInfoDto(BatteryInfoEntity batteryInfoEntity, CompanyEntity companyEntity) {
        this.deviceid = batteryInfoEntity.getDeviceid();
        this.batteryid = batteryInfoEntity.getBatteryid();
        this.brand = batteryInfoEntity.getBrand();
        this.batmodel = batteryInfoEntity.getBatmodel();
        this.battype = batteryInfoEntity.getBattype();
        this.company = companyEntity.getCompanyname();
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getBatteryid() {
        return batteryid;
    }

    public void setBatteryid(String batteryid) {
        this.batteryid = batteryid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBatmodel() {
        return batmodel;
    }

    public void setBatmodel(String batmodel) {
        this.batmodel = batmodel;
    }

    public String getBattype() {
        return battype;
    }

    public void setBattype(String battype) {
        this.battype = battype;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
