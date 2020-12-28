package com.population.pojo;

import java.util.Date;

public class HouseCategory {
    private Integer hcId;

    private String houseCategoryName;

    private Date gmtCreate;

    private Date gmtModifile;

    private Integer delId;

    public Integer getHcId() {
        return hcId;
    }

    public void setHcId(Integer hcId) {
        this.hcId = hcId;
    }

    public String getHouseCategoryName() {
        return houseCategoryName;
    }

    public void setHouseCategoryName(String houseCategoryName) {
        this.houseCategoryName = houseCategoryName == null ? null : houseCategoryName.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModifile() {
        return gmtModifile;
    }

    public void setGmtModifile(Date gmtModifile) {
        this.gmtModifile = gmtModifile;
    }

    public Integer getDelId() {
        return delId;
    }

    public void setDelId(Integer delId) {
        this.delId = delId;
    }
}