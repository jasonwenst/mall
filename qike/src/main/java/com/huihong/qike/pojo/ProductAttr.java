package com.huihong.qike.pojo;

import java.util.Date;

public class ProductAttr {
    private Integer productAttrId;

    private Integer productId;

    private String atrrCode;

    private Integer userId;

    private String typeValue;

    private String typeName;

    private Date createTime;

    private Date lastUpdateTime;

    public Integer getProductAttrId() {
        return productAttrId;
    }

    public void setProductAttrId(Integer productAttrId) {
        this.productAttrId = productAttrId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getAtrrCode() {
        return atrrCode;
    }

    public void setAtrrCode(String atrrCode) {
        this.atrrCode = atrrCode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(String typeValue) {
        this.typeValue = typeValue;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}