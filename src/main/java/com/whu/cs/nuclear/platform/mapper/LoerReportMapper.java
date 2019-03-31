package com.whu.cs.nuclear.platform.mapper;

import com.whu.cs.nuclear.platform.common.PageParam;
import com.whu.cs.nuclear.platform.pojo.LoerReport;
import com.whu.cs.nuclear.platform.pojo.LoerReportExample;
import com.whu.cs.nuclear.platform.pojo.LoerReportWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoerReportMapper {
    long countByExample(LoerReportExample example);

    int deleteByExample(LoerReportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoerReportWithBLOBs record);

    int insertSelective(LoerReportWithBLOBs record);

    List<LoerReportWithBLOBs> selectByExampleWithBLOBs(LoerReportExample example);

    List<LoerReport> selectByExample(LoerReportExample example);

    LoerReportWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoerReportWithBLOBs record, @Param("example") LoerReportExample example);

    int updateByExampleWithBLOBs(@Param("record") LoerReportWithBLOBs record, @Param("example") LoerReportExample example);

    int updateByExample(@Param("record") LoerReport record, @Param("example") LoerReportExample example);

    int updateByPrimaryKeySelective(LoerReportWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LoerReportWithBLOBs record);

    int updateByPrimaryKey(LoerReport record);

    List<LoerReport> selectLoerReportByAdditions(PageParam pageParam);

    int insertReport(LoerReportWithBLOBs report);
}