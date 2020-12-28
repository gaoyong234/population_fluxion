package com.population.pojo;

import java.util.Date;

public class Denomination {
    private Integer denId;

    private String denName;

    private Integer delId;

    private Date gmtCreate;

    private Date gmtModefile;

    public Integer getDenId() {
        return denId;
    }

    public void setDenId(Integer denId) {
        this.denId = denId;
    }

    public String getDenName() {
        return denName;
    }

    public void setDenName(String denName) {
        this.denName = denName == null ? null : denName.trim();
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

    public Date getGmtModefile() {
        return gmtModefile;
    }

    public void setGmtModefile(Date gmtModefile) {
        this.gmtModefile = gmtModefile;
    }
}