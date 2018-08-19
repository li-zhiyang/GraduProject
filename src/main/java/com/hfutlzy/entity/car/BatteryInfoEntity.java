package com.hfutlzy.entity.car;
/**
 * @author : lzyli
 * CreateDate : 2018/4/29 8:53
 * Description :
 */
public class BatteryInfoEntity {

    private String deviceid;
    private String batteryid;
    private String brand;
    private String batmodel;
    private String battype;
    private CompanyEntity companyEntity;

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

    public CompanyEntity getCompanyEntity() {
        return companyEntity;
    }

    public void setCompanyEntity(CompanyEntity companyEntity) {
        this.companyEntity = companyEntity;
    }
}
