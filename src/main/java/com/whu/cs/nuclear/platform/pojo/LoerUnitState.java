package com.whu.cs.nuclear.platform.pojo;

public class LoerUnitState {
    private Integer id;

    private String unitState;

    private String unitStateDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitState() {
        return unitState;
    }

    public void setUnitState(String unitState) {
        this.unitState = unitState == null ? null : unitState.trim();
    }

    public String getUnitStateDesc() {
        return unitStateDesc;
    }

    public void setUnitStateDesc(String unitStateDesc) {
        this.unitStateDesc = unitStateDesc == null ? null : unitStateDesc.trim();
    }
}