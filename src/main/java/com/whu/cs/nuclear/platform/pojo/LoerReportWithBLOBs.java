package com.whu.cs.nuclear.platform.pojo;

public class LoerReportWithBLOBs extends LoerReport {
    private String startEvent;

    private String ruleRemark;

    private String stateRemark;

    public String getStartEvent() {
        return startEvent;
    }

    public void setStartEvent(String startEvent) {
        this.startEvent = startEvent == null ? null : startEvent.trim();
    }

    public String getRuleRemark() {
        return ruleRemark;
    }

    public void setRuleRemark(String ruleRemark) {
        this.ruleRemark = ruleRemark == null ? null : ruleRemark.trim();
    }

    public String getStateRemark() {
        return stateRemark;
    }

    public void setStateRemark(String stateRemark) {
        this.stateRemark = stateRemark == null ? null : stateRemark.trim();
    }
}