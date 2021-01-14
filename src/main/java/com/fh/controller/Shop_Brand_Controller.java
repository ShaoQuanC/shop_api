package com.fh.controller;

import com.fh.entity.po.Shop_Brand;
import com.fh.entity.vo.BrandParamsVo;
import com.fh.entity.vo.ResultData;
import com.fh.service.Shop_Brand_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author ShaoQuanC
 * @create 2021-01-13 下午 18:39
 */
@RestController
@CrossOrigin
@RequestMapping("api/brand/")
public class Shop_Brand_Controller {
    @Autowired
    private Shop_Brand_Service shopBrandService;

    /* 1.查询所有的商品数据啊啊啊
   路径：http://192.168.1.237:8080/api/brand/list
   请求方式：get请求
   参数：
   返回值：{"code":200,"message":"提示",data:[{*}]}*/
    @GetMapping("list")
    public ResultData queryBrandDateByPage(BrandParamsVo vo){
        if(vo.getCurrPage()==null){
            return ResultData.error(400,"非法请求");
        }

        if(vo.getSize()==null){
            return ResultData.error(400,"非法请求");
        }
        Map rs =shopBrandService.queryBrandDateByPage(vo);
        return ResultData.success(rs);
    }

    /* 新增商品数据
   路径：http://localhost:8080/api/brand/add
   请求方式：post请求
   参数：
   返回值：{"code":200,"message":"提示",data:}*/
    @PostMapping("add")
    public ResultData addBrand(Shop_Brand shopBrand){
        shopBrandService.addBrand(shopBrand);
        return ResultData.success(null);
    }

    /* 删除商品数据
   路径：http://localhost:8080/api/brand/del
   请求方式：post请求
   参数：id
   返回值：{"code":200,"message":"提示",data:}*/
    @PostMapping("del")
    public ResultData deleteBrand(Integer id){
        shopBrandService.deleteBrand(id);
        return ResultData.success(null);

    }

    /* 修改商品数据
   路径：http://localhost:8080/api/brand/update
   请求方式：post请求。
   参数：id
   返回值：{"code":200,"message":"提示"}*/
    @PostMapping("update")
    public ResultData updateBrand(Shop_Brand shopBrand){
        Date date = new Date();
        shopBrand.setUpdateDate(date);

        shopBrandService.updateBrand(shopBrand);
        return ResultData.success(null);

    }

    @PostMapping("uploadFile")
    @ResponseBody
    public Map uploadFile(HttpServletRequest request, MultipartFile img) throws IOException {

        Map result=new HashMap();

        // 将文件保存到 服务器的指定目录下
        //获取项目的绝对路径
        String realPath = request.getServletContext().getRealPath("/");
        //java里面 file是操作文件或者文件夹
        String imgPath=realPath+"imgs/";
        //先操作文件或者夹的操作对象
        File f=new File(imgPath);
        //判断文件夹是否存在
        boolean exists = f.exists();
        //如果不存在
        if(exists==false) {
            //创建文件夹   多层目录   G:aaa/bb/cc
            f.mkdirs();
        }

        //获取文件的名称
        String fileName=img.getOriginalFilename();
        //文件的后缀
        String fileType=fileName.substring(fileName.lastIndexOf("."));
        //生成新名称
        String fileNewName= UUID.randomUUID().toString()+fileType;
        //拷贝文件
        //创建输出流
        FileOutputStream os=new FileOutputStream(new File(imgPath+"/"+fileNewName));

        //获取文件的输入流
        FileInputStream is=(FileInputStream) img.getInputStream();

        byte[] bts=new byte[1024*2];

        while (is.read(bts)!=-1) {
            os.write(bts);
        }
        //释放资源
        is.close();
        os.close();
        result.put("status", 200);
        result.put("url", "http://192.168.1.237:8080"+"/imgs/"+fileNewName);
        result.put("fileNewName",fileNewName);
        return result;
    }
}

