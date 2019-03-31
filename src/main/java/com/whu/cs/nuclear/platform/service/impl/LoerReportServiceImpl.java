package com.whu.cs.nuclear.platform.service.impl;

import com.whu.cs.nuclear.platform.common.PageParam;
import com.whu.cs.nuclear.platform.common.PageResult;
import com.whu.cs.nuclear.platform.mapper.LoerReportMapper;
import com.whu.cs.nuclear.platform.pojo.LoerReportExample;
import com.whu.cs.nuclear.platform.pojo.LoerReport;
import com.whu.cs.nuclear.platform.pojo.LoerReportWithBLOBs;
import com.whu.cs.nuclear.platform.service.LoerReportService;
import com.whu.cs.nuclear.platform.service.NameConvertService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author: pele
 * @time: 2019/3/27 14:04
 * @project: nuclear-security-info-platform
 * @description:
 */
@Service
public class LoerReportServiceImpl implements LoerReportService {

    @Autowired
    private LoerReportMapper loerReportMapper;

    @Autowired
    private NameConvertService nameConvertService;

    Logger logger = LoggerFactory.getLogger(LoerReportServiceImpl.class);

    @Override
    public PageResult getLoerReportByAdditions(PageParam pageParam) {
        if (pageParam == null) {
            pageParam = new PageParam();
            logger.info("the page param is null");
        }
        List<LoerReport> loerReports = loerReportMapper.selectLoerReportByAdditions(pageParam);
        PageResult pageResult = new PageResult();
        if (pageParam.getTotalRows() == null) {
            LoerReportExample example = new LoerReportExample();
            LoerReportExample.Criteria criteria = example.createCriteria();
            if(pageParam.getPlantCode() != null) {
                criteria.andPlantCodeEqualTo(pageParam.getPlantCode());
            }
            if(pageParam.getUnitCode() != null) {
                criteria.andUnitCodeEqualTo(pageParam.getUnitCode());
            }
            if(pageParam.getUniformUnit() != null) {
                criteria.andUniformUnitEqualTo(pageParam.getUniformUnit());
            }
            if(pageParam.getReportYear() != null) {
                criteria.andReportYearEqualTo(pageParam.getReportYear());
            }
            if(pageParam.getReportSerial() != null) {
                criteria.andReportSerialEqualTo(pageParam.getReportSerial());
            }
            long totalRows = loerReportMapper.countByExample(example);
            pageResult.setTotalRows(totalRows);
        }else {
            pageResult.setTotalRows(pageParam.getTotalRows());
        }
        pageResult.setStartRows(pageParam.getStartRows());
        pageResult.setCurrentPage(pageParam.getCurrentPage());
        pageResult.setItems(loerReports);
        pageResult.setPageSize(pageParam.getPageSize());
        return pageResult;
    }

    @Override
    public LoerReportWithBLOBs getLoerReportById(Long id) {
        LoerReportExample example = new LoerReportExample();
        example.createCriteria().andIdEqualTo(id);
        List<LoerReportWithBLOBs> result = loerReportMapper.selectByExampleWithBLOBs(example);
        if (result == null || result.size() == 0) {
            return null;
        }else {
            return result.get(0);
        }
    }

    @Override
    public String insertLoerReport(LoerReportWithBLOBs report) {
        String checkResult = checkReportParam(report);
        if(checkResult != null) {
            return checkResult;
        }
        String plantName = nameConvertService.getPlantNameByPlantCode(report.getPlantCode());
        if(StringUtils.isEmpty(plantName)){
            return "plantCode is illegal";
        }
        report.setPlantName(nameConvertService.getPlantNameByPlantCode(report.getPlantCode()));

       StringBuilder sb = new StringBuilder();
       sb.append("LOER").append("-");
       sb.append(report.getPlantCode()).append("-");
       sb.append(report.getUnitCode()).append("-");
       sb.append(report.getUniformUnit()).append("-");
       sb.append(report.getReportYear()).append("-");
       sb.append(report.getReportSerial());
       report.setLoerNo(sb.toString());
       loerReportMapper.insertReport(report);
        return null;
    }

    private String checkReportParam(LoerReportWithBLOBs report) {
        //subject字段不能为空
        if(report.getSubject() == null) {
            return "subject is null";
        }
        //为了构建loer_no字段，以下列不能为空
        if(report.getPlantCode() == null) {
            return "plant code is null";
        }
        if(report.getUnitCode() == null) {
            return "unit code is null";
        }
        if(report.getUniformUnit() == null) {
            return "uniform unit is null";
        }
        if(report.getReportYear() == null) {
            return "report year is null";
        }
        if(report.getReportSerial() == null) {
            return "report serial is null";
        }
        return null;


    }
}
