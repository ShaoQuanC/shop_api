package com.fh.service.impl;

import com.fh.dao.Shop_Attribute_Dao;
import com.fh.entity.po.Shop_Attribute;
import com.fh.entity.vo.AttributeVo;
import com.fh.service.Shop_Attribute_Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ShaoQuanC
 * @create 2021-01-14 下午 20:06
 */
@Service
public class Shop_Attribute_ServiceImpl implements Shop_Attribute_Service {
    @Resource
    private Shop_Attribute_Dao shopAttributeDao;

    @Override
    public Map queryAttributeByPage(AttributeVo vo) {
        Map m = new HashMap();
        Integer count = shopAttributeDao.queryCount(vo);
        m.put("count",count);

        List<Shop_Attribute> attributes =  shopAttributeDao.queryData(vo);
        m.put("list",attributes);

        return m;
    }

    @Override
    public void addAttribute(Shop_Attribute shopAttribute) {
        shopAttributeDao.addAttribute(shopAttribute);
    }

    @Override
    public void updateAttribute(Shop_Attribute shopAttribute) {
        shopAttributeDao.updateAttribute(shopAttribute);
    }

    @Override
    public void deleteAttribute(Integer id) {
        shopAttributeDao.deleteAttribute(id);
    }
}
