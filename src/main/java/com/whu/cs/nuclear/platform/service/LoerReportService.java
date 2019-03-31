package com.whu.cs.nuclear.platform.service;

import com.whu.cs.nuclear.platform.common.PageParam;
import com.whu.cs.nuclear.platform.common.PageResult;
import com.whu.cs.nuclear.platform.pojo.LoerReportWithBLOBs;

/**
 * @author: pele
 * @time: 2019/3/27 14:03
 * @project: nuclear-security-info-platform
 * @description:
 */
public interface LoerReportService {
    LoerReportWithBLOBs getLoerReportById(Long id);
    String insertLoerReport(LoerReportWithBLOBs report);
    PageResult getLoerReportByAdditions(PageParam pageParam);
}
