package com.dao;

import com.pojo.menu;
import com.pojo.menuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface menuMapper {
    int countByExample(menuExample example);

    int deleteByExample(menuExample example);

    int insert(menu record);

    int insertSelective(menu record);

    List<menu> selectByExampleWithBLOBs(menuExample example);

    List<menu> selectByExample(menuExample example);

    int updateByExampleSelective(@Param("record") menu record, @Param("example") menuExample example);

    int updateByExampleWithBLOBs(@Param("record") menu record, @Param("example") menuExample example);

    int updateByExample(@Param("record") menu record, @Param("example") menuExample example);
}