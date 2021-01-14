package com.fh.controller;

import com.fh.entity.po.Shop_Type;
import com.fh.entity.vo.ResultData;
import com.fh.service.Shop_Type_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ShaoQuanC
 * @create 2021-01-12 下午 17:03
 */
@RestController
@CrossOrigin
@RequestMapping("api/type/")
public class Shop_Type_Controller {

    @Autowired
    private Shop_Type_Service shopTypeService;

    /* 1.查询所有的分类数据据
    路径：http://localhost:8080/api/type/getData
    请求方式：get请求
    参数：
    返回值：{"code":200,"message":"提示",data:[{*}]}*/

    @GetMapping("getData")
    public ResultData getData(){
        List<Shop_Type> types = shopTypeService.queryTypeData();
        return ResultData.success(types);
    }

   /* 2    查询指定pid的数据
    路径：http://localhost:8080/api/type/getDataByPid
    请求方式：get请求
    参数：Pid
    返回值：{"code":200,"message":"提示",data:[{*}]}*/

   @PostMapping("getDataByPid")
   public ResultData getDataByPid(Integer pid){
       Map rs = shopTypeService.queryTypeDataByPid(pid);
       return ResultData.success(rs);

   }

    /* 新增分类
    路径：http://localhost:8080/api/type/add
    请求方式： post请求
    参数：pid，name
    返回值： {code:"",message:"",data:新增的id}*/
    @PostMapping("add")
    public ResultData addType(Shop_Type shopType){
        shopTypeService.addType(shopType);
        Integer id = shopType.getId();
        Map m = new HashMap();
        m.put("id",id);
        return ResultData.success(m);

    }

    /*
    路径：http://localhost:8080/api/type/updateTypeDataById
    请求方式： post请求
    参数：id （必传）     pid   name  isDel
    返回值： {code:"",message:""}*/
    @PostMapping("queryTypeDataById")
    public ResultData queryTypeDataById(Integer id){
        Shop_Type shopType =  shopTypeService.queryTypeDataById(id);
        return ResultData.success(shopType);
    }

    /* 修改
    路径：http://localhost:8080/api/type/update
    请求方式： post请求
    参数：id （必传）     pid   name  isDel
    返回值： {code:"",message:""}*/
    @PostMapping("update")
    public ResultData updateType(Shop_Type shopType){
        Date date = new Date();
        shopType.setUpdateDate(date);
        shopTypeService.updateType(shopType);
        return ResultData.success(null);
    }
}
