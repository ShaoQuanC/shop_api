package com.fh.controller;

import com.fh.entity.po.Shop_Shop;
import com.fh.entity.vo.ResultData;
import com.fh.service.Shop_Shop_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ShaoQuanC
 * @create 2021-01-18 下午 21:40
 */
@RestController
@CrossOrigin
@RequestMapping("api/shop")
public class Shop_Shop_Controller {

    @Autowired
    private Shop_Shop_Service shopShopService;

    /* 增加商品值数据
             路径：http://192.168.1.237:8080/api/shop/add
            请求方式：post请求
            参数：
            返回值：{"code":200,"message":"提示"}*/
    @PostMapping("add")
    public ResultData addShop(Shop_Shop shopShop){
        shopShopService.addShop(shopShop);
        return ResultData.success(null);
    }
}
