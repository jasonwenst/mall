package com.huihong.qike.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huihong.qike.pojo.ProductDetail;
import com.huihong.qike.pojo.ProductDetailExample;

public interface ProductDetailMapper {
    int countByExample(ProductDetailExample example);

    int deleteByExample(ProductDetailExample example);

    int deleteByPrimaryKey(Integer productDetailId);

    int insert(ProductDetail record);

    int insertSelective(ProductDetail record);

    List<ProductDetail> selectByExample(ProductDetailExample example);

    ProductDetail selectByPrimaryKey(Integer productDetailId);

    int updateByExampleSelective(@Param("record") ProductDetail record, @Param("example") ProductDetailExample example);

    int updateByExample(@Param("record") ProductDetail record, @Param("example") ProductDetailExample example);

    int updateByPrimaryKeySelective(ProductDetail record);

    int updateByPrimaryKey(ProductDetail record);
    
    ProductDetail selectByProductId(Integer productId);
    
}