package com.fh.entity.po;

import java.util.Date;

/**
 * @author ShaoQuanC
 * @create 2021-01-14 下午 20:02
 */
public class Shop_Attribute {
   /* 属性表
    id    主键
    name  属性名   color
    nameCH  属性中文名   颜色
    typeId   分类的主键
    type     属性的类型    0 下拉框     1 单选框      2  复选框   3  输入框
    isSKU  是否为sku属性
    isDel   逻辑删除
    createDate
    updateDate
    author 操作人*/

   private Integer id;

   private String name;

   private String nameCH;

   private Integer typeId;

   private Integer type;

   private Integer isSKU;

   private int isDel;

   private Date createDate;

   private Date updateDate;

   private String author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCH() {
        return nameCH;
    }

    public void setNameCH(String nameCH) {
        this.nameCH = nameCH;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsSKU() {
        return isSKU;
    }

    public void setIsSKU(Integer isSKU) {
        this.isSKU = isSKU;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
