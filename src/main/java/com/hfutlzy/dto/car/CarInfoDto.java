package com.hfutlzy.dto.car;

import com.hfutlzy.entity.car.CarBaseInfoEntity;
import com.hfutlzy.entity.car.CompanyEntity;

/**
 * @author : lzyli
 * CreateDate : 2018/6/6 9:12
 * Description :
 */

public class CarInfoDto {

    private String carno;
    private String powertype;
    private String licplate;
    private String company;

    public CarInfoDto(CarBaseInfoEntity carBaseInfoEntity, CompanyEntity companyEntity) {
        this.carno = carBaseInfoEntity.getCarno();
        this.powertype = carBaseInfoEntity.getPowertype();
        this.licplate = carBaseInfoEntity.getLicplate();
        this.company = companyEntity.getCompanyname();
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
