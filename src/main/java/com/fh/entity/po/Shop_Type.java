package com.fh.entity.po;

import java.util.Date;

/**
 * @author ShaoQuanC
 * @create 2021-01-12 下午 17:00
 */
public class Shop_Type {
//    类型表
//
//    `id` int NULL COMMENT '主键',
//   `name` varchar NULL COMMENT '分类名称',
//   `pid` int NULL COMMENT '上级id',
//   `createDate` datetime NULL COMMENT '分类的创建时间',
//   `updateDate` datetime NULL COMMENT '修改时间',
//   `isDel` int NULL COMMENT '是否删除（0   未删除  1 删除）',
    private Integer id;

    private String name;

    private Integer pid;

    private Date createDate;

    private Date updateDate;

    private String author;

    private int isDel;

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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }
}
