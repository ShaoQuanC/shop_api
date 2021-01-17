package com.fh.dao;

import com.fh.entity.po.Shop_AttrVal;
import com.fh.entity.vo.AttrValVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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

    @Delete("delete from shop_attrval where id=#{id} ")
    void deleAttrValById(Integer id);

    @Select("select * from shop_attrval where id=#{id} ")
    Shop_AttrVal queryAttrValDataById(Integer id);

    @Update("update shop_attrval set vname=#{vname},nameCH=#{nameCH} where id=#{id} ")
    void updateAttrValDataById(Shop_AttrVal shopAttrVal);

}
