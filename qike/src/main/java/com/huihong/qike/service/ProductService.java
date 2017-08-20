package com.huihong.qike.service;

import com.huihong.qike.util.ResultData;

public interface ProductService {
	
	/**
	 * 分页查询商品
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	ResultData pagingProduct(int pageNum, int pageSize);

}
