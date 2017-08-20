package com.huihong.qike.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.huihong.qike.service.ProductService;
import com.huihong.qike.util.ResultData;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResultData listProduct(int pageNum, int pageSize) {
		
		return productService.pagingProduct(pageNum, pageSize);
		
	}
	
	
	
}
