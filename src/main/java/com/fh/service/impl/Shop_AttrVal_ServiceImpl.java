package com.fh.service.impl;

import com.fh.dao.Shop_AttrVal_Dao;
import com.fh.entity.po.Shop_AttrVal;
import com.fh.entity.vo.AttrValVo;
import com.fh.service.Shop_AttrVal_Service;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ShaoQuanC
 * @create 2021-01-17 下午 19:17
 */
@Service
public class Shop_AttrVal_ServiceImpl implements Shop_AttrVal_Service {
    @Resource
    private Shop_AttrVal_Dao shopAttrValDao;

    @Override
    public Map list(AttrValVo valVo) {
        Map map = new HashMap();
        Integer count = shopAttrValDao.queryCount(valVo);
        map.put("count",count);

        List<Shop_AttrVal> vals = shopAttrValDao.queryAttrValData(valVo);
        map.put("list",vals);

        return map;
    }

    @Override
    public void addAttrVal(Shop_AttrVal shopAttrVal) {
        shopAttrValDao.addAttrVal(shopAttrVal);
    }

    @Override
    public void deleAttrValById(Integer id) {
        shopAttrValDao.deleAttrValById(id);
    }
}
