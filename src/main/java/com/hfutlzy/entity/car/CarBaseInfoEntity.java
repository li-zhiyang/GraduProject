package com.hfutlzy.entity.car;
/**
 * @author : lzyli
 * CreateDate : 2018/4/29 8:55
 * Description :
 */
public class CarBaseInfoEntity {

    private String carno;
    private String powertype;
    private String licplate;
    private CompanyEntity companyEntity;

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

    public CompanyEntity getCompanyEntity() {
        return companyEntity;
    }

    public void setCompanyEntity(CompanyEntity companyEntity) {
        this.companyEntity = companyEntity;
    }
}
