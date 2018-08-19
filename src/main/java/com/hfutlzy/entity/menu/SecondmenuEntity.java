package com.hfutlzy.entity.menu;
/**
 * ClassName:    SecondmenuEntity
 * Description:  二级菜单hibernate实体类
 * @author :       lzyli
 * CreateDate:   2018/4/9 21:39
 */
public class SecondmenuEntity {
    private String id;
    private String text;
    private String href;
    private String closeable;
    private int pid;
    private String authority;

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

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
