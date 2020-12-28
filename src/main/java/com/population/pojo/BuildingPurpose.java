package com.population.pojo;

import java.util.Date;

public class BuildingPurpose {
    private Integer bpId;

    private String purposeName;

    private Date gmtCreate;

    private Date gmtModifile;

    private Integer delId;

    public Integer getBpId() {
        return bpId;
    }

    public void setBpId(Integer bpId) {
        this.bpId = bpId;
    }

    public String getPurposeName() {
        return purposeName;
    }

    public void setPurposeName(String purposeName) {
        this.purposeName = purposeName == null ? null : purposeName.trim();
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