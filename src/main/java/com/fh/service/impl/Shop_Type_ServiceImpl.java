package com.fh.service.impl;

import com.fh.dao.Shop_Type_Dao;
import com.fh.entity.po.Shop_Type;
import com.fh.service.Shop_Type_Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author ShaoQuanC
 * @create 2021-01-12 下午 17:04
 */

@Service
public class Shop_Type_ServiceImpl implements Shop_Type_Service {
    @Resource
    private Shop_Type_Dao shopTypeDao;


    @Override
    public List<Shop_Type> queryTypeData() {
        return shopTypeDao.queryTypeData();
    }

    @Override
    public Map queryTypeDataByPid(Integer pid) {
        return shopTypeDao.queryTypeDataByPid(pid);
    }

    @Override
    public void addType(Shop_Type shopType) {
        shopTypeDao.addType(shopType);
    }

    @Override
    public Shop_Type queryTypeDataById(Integer id) {
        return shopTypeDao.queryTypeDataById(id);
    }

    @Override
    public void updateType(Shop_Type shopType) {
        shopTypeDao.updateType(shopType);
    }


}
