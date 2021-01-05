package com.population.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Mate {
    private Integer maId;

    private Integer userId;

    private String mateName;

    private String mateNumber;

    private Integer mateProvince;

    private Integer mateCity;

    private Integer mateCounty;

    private Integer mateArea;

    private String mateVillage;

    private Integer background;

    private String workUnit;

    private String matePhone;

    private Integer delId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gmtCreate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gmtMoeified;

    private String spareStr;

    private Integer spareInt;

    public Integer getMaId() {
        return maId;
    }

    public void setMaId(Integer maId) {
        this.maId = maId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getMateProvince() {
        return mateProvince;
    }

    public void setMateProvince(Integer mateProvince) {
        this.mateProvince = mateProvince;
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

    public Integer getMateArea() {
        return mateArea;
    }

    public void setMateArea(Integer mateArea) {
        this.mateArea = mateArea;
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