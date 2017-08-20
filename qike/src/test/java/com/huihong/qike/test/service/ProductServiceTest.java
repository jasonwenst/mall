package com.huihong.qike.test.service;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.huihong.qike.pojo.Product;
import com.huihong.qike.pojo.ProductAttr;
import com.huihong.qike.pojo.ProductDetail;
import com.huihong.qike.service.ProductAttrService;
import com.huihong.qike.service.ProductService;
import com.huihong.qike.test.TestBase;
import com.huihong.qike.util.ResultData;

public class ProductServiceTest extends TestBase{
	
	
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductAttrService productAttrService;
	
	
	@Test
	public void addProduct() {
		
		Product product = new Product();
		product.setCreateTime(new Date());
		product.setLastUpdateTime(new Date());
		product.setProcuctName("pixel2");
		product.setProductDesc("谷歌（Google）pixel智能手机 白色 4GB+32GB 标配版");
		product.setProductId("XXXXXXXXX");
		product.setProductPicUrl("http://image.baidu.com/search");
		product.setProductShowPrice(new BigDecimal(5900));
		product.setProductTypeId(2);
		productService.addProduct(product);
	}
	
	@Test
	public void addProductDetail() {
		ProductDetail detail = new ProductDetail();
		detail.setCreateTime(new Date());
		detail.setDetailPic("www.agdagdafgewae.com");
		detail.setLastUpdateTime(new Date());
		detail.setProductAmount(3);
		detail.setProductAttrId(1);
		detail.setProductColorId(1);
		detail.setProductId(2);
		detail.setProductPrice(new BigDecimal(5900));
		
		productService.addProductDtl(detail);
	}
	
	@Test	
	public void addProductAttr() {
		ProductAttr productAttr = new ProductAttr();
		productAttr.setAtrrCode("PIXEL_VERSION");
		productAttr.setCreateTime(new Date());
		productAttr.setLastUpdateTime(new Date());
		productAttr.setTypeName("型号");
		productAttr.setTypeValue("pixel XL");
		productAttr.setUserId(2);
		productAttr.setProductId(2);
		productAttrService.addProductAttr(productAttr);
	}
	
	@Test
	public void getProductDtl() {
		ResultData Result = productService.getProductDtl(1);
		
		ProductDetail detail = (ProductDetail) Result.getData();
		
		System.out.println(detail.toString());
	}
	

}
