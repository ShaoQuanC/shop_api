package com.fh.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectResult;

import java.io.InputStream;

/**
 * @author ShaoQuanC
 * @create 2021-01-18 11:55
 */
public class Oss {
    //oss仓库连接地址
    private static String endpoint = "oss-cn-qingdao.aliyuncs.com";
    //阿里云给你的id和密钥
    private static   String accessKeyId = "LTAI4G6R6EFYGAyQiD66V6Xy";
    private static  String accessKeySecret = "eWnj62DbKKC0qJvRuK6j9Bq8Cok506";
    //bucket仓库名称
    private static String bucket="sqcui";

    /*
       is  输入流
       fileName  保存的名字  //可以包含路径
     */
    public static String uploadFile(InputStream is, String fileName){
        // 下载jar包
        //创建工具类
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        //调用上传方法
        PutObjectResult putObjectResult = ossClient.putObject(bucket, fileName, is);
        //判断是否上传成功
        //释放资源
        ossClient.shutdown();
        //返回文件的存储路径
        return "https://"+bucket+"."+endpoint+"/"+fileName;
    };
}

