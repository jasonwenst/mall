package com.huihong.qike.mapper;

import com.huihong.qike.pojo.OrderDtl;
import com.huihong.qike.pojo.OrderDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDtlMapper {
    int countByExample(OrderDtlExample example);

    int deleteByExample(OrderDtlExample example);

    int deleteByPrimaryKey(Integer orderDtlId);

    int insert(OrderDtl record);

    int insertSelective(OrderDtl record);

    List<OrderDtl> selectByExample(OrderDtlExample example);

    OrderDtl selectByPrimaryKey(Integer orderDtlId);

    int updateByExampleSelective(@Param("record") OrderDtl record, @Param("example") OrderDtlExample example);

    int updateByExample(@Param("record") OrderDtl record, @Param("example") OrderDtlExample example);

    int updateByPrimaryKeySelective(OrderDtl record);

    int updateByPrimaryKey(OrderDtl record);
}