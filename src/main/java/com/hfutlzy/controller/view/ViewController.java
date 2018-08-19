package com.hfutlzy.controller.view;

import com.hfutlzy.dto.menu.MenuListDto;
import com.hfutlzy.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/view/")
/**
 * ClassName:    ViewController
 * Description:  视图控制器，返回页面地址
 * @author :       lzyli
 * CreateDate:   2018/4/9 21:39
 */
public class ViewController {

    private MenuService menuService;
    @Autowired
    public ViewController(MenuService menuService) {
        this.menuService = menuService;
    }
	
	@RequestMapping("index")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("login")
    public String getLogin(){
        return "login";
    }

    @RequestMapping("carmanager/homepage")
    public String getHomepage(){
        return "carmanager/homepage";
    }

	@RequestMapping("sysmanager/menuedit")
    public String getMenuEdit(){
        return "sysmanager/menuedit";
    }

    @RequestMapping("sysmanager/useredit")
    public String getUserEdit(){
        return "sysmanager/useredit";
    }

    @RequestMapping("sysmanager/carinfoin")
    public String getCarInfoIn(){
        return "sysmanager/carinfoin";
    }

    @RequestMapping("sysmanager/batinfoin")
    public String getBatInfoIn(){
        return "sysmanager/batinfoin";
    }

    @RequestMapping("carmanager/carstalist")
    public String getCarStaList(){
        return "carmanager/carstalist";
    }

    @RequestMapping("carmanager/carmonitor")
    public String getCarMonitor(){
        return "carmanager/carmonitor";
    }

    @RequestMapping("carmanager/oilinfo")
    public String getOilInfo(){
        return "carmanager/oilinfo";
    }

    @RequestMapping("carmanager/batinfo")
    public String getBatInfo(){
        return "carmanager/batinfo";
    }

    @RequestMapping("report/effectlist")
    public String getEffectList(){
        return "report/effectlist";
    }

    @RequestMapping("report/safelist")
    public String getSafeList(){
        return "report/safelist";
    }

    @RequestMapping("menu")
    @ResponseBody
    /**
     * @author : lzyli
     * MethodName : getMenu
     * @param : []
     * @return : java.util.List<com.hfutlzy.dto.menu.MenuListDto>
     * Description : 获取菜单内容，反馈给页面进行展示
     */
    public List<MenuListDto> getMenu(HttpServletRequest httpServletRequest){

        String authority = (String) httpServletRequest.getSession().getAttribute("authority");

        MenuListDto menuListDto = new MenuListDto();
        menuListDto.setId("menu");
        menuListDto.setHomePage("homepage");

        menuListDto.setMenu(menuService.getMenu(authority));

        List<MenuListDto> lMenu = new ArrayList<>();
        lMenu.add(menuListDto);
        return lMenu;
    }

}
