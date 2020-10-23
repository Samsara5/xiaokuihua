package com.dao;

import com.pojo.Courseunit;
import com.pojo.CourseunitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseunitMapper {
    int countByExample(CourseunitExample example);

    int deleteByExample(CourseunitExample example);

    int insert(Courseunit record);

    int insertSelective(Courseunit record);

    List<Courseunit> selectByExample(CourseunitExample example);

    int updateByExampleSelective(@Param("record") Courseunit record, @Param("example") CourseunitExample example);

    int updateByExample(@Param("record") Courseunit record, @Param("example") CourseunitExample example);
}