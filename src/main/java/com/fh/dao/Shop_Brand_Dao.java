package com.fh.dao;

import com.fh.entity.po.Shop_Brand;
import com.fh.entity.vo.BrandParamsVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author ShaoQuanC
 * @create 2021-01-13 下午 18:38
 */
public interface Shop_Brand_Dao {
    Integer queryCount(BrandParamsVo vo);

    List<Shop_Brand> queryBrandData(BrandParamsVo vo);

    void addBrand(Shop_Brand shopBrand);

    @Delete("delete from shop_brand where id=#{id} ")
    void deleteBrand(Integer id);

    @Update("update shop_brand set name=#{name},bandE=#{bandE},imgpath=#{imgpath},bandDesc=#{bandDesc},ord=#{ord},isdel=#{isdel},updateDate=#{updateDate},author=#{author} where id=#{id} ")
    void updateBrand(Shop_Brand shopBrand);

    @Update("update shop_brand set isdel=1 where id=#{id} ")
    void delBandById(Integer id);
}
