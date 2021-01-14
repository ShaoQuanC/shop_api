package com.fh.service;

import com.fh.entity.po.Shop_Attribute;
import com.fh.entity.vo.AttributeVo;

import java.util.Map;

/**
 * @author ShaoQuanC
 * @create 2021-01-14 下午 20:06
 */
public interface Shop_Attribute_Service {
    Map queryAttributeByPage(AttributeVo vo);

    void addAttribute(Shop_Attribute shopAttribute);
}
