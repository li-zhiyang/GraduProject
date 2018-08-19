package com.hfutlzy.dto.car;

import com.hfutlzy.entity.car.BatteryInfoEntity;
import com.hfutlzy.entity.car.CarBaseInfoEntity;
import com.hfutlzy.entity.car.CarStateEntity;

import java.util.Date;

/**
 * @author : lzyli
 * CreateDate : 2018/4/29 10:23
 * Description :
 */
public class CarStateDto {

    /**
     * 车辆编号
     */
    private String carno;
    /**
     * 动力类型
     */
    private String powertype;
    /**
     * 车牌号
     */
    private String licplate;
    /**
     * 所属公司
     */
    private String com;
    /**
     * 当前用户
     */
    private String curuser;
    /**
     * 设备编号
     */
    private String deviceid;
    /**
     * 电池对外编号
     */
    private String batteryid;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 电池型号
     */
    private String batmodel;
    /**
     * 电池类型
     */
    private String battype;
    /**
     * 电量
     */
    private double elecquantity;
    /**
     * 最近充电时间
     */
    private Date recentchargtime;
    /**
     * 当前驾驶员
     */
    private String driver;
    /**
     * 车速
     */
    private double speed;
    /**
     * 发动机转速
     */
    private double tspeed;
    /**
     * 水温
     */
    private double watertemp;
    /**
     * 油温
     */
    private double oiltemp;
    /**
     * 油量
     */
    private double oilmass;
    /**
     * 安全带
     */
    private String safebelt;
    /**
     * 手制动
     */
    private String braking;
    /**
     * 上报时间
     */
    private Date reporttime;

    private Double longitude;
    private Double latitude;

    private Double voltage;
    private Double eleccurrent;
    private Double batterytemp;
    private String warning;

    public CarStateDto(CarStateEntity carStateEntity, BatteryInfoEntity batteryInfoEntity, CarBaseInfoEntity carBaseInfoEntity) {
        this.carno = carBaseInfoEntity.getCarno();
        this.powertype = carBaseInfoEntity.getPowertype();
        this.licplate = carBaseInfoEntity.getLicplate();
        this.com = carBaseInfoEntity.getCompanyEntity().getCompanyname();
        this.curuser = carStateEntity.getCuruser();
        this.deviceid = batteryInfoEntity.getDeviceid();
        this.batteryid = batteryInfoEntity.getBatteryid();
        this.brand = batteryInfoEntity.getBrand();
        this.batmodel = batteryInfoEntity.getBatmodel();
        this.battype = batteryInfoEntity.getBattype();
        this.elecquantity = carStateEntity.getElecquantity();
        this.recentchargtime = carStateEntity.getRecentchargtime();
        this.driver = carStateEntity.getDriver();
        this.speed = carStateEntity.getSpeed();
        this.tspeed = carStateEntity.getTspeed();
        this.watertemp = carStateEntity.getWatertemp();
        this.oiltemp = carStateEntity.getOiltemp();
        this.oilmass = carStateEntity.getOilmass();
        this.safebelt = carStateEntity.getSafebelt();
        this.braking = carStateEntity.getBraking();
        this.reporttime = carStateEntity.getReporttime();
        this.voltage = carStateEntity.getVoltage();
        this.eleccurrent = carStateEntity.getEleccurrent();
        this.batterytemp = carStateEntity.getBatterytemp();
        this.warning = carStateEntity.getWarning();
        this.latitude = carStateEntity.getLatitude();
        this.longitude = carStateEntity.getLongitude();
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno;
    }

    public String getPowertype() {
        return powertype;
    }

    public void setPowertype(String powertype) {
        this.powertype = powertype;
    }

    public String getLicplate() {
        return licplate;
    }

    public void setLicplate(String licplate) {
        this.licplate = licplate;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getCuruser() {
        return curuser;
    }

    public void setCuruser(String curuser) {
        this.curuser = curuser;
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

    public double getElecquantity() {
        return elecquantity;
    }

    public void setElecquantity(double elecquantity) {
        this.elecquantity = elecquantity;
    }

    public Date getRecentchargtime() {
        return recentchargtime;
    }

    public void setRecentchargtime(Date recentchargtime) {
        this.recentchargtime = recentchargtime;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getTspeed() {
        return tspeed;
    }

    public void setTspeed(double tspeed) {
        this.tspeed = tspeed;
    }

    public double getWatertemp() {
        return watertemp;
    }

    public void setWatertemp(double watertemp) {
        this.watertemp = watertemp;
    }

    public double getOiltemp() {
        return oiltemp;
    }

    public void setOiltemp(double oiltemp) {
        this.oiltemp = oiltemp;
    }

    public double getOilmass() {
        return oilmass;
    }

    public void setOilmass(double oilmass) {
        this.oilmass = oilmass;
    }

    public String getSafebelt() {
        return safebelt;
    }

    public void setSafebelt(String safebelt) {
        this.safebelt = safebelt;
    }

    public String getBraking() {
        return braking;
    }

    public void setBraking(String braking) {
        this.braking = braking;
    }

    public Date getReporttime() {
        return reporttime;
    }

    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getVoltage() {
        return voltage;
    }

    public void setVoltage(Double voltage) {
        this.voltage = voltage;
    }

    public Double getEleccurrent() {
        return eleccurrent;
    }

    public void setEleccurrent(Double eleccurrent) {
        this.eleccurrent = eleccurrent;
    }

    public Double getBatterytemp() {
        return batterytemp;
    }

    public void setBatterytemp(Double batterytemp) {
        this.batterytemp = batterytemp;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    @Override
    public String toString() {
        return "CarStateDto{" +
                "carno='" + carno + '\'' +
                ", powertype='" + powertype + '\'' +
                ", licplate='" + licplate + '\'' +
                ", com='" + com + '\'' +
                ", curuser='" + curuser + '\'' +
                ", deviceid='" + deviceid + '\'' +
                ", batteryid='" + batteryid + '\'' +
                ", brand='" + brand + '\'' +
                ", batmodel='" + batmodel + '\'' +
                ", battype='" + battype + '\'' +
                ", elecquantity=" + elecquantity +
                ", recentchargtime=" + recentchargtime +
                ", driver='" + driver + '\'' +
                ", speed=" + speed +
                ", tspeed=" + tspeed +
                ", watertemp=" + watertemp +
                ", oiltemp=" + oiltemp +
                ", oilmass=" + oilmass +
                ", safebelt='" + safebelt + '\'' +
                ", braking='" + braking + '\'' +
                ", reporttime=" + reporttime +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", voltage=" + voltage +
                ", eleccurrent=" + eleccurrent +
                ", batterytemp=" + batterytemp +
                ", warning='" + warning + '\'' +
                '}';
    }
}
