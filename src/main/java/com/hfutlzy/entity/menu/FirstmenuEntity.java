package com.hfutlzy.entity.menu;

/**
 * ClassName:    FirstmenuEntity
 * Description:  一级菜单hibernate实体类
 * @author :       lzyli
 * CreateDate:   2018/4/9 21:39
 */
public class FirstmenuEntity {
    private String id;
    private String text;
    private String collapsed;
    private String authority;
    private int code;

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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
