package com.huihong.qike.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huihong.qike.mapper.ProductTypeMapper;
import com.huihong.qike.pojo.ProductType;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {
	
	
	@Autowired
	private ProductTypeMapper productTypeMapper;

	@Override
	public void addProductType(ProductType type) {
		productTypeMapper.insert(type);
	}


}
