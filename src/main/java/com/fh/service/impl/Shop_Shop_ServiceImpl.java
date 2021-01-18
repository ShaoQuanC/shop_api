package com.fh.service.impl;

import com.fh.dao.Shop_Shop_Dao;
import com.fh.entity.po.Shop_Shop;
import com.fh.service.Shop_Shop_Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ShaoQuanC
 * @create 2021-01-18 下午 21:40
 */
@Service
public class Shop_Shop_ServiceImpl implements Shop_Shop_Service {

    @Resource
    private Shop_Shop_Dao shopShopDao;

    @Override
    public void addShop(Shop_Shop shopShop) {
        shopShopDao.addShop(shopShop);
    }
}
