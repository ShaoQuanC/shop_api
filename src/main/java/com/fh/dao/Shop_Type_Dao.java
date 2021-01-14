package com.fh.dao;

import com.fh.entity.po.Shop_Type;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * @author ShaoQuanC
 * @create 2021-01-12 下午 17:03
 */
public interface Shop_Type_Dao {

    @Select("select * from shop_type where 1=1")
    List<Shop_Type> queryTypeData();

    @Select("select * from shop_type where pid=#{pid} ")
    Map queryTypeDataByPid(Integer pid);

    void addType(Shop_Type shopType);

    @Select("select * from shop_type where id=#{id}")
    Shop_Type queryTypeDataById(Integer id);

    @Update("update shop_type set name=#{name},pid=#{pid},createDate=#{createDate},updateDate=#{updateDate},author=#{author},isDel=#{isDel} where id=#{id} ")
    void updateType(Shop_Type shopType);


    //void updateTypeDataById(Integer id);
}
