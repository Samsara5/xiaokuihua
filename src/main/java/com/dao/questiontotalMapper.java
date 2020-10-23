package com.dao;

import com.pojo.questiontotal;
import com.pojo.questiontotalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface questiontotalMapper {
    int countByExample(questiontotalExample example);

    int deleteByExample(questiontotalExample example);

    int insert(questiontotal record);

    int insertSelective(questiontotal record);

    List<questiontotal> selectByExample(questiontotalExample example);

    int updateByExampleSelective(@Param("record") questiontotal record, @Param("example") questiontotalExample example);

    int updateByExample(@Param("record") questiontotal record, @Param("example") questiontotalExample example);
}