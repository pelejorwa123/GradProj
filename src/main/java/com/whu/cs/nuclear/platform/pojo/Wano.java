package com.whu.cs.nuclear.platform.pojo;

public class Wano {
    private Integer id;

    private String wanoType;

    private Integer wanoId;

    private String wanoDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWanoType() {
        return wanoType;
    }

    public void setWanoType(String wanoType) {
        this.wanoType = wanoType == null ? null : wanoType.trim();
    }

    public Integer getWanoId() {
        return wanoId;
    }

    public void setWanoId(Integer wanoId) {
        this.wanoId = wanoId;
    }

    public String getWanoDesc() {
        return wanoDesc;
    }

    public void setWanoDesc(String wanoDesc) {
        this.wanoDesc = wanoDesc == null ? null : wanoDesc.trim();
    }
}