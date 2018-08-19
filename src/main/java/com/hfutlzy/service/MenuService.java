package com.hfutlzy.service;

import com.hfutlzy.dao.MenuDao;
import com.hfutlzy.entity.menu.FirstmenuEntity;
import com.hfutlzy.entity.menu.SecondmenuEntity;
import com.hfutlzy.dto.menu.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:    MenuService
 * Description:  菜单服务类
 *
 * @author :       lzyli
 * CreateDate:   2018/4/9 21:39
 */
@Service
public class MenuService {

    private final MenuDao menuDao;

    @Autowired
    public MenuService(MenuDao menuDao) {
        this.menuDao = menuDao;
    }

    public List<FirstMenuDto> getMenu(String authority) {
        List<FirstMenuDto> firstMenuDtos = new ArrayList<>();
        FirstMenuDto firstMenuDto = null;
        for (FirstmenuEntity firstmenuEntity : menuDao.getFirstMenu(authority)) {
            firstMenuDto = new FirstMenuDto(firstmenuEntity);
            firstMenuDto.setItems(getSecondMenu(firstMenuDto.getCode(), authority));
            firstMenuDtos.add(firstMenuDto);
        }
        return firstMenuDtos;

    }

    public List<MenuTableDto> getMenu() {

        List<MenuTableDto> menuTableDtos = new ArrayList<>();
        for(FirstmenuEntity firstmenuEntity : menuDao.getFirstMenu()){
            menuTableDtos.add(new MenuTableDto(firstmenuEntity));
        }

        for(SecondmenuEntity secondmenuEntity : menuDao.getSecondMenu()){
            menuTableDtos.add(new MenuTableDto(secondmenuEntity));
        }
        return menuTableDtos;
    }

    private List<SecondMenuDto> getSecondMenu(int pid, String authority) {
        List<SecondMenuDto> secondMenuDtos = new ArrayList<>();
        SecondMenuDto secondMenuDto = null;
        for (SecondmenuEntity secondmenuEntity : menuDao.getSecondMenu(pid, authority)) {
            secondMenuDto = new SecondMenuDto(secondmenuEntity);
            secondMenuDtos.add(secondMenuDto);
        }
        return secondMenuDtos;
    }

    public boolean deleteMenu(MenuTableDto menuTableDto){

        if(menuTableDto.getPid()==0){
            FirstmenuEntity firstmenuEntity = new FirstmenuEntity();
            firstmenuEntity.setId(menuTableDto.getId());
            firstmenuEntity.setCode(menuTableDto.getCode());
            firstmenuEntity.setAuthority(menuTableDto.getAuthority());
            firstmenuEntity.setText(menuTableDto.getText());
            firstmenuEntity.setCollapsed(menuTableDto.getCollapsed());
            return menuDao.deleteFirstMenu(firstmenuEntity);
        }else{
            SecondmenuEntity secondmenuEntity = new SecondmenuEntity();
            secondmenuEntity.setAuthority(menuTableDto.getAuthority());
            secondmenuEntity.setCloseable(menuTableDto.getCloseable());
            secondmenuEntity.setHref(menuTableDto.getHref());
            secondmenuEntity.setId(menuTableDto.getId());
            secondmenuEntity.setPid(menuTableDto.getPid());
            secondmenuEntity.setText(menuTableDto.getText());
            return menuDao.deleteSecondMenu(secondmenuEntity);
        }
    }
    /**
     * @author : lzyli
     * Description : 添加和编辑一级菜单
     */
    public boolean addfMenu(FmenuTableDto fmenuTableDto){

        FirstmenuEntity firstmenuEntity = new FirstmenuEntity();
        firstmenuEntity.setId(fmenuTableDto.getFid());
        firstmenuEntity.setCode(fmenuTableDto.getFcode());
        firstmenuEntity.setAuthority(fmenuTableDto.getFauthority());
        firstmenuEntity.setText(fmenuTableDto.getFtext());
        firstmenuEntity.setCollapsed(fmenuTableDto.getFcollapsed());

        return menuDao.addFirstMenu(firstmenuEntity);
    }

    public boolean editfMenu(FmenuTableDto fmenuTableDto){
        FirstmenuEntity firstmenuEntity = new FirstmenuEntity();
        firstmenuEntity.setId(fmenuTableDto.getFid());
        firstmenuEntity.setCode(fmenuTableDto.getFcode());
        firstmenuEntity.setAuthority(fmenuTableDto.getFauthority());
        firstmenuEntity.setText(fmenuTableDto.getFtext());
        firstmenuEntity.setCollapsed(fmenuTableDto.getFcollapsed());
        return menuDao.editFirstMenu(firstmenuEntity);
    }

    /**
     * @author : lzyli
     * Description : 添加和编辑二级菜单
     */
    public boolean addsMenu(SmenuTableDto smenuTableDto){

        SecondmenuEntity secondmenuEntity = new SecondmenuEntity();
        secondmenuEntity.setAuthority(smenuTableDto.getSauthority());
        secondmenuEntity.setCloseable(smenuTableDto.getScloseable());
        secondmenuEntity.setHref(smenuTableDto.getShref());
        secondmenuEntity.setId(smenuTableDto.getSid());
        secondmenuEntity.setPid(smenuTableDto.getSpid());
        secondmenuEntity.setText(smenuTableDto.getStext());
        return menuDao.addSecondMenu(secondmenuEntity);
    }

    public boolean editsMenu(SmenuTableDto smenuTableDto){

        SecondmenuEntity secondmenuEntity = new SecondmenuEntity();
        secondmenuEntity.setAuthority(smenuTableDto.getSauthority());
        secondmenuEntity.setCloseable(smenuTableDto.getScloseable());
        secondmenuEntity.setHref(smenuTableDto.getShref());
        secondmenuEntity.setId(smenuTableDto.getSid());
        secondmenuEntity.setPid(smenuTableDto.getSpid());
        secondmenuEntity.setText(smenuTableDto.getStext());
        return menuDao.editSecondMenu(secondmenuEntity);
    }

}
