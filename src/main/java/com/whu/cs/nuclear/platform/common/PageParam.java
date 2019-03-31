package com.whu.cs.nuclear.platform.common;


/**
 *@author: pele
 *@time: 2019/3/27 13:58
 *@package: com.whu.cs.nuclear.platform.common
 *@description:
 */ 
public class PageParam extends PageResult{

    private String plantCode;

    private String unitCode;

    private String uniformUnit;

    private String reportYear;

    private String reportSerial;

    public String getPlantCode() {
        return plantCode;
    }

    public void setPlantCode(String plantCode) {
        this.plantCode = plantCode;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getUniformUnit() {
        return uniformUnit;
    }

    public void setUniformUnit(String uniformUnit) {
        this.uniformUnit = uniformUnit;
    }

    public String getReportYear() {
        return reportYear;
    }

    public void setReportYear(String reportYear) {
        this.reportYear = reportYear;
    }

    public String getReportSerial() {
        return reportSerial;
    }

    public void setReportSerial(String reportSerial) {
        this.reportSerial = reportSerial;
    }
}
