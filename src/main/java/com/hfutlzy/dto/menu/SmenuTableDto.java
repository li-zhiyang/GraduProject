package com.hfutlzy.dto.menu;
/**
 * @author : lzyli
 * CreateDate : 2018/4/26 21:07
 * Description :
 */
public class SmenuTableDto {

    private String sid;
    private String stext;
    private String sauthority;
    private String shref;
    private String scloseable;
    private int spid;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getStext() {
        return stext;
    }

    public void setStext(String stext) {
        this.stext = stext;
    }

    public String getSauthority() {
        return sauthority;
    }

    public void setSauthority(String sauthority) {
        this.sauthority = sauthority;
    }

    public String getShref() {
        return shref;
    }

    public void setShref(String shref) {
        this.shref = shref;
    }

    public String getScloseable() {
        return scloseable;
    }

    public void setScloseable(String scloseable) {
        this.scloseable = scloseable;
    }

    public int getSpid() {
        return spid;
    }

    public void setSpid(int spid) {
        this.spid = spid;
    }
}
