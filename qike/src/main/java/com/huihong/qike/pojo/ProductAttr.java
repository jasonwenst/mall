package com.huihong.qike.pojo;

import java.util.Date;

public class ProductAttr {
    private Integer productAttrId;

    private Date lastUpdateTime;

    private Date createTime;

    private String atrrCode;

    private Integer userId;

    private String typeValue;

    private String typeName;

    public Integer getProductAttrId() {
        return productAttrId;
    }

    public void setProductAttrId(Integer productAttrId) {
        this.productAttrId = productAttrId;
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
}