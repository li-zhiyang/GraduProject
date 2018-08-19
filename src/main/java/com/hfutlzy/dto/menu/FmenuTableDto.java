package com.hfutlzy.dto.menu;
/**
 * @author : lzyli
 * CreateDate : 2018/4/26 21:07
 * Description :
 */
public class FmenuTableDto {

    private String fid;
    private String ftext;
    private String fcollapsed;
    private String fauthority;;
    private int fcode;

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getFtext() {
        return ftext;
    }

    public void setFtext(String ftext) {
        this.ftext = ftext;
    }

    public String getFcollapsed() {
        return fcollapsed;
    }

    public void setFcollapsed(String fcollapsed) {
        this.fcollapsed = fcollapsed;
    }

    public String getFauthority() {
        return fauthority;
    }

    public void setFauthority(String fauthority) {
        this.fauthority = fauthority;
    }

    public int getFcode() {
        return fcode;
    }

    public void setFcode(int fcode) {
        this.fcode = fcode;
    }
}
