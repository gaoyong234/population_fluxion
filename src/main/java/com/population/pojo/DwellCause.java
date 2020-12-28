package com.population.pojo;

import java.util.Date;

public class DwellCause {
    private Integer dcId;

    private String dwellCauseName;

    private Date gmtCreate;

    private Date gmtModifile;

    private Integer delId;

    public Integer getDcId() {
        return dcId;
    }

    public void setDcId(Integer dcId) {
        this.dcId = dcId;
    }

    public String getDwellCauseName() {
        return dwellCauseName;
    }

    public void setDwellCauseName(String dwellCauseName) {
        this.dwellCauseName = dwellCauseName == null ? null : dwellCauseName.trim();
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