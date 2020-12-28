package com.population.pojo;

import java.util.Date;

public class UnitType {
    private Integer utId;

    private String utName;

    private Integer delId;

    private Date gmtCreate;

    private Date gmtModifile;

    public Integer getUtId() {
        return utId;
    }

    public void setUtId(Integer utId) {
        this.utId = utId;
    }

    public String getUtName() {
        return utName;
    }

    public void setUtName(String utName) {
        this.utName = utName == null ? null : utName.trim();
    }

    public Integer getDelId() {
        return delId;
    }

    public void setDelId(Integer delId) {
        this.delId = delId;
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
}