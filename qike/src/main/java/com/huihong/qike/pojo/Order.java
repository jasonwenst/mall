package com.huihong.qike.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer orderid;

    private Date lastupdatetime;

    private Date createtime;

    private Integer userid;

    private Integer totalintegration;

    private BigDecimal totalprice;

    private Integer addressid;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getTotalintegration() {
        return totalintegration;
    }

    public void setTotalintegration(Integer totalintegration) {
        this.totalintegration = totalintegration;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }
}