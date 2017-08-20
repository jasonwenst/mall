package com.huihong.qike.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huihong.qike.mapper.ProductAttrMapper;
import com.huihong.qike.pojo.ProductAttr;

@Service
public class ProductAttrServiceImpl implements ProductAttrService {
	
	
	@Autowired
	private ProductAttrMapper productAttrMapper;

	@Override
	public void addProductAttr(ProductAttr productAttr) {
		productAttrMapper.insert(productAttr);
	}

}
