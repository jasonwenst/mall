package com.huihong.qike.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.huihong.qike.mapper.ProductMapper;
import com.huihong.qike.pojo.Product;
import com.huihong.qike.pojo.ProductExample;
import com.huihong.qike.util.ErrorCode;
import com.huihong.qike.util.ResultData;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductMapper productMapper;

	@Override
	public ResultData pagingProduct(int pageNum, int pageSize) {
		
		PageHelper.startPage(pageNum, pageSize);
		List<Product> products = productMapper.selectByExample(new ProductExample());
		Page<Product> page = (Page<Product>) products;
		
		return new ResultData(page, "", ErrorCode.SUCCESS);
	}

}
