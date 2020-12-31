package com.population.pojo;

public class power {
    private Integer powerId;

    private String powerName;

    private String powerUrl;

    private Integer delId;

    private String spareStr;

    private Integer spareInt;

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName == null ? null : powerName.trim();
    }

    public String getPowerUrl() {
        return powerUrl;
    }

    public void setPowerUrl(String powerUrl) {
        this.powerUrl = powerUrl == null ? null : powerUrl.trim();
    }

    public Integer getDelId() {
        return delId;
    }

    public void setDelId(Integer delId) {
        this.delId = delId;
    }

    public String getSpareStr() {
        return spareStr;
    }

    public void setSpareStr(String spareStr) {
        this.spareStr = spareStr == null ? null : spareStr.trim();
    }

    public Integer getSpareInt() {
        return spareInt;
    }

    public void setSpareInt(Integer spareInt) {
        this.spareInt = spareInt;
    }
}