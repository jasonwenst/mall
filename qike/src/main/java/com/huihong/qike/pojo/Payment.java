package com.huihong.qike.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Payment {
    private Integer paymentid;

    private Date lastupdatetime;

    private Date createtime;

    private String extpaymentid;

    private String paytype;

    private Integer orderid;

    private BigDecimal payprice;

    private Integer userid;

    public Integer getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(Integer paymentid) {
        this.paymentid = paymentid;
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

    public String getExtpaymentid() {
        return extpaymentid;
    }

    public void setExtpaymentid(String extpaymentid) {
        this.extpaymentid = extpaymentid;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public BigDecimal getPayprice() {
        return payprice;
    }

    public void setPayprice(BigDecimal payprice) {
        this.payprice = payprice;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}