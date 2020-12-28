package com.population.pojo;

import java.util.Date;

public class DwellWay {
    private Integer dwId;

    private String dwellWayName;

    private Date gmtCreate;

    private Date gmtModifile;

    private Integer delId;

    public Integer getDwId() {
        return dwId;
    }

    public void setDwId(Integer dwId) {
        this.dwId = dwId;
    }

    public String getDwellWayName() {
        return dwellWayName;
    }

    public void setDwellWayName(String dwellWayName) {
        this.dwellWayName = dwellWayName == null ? null : dwellWayName.trim();
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