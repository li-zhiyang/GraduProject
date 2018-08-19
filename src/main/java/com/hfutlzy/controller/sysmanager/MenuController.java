package com.hfutlzy.controller.sysmanager;

import com.hfutlzy.dto.menu.FmenuTableDto;
import com.hfutlzy.dto.menu.MenuTableDto;
import com.hfutlzy.dto.menu.SmenuTableDto;
import com.hfutlzy.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
/**
 * ClassName:    MenuController  
 * Description:  [一句话描述该类的功能]   
 * @author :       lzyli   
 * CreateDate:   2018/4/9 21:37
 */
@Controller
public class MenuController {


    private MenuService menuService;
    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }


    @RequestMapping("/menuManager/menuTable")
    @ResponseBody
    public List<MenuTableDto> getMenu(){
        return menuService.getMenu();
    }

    @RequestMapping("/menuManager/delete")
    @ResponseBody
    public boolean deleteMenu(MenuTableDto menuTableDto){

        return menuService.deleteMenu(menuTableDto);
    }

    /**
     * @author : lzyli
     * Description : 添加和编辑一级菜单
     */
    @RequestMapping("/menuManager/editf")
    @ResponseBody
    public boolean editfMenu(FmenuTableDto fmenuTableDto){

        return menuService.editfMenu(fmenuTableDto);
    }

    @RequestMapping("/menuManager/addf")
    @ResponseBody
    public boolean addfMenu(FmenuTableDto fmenuTableDto){

        return menuService.addfMenu(fmenuTableDto);
    }

    /**
     * @author : lzyli
     * Description : 添加和编辑二级菜单
     */
    @RequestMapping("/menuManager/edits")
    @ResponseBody
    public boolean editsMenu(SmenuTableDto smenuTableDto){

        return menuService.editsMenu(smenuTableDto);
    }

    @RequestMapping("/menuManager/adds")
    @ResponseBody
    public boolean addsMenu(SmenuTableDto smenuTableDto){

        return menuService.addsMenu(smenuTableDto);
    }
}
