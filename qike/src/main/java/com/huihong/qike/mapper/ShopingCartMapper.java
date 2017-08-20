package com.huihong.qike.mapper;

import com.huihong.qike.pojo.ShopingCart;
import com.huihong.qike.pojo.ShopingCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopingCartMapper {
    int countByExample(ShopingCartExample example);

    int deleteByExample(ShopingCartExample example);

    int insert(ShopingCart record);

    int insertSelective(ShopingCart record);

    List<ShopingCart> selectByExample(ShopingCartExample example);

    int updateByExampleSelective(@Param("record") ShopingCart record, @Param("example") ShopingCartExample example);

    int updateByExample(@Param("record") ShopingCart record, @Param("example") ShopingCartExample example);
}