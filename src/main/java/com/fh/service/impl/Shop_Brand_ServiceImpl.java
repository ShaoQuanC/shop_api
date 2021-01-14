package com.fh.service.impl;

import com.fh.dao.Shop_Brand_Dao;
import com.fh.entity.po.Shop_Brand;
import com.fh.entity.vo.BrandParamsVo;
import com.fh.service.Shop_Brand_Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ShaoQuanC
 * @create 2021-01-13 下午 18:39
 */
@Service
public class Shop_Brand_ServiceImpl implements Shop_Brand_Service {
    @Resource
    private Shop_Brand_Dao shopBrandDao;

    @Override
    public Map queryBrandDateByPage(BrandParamsVo vo) {
        Map map = new HashMap();

        Integer count = shopBrandDao.queryCount(vo);
        map.put("count",count);

        List<Shop_Brand> brands = shopBrandDao.queryBrandData(vo);
        map.put("list",brands);
        return map;
    }

    @Override
    public void addBrand(Shop_Brand shopBrand) {
        shopBrandDao.addBrand(shopBrand);
    }

    @Override
    public void deleteBrand(Integer id) {
        shopBrandDao.deleteBrand(id);

    }

    @Override
    public void updateBrand(Shop_Brand shopBrand) {
        shopBrandDao.updateBrand(shopBrand);
    }
}
