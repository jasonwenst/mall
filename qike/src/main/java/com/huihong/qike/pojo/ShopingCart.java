package com.huihong.qike.pojo;

import java.util.Date;

public class ShopingCart {
    private Date lastupdatetime;

    private Date createtime;

    private Integer userid;

    private Integer productdetailid;

    private String amount;

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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getProductdetailid() {
        return productdetailid;
    }

    public void setProductdetailid(Integer productdetailid) {
        this.productdetailid = productdetailid;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}