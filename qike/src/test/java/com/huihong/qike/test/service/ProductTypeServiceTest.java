package com.huihong.qike.test.service;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.huihong.qike.pojo.ProductType;
import com.huihong.qike.service.ProductTypeService;
import com.huihong.qike.test.TestBase;

public class ProductTypeServiceTest extends TestBase{

	
	@Autowired
	private ProductTypeService productTypeService;
	
	@Test
	public void addProductType() {
		
		ProductType type = new ProductType();
		type.setCreateTime(new Date());
		type.setLastUpdateTime(new Date());
		type.setTypeName("手机");
		
		productTypeService.addProductType(type);
		
	}
	
}
