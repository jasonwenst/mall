package com.huihong.qike.mapper;

import com.huihong.qike.pojo.Base;
import com.huihong.qike.pojo.BaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseMapper {
    int countByExample(BaseExample example);

    int deleteByExample(BaseExample example);

    int insert(Base record);

    int insertSelective(Base record);

    List<Base> selectByExample(BaseExample example);

    int updateByExampleSelective(@Param("record") Base record, @Param("example") BaseExample example);

    int updateByExample(@Param("record") Base record, @Param("example") BaseExample example);
}