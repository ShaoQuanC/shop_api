package com.fh.controller;

import com.fh.entity.po.Shop_AttrVal;
import com.fh.entity.vo.AttrValVo;
import com.fh.entity.vo.ResultData;
import com.fh.service.Shop_AttrVal_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author ShaoQuanC
 * @create 2021-01-17 下午 19:18
 */
@RestController
@CrossOrigin
@RequestMapping("api/val/")
public class Shop_AttrVal_Controller {
    @Autowired
    private Shop_AttrVal_Service shopAttrValService;

    /* 查询所有的属性值数据
             路径：http://192.168.1.237:8080/api/val/list
            请求方式：get请求
            参数：id  currPage  size
            返回值：{"code":200,"message":"提示",data:[{*}]}*/
    @GetMapping("list")
    public ResultData list(AttrValVo valVo){
        if (valVo.getId()==null){
            return ResultData.error(400,"非法参数");
        }
        if (valVo.getCurrPage()==null){
            return ResultData.error(400,"非法参数");
        }
        if (valVo.getSize()==null){
            return ResultData.error(400,"非法参数");
        }

        Map map = shopAttrValService.list(valVo);
        return ResultData.success(map);
    }

    /* 增加属性值数据
             路径：http://192.168.1.237:8080/api/val/add
            请求方式：post请求
            参数：
            返回值：{"code":200,"message":"提示"}*/
    @PostMapping("add")
    public ResultData addAttrVal(Shop_AttrVal shopAttrVal){
        shopAttrValService.addAttrVal(shopAttrVal);
        return ResultData.success("");

    }

    /* 删除属性值数据
             路径：http://192.168.1.237:8080/api/val/del
            请求方式：delete请求
            参数：id
            返回值：{"code":200,"message":"提示"}*/
    @DeleteMapping("del")
    public ResultData deleAttrValById(Integer id){
        shopAttrValService.deleAttrValById(id);
        return ResultData.success("");
    }

    /* 回显属性值数据
             路径：http://192.168.1.237:8080/api/val/queryAttrValDataById
            请求方式：post请求
            参数：id
            返回值：{"code":200,"message":"提示","data":{*}*/
    @PostMapping("queryAttrValDataById")
    public ResultData queryAttrValDataById(Integer id){
        Shop_AttrVal shopAttrVal = shopAttrValService.queryAttrValDataById(id);
        return ResultData.success(shopAttrVal);

    }

    /* 修改属性值数据
             路径：http://192.168.1.237:8080/api/val/update
            请求方式：post请求
            参数：id
            返回值：{"code":200,"message":"提示","data":{*}*/
    @PostMapping("update")
    public ResultData updateAttrValDataById(Shop_AttrVal shopAttrVal){
        shopAttrValService.updateAttrValDataById(shopAttrVal);
        return ResultData.success("");
    }
}
