package com.population.pojo;

import java.util.Date;

public class Occupation {
    private Integer occId;

    private String occName;

    private Integer delId;

    private Date gmtCreate;

    private Date gmtModifile;

    public Integer getOccId() {
        return occId;
    }

    public void setOccId(Integer occId) {
        this.occId = occId;
    }

    public String getOccName() {
        return occName;
    }

    public void setOccName(String occName) {
        this.occName = occName == null ? null : occName.trim();
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