package com.whu.cs.nuclear.platform.mapper;

import com.whu.cs.nuclear.platform.pojo.LoerUnitState;
import com.whu.cs.nuclear.platform.pojo.LoerUnitStateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoerUnitStateMapper {
    long countByExample(LoerUnitStateExample example);

    int deleteByExample(LoerUnitStateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoerUnitState record);

    int insertSelective(LoerUnitState record);

    List<LoerUnitState> selectByExample(LoerUnitStateExample example);

    LoerUnitState selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LoerUnitState record, @Param("example") LoerUnitStateExample example);

    int updateByExample(@Param("record") LoerUnitState record, @Param("example") LoerUnitStateExample example);

    int updateByPrimaryKeySelective(LoerUnitState record);

    int updateByPrimaryKey(LoerUnitState record);
}