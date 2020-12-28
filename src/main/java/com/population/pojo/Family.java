package com.population.pojo;

import java.util.Date;

public class Family {
    private Integer famId;

    private String familyName;

    private String familyNumber;

    private Integer familySex;

    private Date familyBrithday;

    private Integer familyVaccine;

    private Integer familyLearn;

    private Integer delId;

    private Integer personal;

    private Date gmtCreate;

    private Date gmtModified;

    private String spareStr;

    private Integer spareInt;

    public Integer getFamId() {
        return famId;
    }

    public void setFamId(Integer famId) {
        this.famId = famId;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public String getFamilyNumber() {
        return familyNumber;
    }

    public void setFamilyNumber(String familyNumber) {
        this.familyNumber = familyNumber == null ? null : familyNumber.trim();
    }

    public Integer getFamilySex() {
        return familySex;
    }

    public void setFamilySex(Integer familySex) {
        this.familySex = familySex;
    }

    public Date getFamilyBrithday() {
        return familyBrithday;
    }

    public void setFamilyBrithday(Date familyBrithday) {
        this.familyBrithday = familyBrithday;
    }

    public Integer getFamilyVaccine() {
        return familyVaccine;
    }

    public void setFamilyVaccine(Integer familyVaccine) {
        this.familyVaccine = familyVaccine;
    }

    public Integer getFamilyLearn() {
        return familyLearn;
    }

    public void setFamilyLearn(Integer familyLearn) {
        this.familyLearn = familyLearn;
    }

    public Integer getDelId() {
        return delId;
    }

    public void setDelId(Integer delId) {
        this.delId = delId;
    }

    public Integer getPersonal() {
        return personal;
    }

    public void setPersonal(Integer personal) {
        this.personal = personal;
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