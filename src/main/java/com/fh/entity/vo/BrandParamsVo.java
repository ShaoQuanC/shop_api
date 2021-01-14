package com.fh.entity.vo;

/**
 * @author ShaoQuanC
 * @create 2021-01-13 下午 18:44
 */
public class BrandParamsVo {

    private Integer currPage;


    private Integer size;

    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
