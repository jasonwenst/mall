package com.huihong.qike.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Integer id;

    private String productId;

    private Date lastUpdateTime;

    private Date createTime;

    private String procuctName;

    private String productPicUrl;

    private BigDecimal productShowPrice;

    private Integer productTypeId;

    private String productDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getProcuctName() {
        return procuctName;
    }

    public void setProcuctName(String procuctName) {
        this.procuctName = procuctName;
    }

    public String getProductPicUrl() {
        return productPicUrl;
    }

    public void setProductPicUrl(String productPicUrl) {
        this.productPicUrl = productPicUrl;
    }

    public BigDecimal getProductShowPrice() {
        return productShowPrice;
    }

    public void setProductShowPrice(BigDecimal productShowPrice) {
        this.productShowPrice = productShowPrice;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
}