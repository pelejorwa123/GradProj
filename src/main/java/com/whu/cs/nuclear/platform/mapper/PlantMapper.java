package com.whu.cs.nuclear.platform.mapper;

import com.whu.cs.nuclear.platform.pojo.Plant;
import com.whu.cs.nuclear.platform.pojo.PlantExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlantMapper {
    long countByExample(PlantExample example);

    int deleteByExample(PlantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Plant record);

    int insertSelective(Plant record);

    List<Plant> selectByExample(PlantExample example);

    Plant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Plant record, @Param("example") PlantExample example);

    int updateByExample(@Param("record") Plant record, @Param("example") PlantExample example);

    int updateByPrimaryKeySelective(Plant record);

    int updateByPrimaryKey(Plant record);
}