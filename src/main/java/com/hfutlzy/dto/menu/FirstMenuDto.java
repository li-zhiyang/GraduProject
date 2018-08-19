package com.hfutlzy.dto.menu;

import com.hfutlzy.entity.menu.FirstmenuEntity;

import java.util.List;

/**
 * ClassName : FirstMenuDto
 * @author : lzyli
 * CreateDate : 2018/4/11 9:43
 ** Description : 一级菜单数据转换类
 */
public class FirstMenuDto {

    private String id;
    private String text;
    private boolean collapsed;
    private String authority;
    private List<SecondMenuDto> items;
    private int code;
    //private String parentid = "0";

    public FirstMenuDto(FirstmenuEntity firstmenuEntity) {
        String right = "true";
        this.id = firstmenuEntity.getId();
        this.text = firstmenuEntity.getText();
        this.collapsed = right.equals(firstmenuEntity.getCollapsed());
        this.authority = firstmenuEntity.getAuthority();
        this.code = firstmenuEntity.getCode();
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

    public boolean getCollapsed() {
        return collapsed;
    }

    public void setCollapsed(boolean collapsed) {
        this.collapsed = collapsed;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public List<SecondMenuDto> getItems() {
        return items;
    }

    public void setItems(List<SecondMenuDto> items) {
        this.items = items;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
