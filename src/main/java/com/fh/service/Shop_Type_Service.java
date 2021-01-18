package com.fh.service;

import com.fh.entity.po.Shop_Type;

import java.util.List;
import java.util.Map;

/**
 * @author ShaoQuanC
 * @create 2021-01-12 下午 17:04
 */
public interface Shop_Type_Service {
    List<Shop_Type> queryTypeData();

    Map queryTypeDataByPid(Integer pid);

    void addType(Shop_Type shopType);

    Shop_Type queryTypeDataById(Integer id);

    void updateType(Shop_Type shopType);

    void deleteTypeByIsDel(Integer id);
}
