package com.population.pojo;

import java.util.Date;

public class Mate {
    private Integer maId;

    private String mateName;

    private String mateNumber;

    private Integer mateProvine;

    private Integer mateCity;

    private Integer mateCounty;

    private String mateVillage;

    private Integer background;

    private String workUnit;

    private String matePhone;

    private Integer delId;

    private Date gmtCreate;

    private Date gmtMoeified;

    private String spareStr;

    private Integer spareInt;

    public Integer getMaId() {
        return maId;
    }

    public void setMaId(Integer maId) {
        this.maId = maId;
    }

    public String getMateName() {
        return mateName;
    }

    public void setMateName(String mateName) {
        this.mateName = mateName == null ? null : mateName.trim();
    }

    public String getMateNumber() {
        return mateNumber;
    }

    public void setMateNumber(String mateNumber) {
        this.mateNumber = mateNumber == null ? null : mateNumber.trim();
    }

    public Integer getMateProvine() {
        return mateProvine;
    }

    public void setMateProvine(Integer mateProvine) {
        this.mateProvine = mateProvine;
    }

    public Integer getMateCity() {
        return mateCity;
    }

    public void setMateCity(Integer mateCity) {
        this.mateCity = mateCity;
    }

    public Integer getMateCounty() {
        return mateCounty;
    }

    public void setMateCounty(Integer mateCounty) {
        this.mateCounty = mateCounty;
    }

    public String getMateVillage() {
        return mateVillage;
    }

    public void setMateVillage(String mateVillage) {
        this.mateVillage = mateVillage == null ? null : mateVillage.trim();
    }

    public Integer getBackground() {
        return background;
    }

    public void setBackground(Integer background) {
        this.background = background;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit == null ? null : workUnit.trim();
    }

    public String getMatePhone() {
        return matePhone;
    }

    public void setMatePhone(String matePhone) {
        this.matePhone = matePhone == null ? null : matePhone.trim();
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

    public Date getGmtMoeified() {
        return gmtMoeified;
    }

    public void setGmtMoeified(Date gmtMoeified) {
        this.gmtMoeified = gmtMoeified;
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