package com.population.pojo;

import java.util.Date;

public class Leaser {
    private Integer leaId;

    private String landlordName;

    private String landlordPhone;

    private Integer landlordDuty;

    private String landlordNumber;

    private String agentName;

    private String agentPhone;

    private Integer agentDuty;

    private String agentNumber;

    private Integer delId;

    private Date gmtCreate;

    private Date gmtModified;

    private String spareStr;

    private Integer spareInt;

    public Integer getLeaId() {
        return leaId;
    }

    public void setLeaId(Integer leaId) {
        this.leaId = leaId;
    }

    public String getLandlordName() {
        return landlordName;
    }

    public void setLandlordName(String landlordName) {
        this.landlordName = landlordName == null ? null : landlordName.trim();
    }

    public String getLandlordPhone() {
        return landlordPhone;
    }

    public void setLandlordPhone(String landlordPhone) {
        this.landlordPhone = landlordPhone == null ? null : landlordPhone.trim();
    }

    public Integer getLandlordDuty() {
        return landlordDuty;
    }

    public void setLandlordDuty(Integer landlordDuty) {
        this.landlordDuty = landlordDuty;
    }

    public String getLandlordNumber() {
        return landlordNumber;
    }

    public void setLandlordNumber(String landlordNumber) {
        this.landlordNumber = landlordNumber == null ? null : landlordNumber.trim();
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone == null ? null : agentPhone.trim();
    }

    public Integer getAgentDuty() {
        return agentDuty;
    }

    public void setAgentDuty(Integer agentDuty) {
        this.agentDuty = agentDuty;
    }

    public String getAgentNumber() {
        return agentNumber;
    }

    public void setAgentNumber(String agentNumber) {
        this.agentNumber = agentNumber == null ? null : agentNumber.trim();
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

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
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