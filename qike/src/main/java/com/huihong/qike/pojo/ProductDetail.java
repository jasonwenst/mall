package com.huihong.qike.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ProductDetail {
    private Integer productdetailid;

    private Date lastupdatetime;

    private Date createtime;

    private String detailpic;

    private Integer productid;

    private Integer productcolorid;

    private Integer productattrid;

    private Integer productamount;

    private BigDecimal productprice;

    public Integer getProductdetailid() {
        return productdetailid;
    }

    public void setProductdetailid(Integer productdetailid) {
        this.productdetailid = productdetailid;
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

    public String getDetailpic() {
        return detailpic;
    }

    public void setDetailpic(String detailpic) {
        this.detailpic = detailpic;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
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

    public BigDecimal getProductprice() {
        return productprice;
    }

    public void setProductprice(BigDecimal productprice) {
        this.productprice = productprice;
    }
}