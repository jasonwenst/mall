package com.huihong.qike.pojo;

import java.util.Date;

public class Color {
    private Integer productcolorid;

    private Date lastupdatetime;

    private Date createtime;

    private String color;

    public Integer getProductcolorid() {
        return productcolorid;
    }

    public void setProductcolorid(Integer productcolorid) {
        this.productcolorid = productcolorid;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}