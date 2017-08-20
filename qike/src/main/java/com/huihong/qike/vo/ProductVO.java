package com.huihong.qike.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductVO implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String productd;
	
	private String procuctame;			//	商品 
	
	private String producticurl;		//	图片地址
	
	private Integer productTypeId;		//	商品类型ID
	
	private String typeName;			//	商品类型

    private String productDesc;			//	商品描述
    
    private BigDecimal productShowPrice;   	//	价格
    
	public BigDecimal getProductShowPrice() {
		return productShowPrice;
	}

	public void setProductShowPrice(BigDecimal productShowPrice) {
		this.productShowPrice = productShowPrice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductd() {
		return productd;
	}

	public void setProductd(String productd) {
		this.productd = productd;
	}

	public String getProcuctame() {
		return procuctame;
	}

	public void setProcuctame(String procuctame) {
		this.procuctame = procuctame;
	}

	public String getProducticurl() {
		return producticurl;
	}

	public void setProducticurl(String producticurl) {
		this.producticurl = producticurl;
	}

	public Integer getProductTypeId() {
		return productTypeId;
	}

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

}
