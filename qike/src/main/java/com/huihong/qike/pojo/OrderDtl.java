package com.huihong.qike.pojo;

import java.util.Date;

public class OrderDtl {
    private Integer orderdtlid;

    private Date lastupdatetime;

    private Date createtime;

    private Integer orderid;

    private Integer prodcutdtlid;

    private Integer productcolorid;

    private Integer productattrid;

    private Integer productamount;

    private Long productprice;

    private Integer integration;

    private String detailpic;

    public Integer getOrderdtlid() {
        return orderdtlid;
    }

    public void setOrderdtlid(Integer orderdtlid) {
        this.orderdtlid = orderdtlid;
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

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getProdcutdtlid() {
        return prodcutdtlid;
    }

    public void setProdcutdtlid(Integer prodcutdtlid) {
        this.prodcutdtlid = prodcutdtlid;
    }

    public Integer getProductcolorid() {
        return productcolorid;
    }

    public void setProductcolorid(Integer productcolorid) {
        this.productcolorid = productcolorid;
    }

    public Integer getProductattrid() {
        return productattrid;
    }

    public void setProductattrid(Integer productattrid) {
        this.productattrid = productattrid;
    }

    public Integer getProductamount() {
        return productamount;
    }

    public void setProductamount(Integer productamount) {
        this.productamount = productamount;
    }

    public Long getProductprice() {
        return productprice;
    }

    public void setProductprice(Long productprice) {
        this.productprice = productprice;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public String getDetailpic() {
        return detailpic;
    }

    public void setDetailpic(String detailpic) {
        this.detailpic = detailpic;
    }
}