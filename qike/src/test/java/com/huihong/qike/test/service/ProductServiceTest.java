package com.huihong.qike.test.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.huihong.qike.service.ProductService;
import com.huihong.qike.test.TestBase;

public class ProductServiceTest extends TestBase{
	
	
	@Autowired
	private ProductService productService;
	
	
	
	@Test
	public void addProduct() {
		productService.pagingProduct(0, 10);
	}

}
