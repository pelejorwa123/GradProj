package com.whu.cs.nuclear.platform.mapper;

import com.whu.cs.nuclear.platform.pojo.LoerReport;
import com.whu.cs.nuclear.platform.pojo.LoerReportExample;
import com.whu.cs.nuclear.platform.pojo.LoerReportWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoerReportMapper {
    long countByExample(LoerReportExample example);

    int deleteByExample(LoerReportExample example);

    int insert(LoerReportWithBLOBs record);

    int insertSelective(LoerReportWithBLOBs record);

    List<LoerReportWithBLOBs> selectByExampleWithBLOBs(LoerReportExample example);

    List<LoerReport> selectByExample(LoerReportExample example);

    int updateByExampleSelective(@Param("record") LoerReportWithBLOBs record, @Param("example") LoerReportExample example);

    int updateByExampleWithBLOBs(@Param("record") LoerReportWithBLOBs record, @Param("example") LoerReportExample example);

    int updateByExample(@Param("record") LoerReport record, @Param("example") LoerReportExample example);
}