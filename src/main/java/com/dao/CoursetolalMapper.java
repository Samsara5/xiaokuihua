package com.dao;

import com.pojo.Coursetolal;
import com.pojo.CoursetolalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoursetolalMapper {
    int countByExample(CoursetolalExample example);

    int deleteByExample(CoursetolalExample example);

    int insert(Coursetolal record);

    int insertSelective(Coursetolal record);

    List<Coursetolal> selectByExample(CoursetolalExample example);

    int updateByExampleSelective(@Param("record") Coursetolal record, @Param("example") CoursetolalExample example);

    int updateByExample(@Param("record") Coursetolal record, @Param("example") CoursetolalExample example);
}