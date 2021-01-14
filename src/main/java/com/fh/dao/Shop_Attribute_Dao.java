package com.fh.dao;

import com.fh.entity.po.Shop_Attribute;
import com.fh.entity.vo.AttributeVo;

import java.util.List;

/**
 * @author ShaoQuanC
 * @create 2021-01-14 下午 20:06
 */
public interface Shop_Attribute_Dao {
    Integer queryCount(AttributeVo vo);

    List<Shop_Attribute> queryData(AttributeVo vo);
}
