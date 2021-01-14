package com.fh.entity.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author ShaoQuanC
 * @create 2021-01-13 下午 18:31
 */
public class Shop_Brand {
 /*   品牌表
    id  主键
    name    名称
    bandE  首字母
    imgpath   图片log
    bandDesc  品牌介绍
    ord   排序字段
    isdel  逻辑删除
    createDate   创建时间
    updateDate   修改时间
    author   操作人*/
    private Integer id;

    private String name;

    private String bandE;

    private String imgpath;

    private String bandDesc;

    private Integer ord;

    private Integer isdel;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")/*,timezone = "GMT+8"*/
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

    public String getBandE() {
        return bandE;
    }

    public void setBandE(String bandE) {
        this.bandE = bandE;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getBandDesc() {
        return bandDesc;
    }

    public void setBandDesc(String bandDesc) {
        this.bandDesc = bandDesc;
    }

    public Integer getOrd() {
        return ord;
    }

    public void setOrd(Integer ord) {
        this.ord = ord;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
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
