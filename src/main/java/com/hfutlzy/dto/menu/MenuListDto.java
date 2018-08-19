package com.hfutlzy.dto.menu;

import java.util.List;
/**
 * ClassName:    MenuListDto
 * Description:  页面菜单格式化数据类
 * @author :       lzyli
 * CreateDate:   2018/4/9 21:39
 */
public class MenuListDto {

    private String id;
    private String homePage;
    private List<FirstMenuDto> menu;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public List<FirstMenuDto> getMenu() {
        return menu;
    }

    public void setMenu(List<FirstMenuDto> menu) {
        this.menu = menu;
    }

}
