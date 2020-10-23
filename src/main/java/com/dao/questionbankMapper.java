package com.dao;

import com.pojo.questionbank;
import com.pojo.questionbankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface questionbankMapper {
    int countByExample(questionbankExample example);

    int deleteByExample(questionbankExample example);

    int insert(questionbank record);

    int insertSelective(questionbank record);

    List<questionbank> selectByExample(questionbankExample example);

    int updateByExampleSelective(@Param("record") questionbank record, @Param("example") questionbankExample example);

    int updateByExample(@Param("record") questionbank record, @Param("example") questionbankExample example);
}