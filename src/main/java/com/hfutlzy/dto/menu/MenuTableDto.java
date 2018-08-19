package com.hfutlzy.dto.menu;

import com.hfutlzy.entity.menu.FirstmenuEntity;
import com.hfutlzy.entity.menu.SecondmenuEntity;

/**
 * @author : lzyli
 * CreateDate : 2018/4/17 22:13
 * Description :
 */
public class MenuTableDto {

    private String id;
    private String text;
    private String collapsed;
    private String authority;
    private String href;
    private String closeable;
    private int pid;
    private int code;

    public MenuTableDto() {
    }

    public MenuTableDto(FirstmenuEntity firstmenuEntity) {
        this.id = firstmenuEntity.getId();
        this.text = firstmenuEntity.getText();
        this.collapsed = firstmenuEntity.getCollapsed();
        this.authority = firstmenuEntity.getAuthority().trim();
        this.pid = 0;
        this.code=firstmenuEntity.getCode();
    }

    public MenuTableDto(SecondmenuEntity secondmenuEntity) {
        this.id = secondmenuEntity.getId();
        this.text = secondmenuEntity.getText();
        this.authority = secondmenuEntity.getAuthority().trim();
        this.href = secondmenuEntity.getHref();
        this.closeable = secondmenuEntity.getCloseable();
        this.pid = secondmenuEntity.getPid();
        this.code=-1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCollapsed() {
        return collapsed;
    }

    public void setCollapsed(String collapsed) {
        this.collapsed = collapsed;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getCloseable() {
        return closeable;
    }

    public void setCloseable(String closeable) {
        this.closeable = closeable;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
