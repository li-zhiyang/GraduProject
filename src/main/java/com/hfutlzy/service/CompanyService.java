package com.hfutlzy.service;

import com.hfutlzy.common.jstree.TreeNode;
import com.hfutlzy.dao.CompanyDao;
import com.hfutlzy.entity.car.CompanyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : lzyli
 * CreateDate : 2018/5/6 17:02
 * Description :
 */
@Service
public class CompanyService {

    private CompanyDao companyDao;

    @Autowired
    public CompanyService(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    /**
     * @author : lzyli
     * Description : 获取树形菜单的公司列表
     */
    public List<TreeNode> getAllCompany() {
        List<TreeNode> treeNodes = new ArrayList<>();
        TreeNode treeNode;
        List<CompanyEntity> companyEntities = companyDao.getAllCompany();

        for (CompanyEntity companyEntity : companyEntities) {

            treeNode = new TreeNode(companyEntity.getCompanyid(), companyEntity.getCompanyname());
            treeNodes.add(treeNode);
        }

        return treeNodes;
    }

    public List<Object> getCom() {
        List<Object> comlist = new ArrayList<>();
        List<Object> objects = companyDao.getCom();
        comlist.addAll(objects);
        return comlist;
    }
}
