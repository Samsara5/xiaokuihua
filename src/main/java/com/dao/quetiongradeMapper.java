package com.dao;

import com.pojo.quetiongrade;
import com.pojo.quetiongradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface quetiongradeMapper {
    int countByExample(quetiongradeExample example);

    int deleteByExample(quetiongradeExample example);

    int insert(quetiongrade record);

    int insertSelective(quetiongrade record);

    List<quetiongrade> selectByExample(quetiongradeExample example);

    int updateByExampleSelective(@Param("record") quetiongrade record, @Param("example") quetiongradeExample example);

    int updateByExample(@Param("record") quetiongrade record, @Param("example") quetiongradeExample example);
}