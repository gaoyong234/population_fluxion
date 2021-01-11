package com.population.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserMyVo {
    private Integer userId;

    private String userPhone;

    private String userPassword;

    private String userUnit;

    private Integer userCity;

    private Integer userProvince;

    private Integer userArea;

    private Integer censusVill;//村

    private Integer roleId;

    private Integer delId;

    private Integer auditStatus;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gmtCreate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gmtModifile;

    private String spareStr;

    private Integer spareInt;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserUnit() {
        return userUnit;
    }

    public void setUserUnit(String userUnit) {
        this.userUnit = userUnit;
    }

    public Integer getUserCity() {
        return userCity;
    }

    public void setUserCity(Integer userCity) {
        this.userCity = userCity;
    }

    public Integer getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(Integer userProvince) {
        this.userProvince = userProvince;
    }

    public Integer getUserArea() {
        return userArea;
    }

    public void setUserArea(Integer userArea) {
        this.userArea = userArea;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getDelId() {
        return delId;
    }

    public void setDelId(Integer delId) {
        this.delId = delId;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
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