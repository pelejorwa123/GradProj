package com.whu.cs.nuclear.platform.controller;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.whu.cs.nuclear.platform.common.AjaxResult;
import com.whu.cs.nuclear.platform.common.PageParam;
import com.whu.cs.nuclear.platform.common.PageResult;
import com.whu.cs.nuclear.platform.pojo.LoerReport;
import com.whu.cs.nuclear.platform.pojo.LoerReportWithBLOBs;
import com.whu.cs.nuclear.platform.service.LoerReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;

/**
 * @author: pele
 * @time: 2019/3/26 14:30
 * @project: nuclear-security-info-platform
 * @description:
 */
@RestController
@RequestMapping("loer")
public class LoerReportController {

    @Autowired
    private LoerReportService loerReportService;

    private final static Logger logger = LoggerFactory.getLogger(LoerReportController.class);

    @GetMapping("report/{id}")
    public AjaxResult getLoerReportById(@PathVariable(required = false) Long id) {
        if (id == null) {
            return AjaxResult.build(400,"id is null");
        }
        try {
            LoerReportWithBLOBs report = loerReportService.getLoerReportById(id);
            if (report == null) {
                return AjaxResult.build(400,"such id not exist");
            }else {
                return AjaxResult.ok(report);
            }
        }catch (Exception e) {
            logger.error(e.toString());
            return AjaxResult.build(500,e);
        }
    }


    @PostMapping("report")
    public AjaxResult addLoerReport(@RequestBody(required = false) LoerReportWithBLOBs report) {
        if(report == null) {
            return AjaxResult.build(400,"data is null");
        }
        String result = loerReportService.insertLoerReport(report);
        if(result == null) {
            return AjaxResult.ok("add success");
        }else {
            return AjaxResult.build(400,result);
        }
    }

    @RequestMapping("reports")
    public AjaxResult getReportsByAdditions(PageParam pageParam){
        try {
            PageResult pageResult =  loerReportService.getLoerReportByAdditions(pageParam);
            return AjaxResult.ok(pageResult);
        }catch (Exception e) {
            logger.error(e.toString());
            return AjaxResult.build(500,e);
        }
    }
}
