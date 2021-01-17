package com.fh.dao;

import com.fh.entity.po.Shop_AttrVal;
import com.fh.entity.vo.AttrValVo;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

/**
 * @author ShaoQuanC
 * @create 2021-01-17 下午 19:16
 */
public interface Shop_AttrVal_Dao {
    Integer queryCount(AttrValVo valVo);

    List<Shop_AttrVal> queryAttrValData(AttrValVo valVo);

    @Insert("insert into shop_attrval (vname,nameCH,attrId) value (#{vname},#{nameCH},#{attrId} )" )
    void addAttrVal(Shop_AttrVal shopAttrVal);
}
