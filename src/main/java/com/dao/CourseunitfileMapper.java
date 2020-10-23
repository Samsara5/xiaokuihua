package com.dao;

import com.pojo.Courseunitfile;
import com.pojo.CourseunitfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseunitfileMapper {
    int countByExample(CourseunitfileExample example);

    int deleteByExample(CourseunitfileExample example);

    int insert(Courseunitfile record);

    int insertSelective(Courseunitfile record);

    List<Courseunitfile> selectByExample(CourseunitfileExample example);

    int updateByExampleSelective(@Param("record") Courseunitfile record, @Param("example") CourseunitfileExample example);

    int updateByExample(@Param("record") Courseunitfile record, @Param("example") CourseunitfileExample example);
}