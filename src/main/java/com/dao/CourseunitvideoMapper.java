package com.dao;

import com.pojo.Courseunitvideo;
import com.pojo.CourseunitvideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseunitvideoMapper {
    int countByExample(CourseunitvideoExample example);

    int deleteByExample(CourseunitvideoExample example);

    int insert(Courseunitvideo record);

    int insertSelective(Courseunitvideo record);

    List<Courseunitvideo> selectByExample(CourseunitvideoExample example);

    int updateByExampleSelective(@Param("record") Courseunitvideo record, @Param("example") CourseunitvideoExample example);

    int updateByExample(@Param("record") Courseunitvideo record, @Param("example") CourseunitvideoExample example);
}