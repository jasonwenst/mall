package com.huihong.qike.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ProductDetail {
    private Integer productDetailId;

    private Date lastUpdateTime;

    private Date createTime;

    private String detailPic;

    private Integer productId;

    private Integer productColorId;

    private Integer productAttrId;

    private Integer productAmount;

    private BigDecimal productPrice;

    public Integer getProductDetailId() {
        return productDetailId;
    }

    public void setProductDetailId(Integer productDetailId) {
        this.productDetailId = productDetailId;
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

    public String getDetailPic() {
        return detailPic;
    }

    public void setDetailPic(String detailPic) {
        this.detailPic = detailPic;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductColorId() {
        return productColorId;
    }

    public void setProductColorId(Integer productColorId) {
        this.productColorId = productColorId;
    }

    public Integer getProductAttrId() {
        return productAttrId;
    }

    public void setProductAttrId(Integer productAttrId) {
        this.productAttrId = productAttrId;
    }

    public Integer getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(Integer productAmount) {
        this.productAmount = productAmount;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

	@Override
	public String toString() {
		return "ProductDetail [productDetailId=" + productDetailId + ", lastUpdateTime=" + lastUpdateTime
				+ ", createTime=" + createTime + ", detailPic=" + detailPic + ", productId=" + productId
				+ ", productColorId=" + productColorId + ", productAttrId=" + productAttrId + ", productAmount="
				+ productAmount + ", productPrice=" + productPrice + "]";
	}
    
    
}