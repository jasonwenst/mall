package com.huihong.qike.service;

import com.huihong.qike.pojo.Product;
import com.huihong.qike.pojo.ProductDetail;
import com.huihong.qike.util.ResultData;

public interface ProductService {
	
	/**
	 * 分页查询商品
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	ResultData pagingProduct(int pageNum, int pageSize);
	
	/**
	 * 添加商品
	 * @param product
	 */
	void addProduct(Product product);
	
	
	/**
	 * 查询商品详情
	 * @param productId
	 * @return
	 */
	ResultData getProductDtl(int productId);
	
	/**
	 * 添加商品详情
	 * @param productDetail
	 */
	void addProductDtl(ProductDetail productDetail);

}
