package com.fh.controller;

import com.fh.entity.po.Shop_Attribute;
import com.fh.entity.vo.AttributeVo;
import com.fh.entity.vo.ResultData;
import com.fh.service.Shop_Attribute_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

/**
 * @author ShaoQuanC
 * @create 2021-01-14 下午 20:07
 */

@RestController
@RequestMapping("api/attribute/")
public class Shop_Attribute_Controller {
    @Autowired
    private Shop_Attribute_Service shopAttributeService;

    /* 查询所有的属性数据
         路径：http://192.168.1.237:8080/api/attribute/list
        请求方式：get请求
        参数：
        返回值：{"code":200,"message":"提示",data:[{*}]}*/
    @GetMapping("list")
    public ResultData queryAttributeByPage(AttributeVo vo){

        if (vo.getCurrPage()==null){
            return ResultData.error(400,"非法参数");
        }
        if (vo.getSize()==null){
            return ResultData.error(400,"非法参数");
        }

        Map map = shopAttributeService.queryAttributeByPage(vo);
        return ResultData.success(map);

    }

    /* 新增属性数据
   路径：http://192.168.1.237:8080/api/attribute/add
   请求方式：post请求
   参数：
   返回值：{"code":200,"message":"提示",data:}*/
    @PostMapping("add")
    public ResultData addAttribute(Shop_Attribute shopAttribute){
        shopAttributeService.addAttribute(shopAttribute);
        return ResultData.success(null);
    }
    /* 修改属性数据
  路径：http://192.168.1.237:8080/api/attribute/update
  请求方式：post请求
  参数：
  返回值：{"code":200,"message":"提示",data:}*/
    @PostMapping("update")
    public ResultData updateAttribute(Shop_Attribute shopAttribute){
        Date updateDate = new Date();
        shopAttribute.setUpdateDate(updateDate);

        shopAttributeService.updateAttribute(shopAttribute);
        return ResultData.success(null);


    }
}
