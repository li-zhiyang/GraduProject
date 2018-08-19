package com.hfutlzy.entity.car;

import java.util.Date;
/**
 * @author : lzyli
 * CreateDate : 2018/5/3 16:34
 * Description :
 */

public class CarStateEntity {


    private int id;
    private String driver;
    private Double speed;
    private Double tspeed;
    private Long watertemp;
    private Double oiltemp;
    private String curuser;
    private Double elecquantity;
    private Date recentchargtime;
    private Double oilmass;
    private String safebelt;
    private String braking;
    private Date reporttime;
    private Double longitude;
    private Double latitude;

    private Double voltage;
    private Double eleccurrent;
    private Double batterytemp;
    private String warning;

    private CarBaseInfoEntity carBaseInfoEntity;
    private BatteryInfoEntity batteryInfoEntity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getTspeed() {
        return tspeed;
    }

    public void setTspeed(Double tspeed) {
        this.tspeed = tspeed;
    }

    public Long getWatertemp() {
        return watertemp;
    }

    public void setWatertemp(Long watertemp) {
        this.watertemp = watertemp;
    }

    public Double getOiltemp() {
        return oiltemp;
    }

    public void setOiltemp(Double oiltemp) {
        this.oiltemp = oiltemp;
    }

    public String getCuruser() {
        return curuser;
    }

    public void setCuruser(String curuser) {
        this.curuser = curuser;
    }

    public Double getElecquantity() {
        return elecquantity;
    }

    public void setElecquantity(Double elecquantity) {
        this.elecquantity = elecquantity;
    }

    public Date getRecentchargtime() {
        return recentchargtime;
    }

    public void setRecentchargtime(Date recentchargtime) {
        this.recentchargtime = recentchargtime;
    }

    public Double getOilmass() {
        return oilmass;
    }

    public void setOilmass(Double oilmass) {
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

    public CarBaseInfoEntity getCarBaseInfoEntity() {
        return carBaseInfoEntity;
    }

    public void setCarBaseInfoEntity(CarBaseInfoEntity carBaseInfoEntity) {
        this.carBaseInfoEntity = carBaseInfoEntity;
    }

    public BatteryInfoEntity getBatteryInfoEntity() {
        return batteryInfoEntity;
    }

    public void setBatteryInfoEntity(BatteryInfoEntity batteryInfoEntity) {
        this.batteryInfoEntity = batteryInfoEntity;
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
}
