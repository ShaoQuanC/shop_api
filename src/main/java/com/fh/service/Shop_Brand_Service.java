package com.fh.service;

import com.fh.entity.po.Shop_Brand;
import com.fh.entity.vo.BrandParamsVo;

import java.util.Map;

/**
 * @author ShaoQuanC
 * @create 2021-01-13 下午 18:38
 */
public interface Shop_Brand_Service {
    Map queryBrandDateByPage(BrandParamsVo vo);

    void addBrand(Shop_Brand shopBrand);

    void deleteBrand(Integer id);

    void updateBrand(Shop_Brand shopBrand);

    void delBandById(Integer id);
}
