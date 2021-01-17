package com.fh.service;

import com.fh.entity.po.Shop_AttrVal;
import com.fh.entity.vo.AttrValVo;

import java.util.Map;

/**
 * @author ShaoQuanC
 * @create 2021-01-17 下午 19:17
 */
public interface Shop_AttrVal_Service {
    Map list(AttrValVo valVo);

    void addAttrVal(Shop_AttrVal shopAttrVal);

    void deleAttrValById(Integer id);
}
