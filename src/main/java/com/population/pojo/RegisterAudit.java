package com.population.pojo;

import java.util.Date;

public class RegisterAudit {
    private Integer registerId;

    private Integer personalId;

    private Integer registerAuditStatus;

    private Integer userId;

    private String comment;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer delId;

    private String spareStr;

    private Integer spareInt;

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }

    public Integer getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Integer personalId) {
        this.personalId = personalId;
    }

    public Integer getRegisterAuditStatus() {
        return registerAuditStatus;
    }

    public void setRegisterAuditStatus(Integer registerAuditStatus) {
        this.registerAuditStatus = registerAuditStatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
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