package com.fh.entity.vo;

/**
 * @author ShaoQuanC
 * @create 2021-01-17 下午 19:31
 */
public class AttrValVo {

    private Integer id;

    private Integer attrId;

    private Integer currPage;

    private Integer size;

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
