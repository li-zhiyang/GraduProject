package com.hfutlzy.dto.menu;

import com.hfutlzy.entity.menu.SecondmenuEntity;

/**
 * ClassName : SecondMenuDto
 * @author : lzyli
 * CreateDate : 2018/4/11 9:43
 * Description : 二级菜单数据转换类
 */
public class SecondMenuDto {

    private String id;
    private String text;
    private String href;
    private boolean closeable;
    private int pid;
    private String authority;

    public SecondMenuDto(SecondmenuEntity secondmenuEntity) {
        String right = "true";
        this.id = secondmenuEntity.getId();
        this.authority = secondmenuEntity.getAuthority();
        this.href = secondmenuEntity.getHref();
        this.pid = secondmenuEntity.getPid();
        this.text = secondmenuEntity.getText();
        this.closeable = right.equals(secondmenuEntity.getCloseable());
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

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public boolean getCloseable() {
        return closeable;
    }

    public void setCloseable(boolean closeable) {
        this.closeable = closeable;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
