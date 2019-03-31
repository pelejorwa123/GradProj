package com.whu.cs.nuclear.platform.mapper;

import com.whu.cs.nuclear.platform.pojo.Wano;
import com.whu.cs.nuclear.platform.pojo.WanoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WanoMapper {
    long countByExample(WanoExample example);

    int deleteByExample(WanoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wano record);

    int insertSelective(Wano record);

    List<Wano> selectByExample(WanoExample example);

    Wano selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wano record, @Param("example") WanoExample example);

    int updateByExample(@Param("record") Wano record, @Param("example") WanoExample example);

    int updateByPrimaryKeySelective(Wano record);

    int updateByPrimaryKey(Wano record);
}