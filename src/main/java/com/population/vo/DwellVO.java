package com.population.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class DwellVO {
    private Integer dweId;

    private Integer dwellWay;

    private Integer dwellWhy;

    private Integer houseCategory;

    private String houseProvine;

    private String houseAvenue;

    private String houseCommunity;

    private String houseWay;

    private String houseHouse;

    private String houseBar;

    private String houseRoom;

    private Integer leaserId;

    private Integer houseType;

    private Integer houseUse;

    private String message;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date gmtCreate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date gmtModified;

    private Integer delId;

    private String spareStr;

    private Integer spareInt;

    private String landlordName;
    private String landlordPhone;
    private Integer landlordDuty;
    private String landlordNumber;
    private String agentName;
    private String agentPhone;
    private Integer agentDuty;
    private String agentNumber;

    public String getLandlordName() {
        return landlordName;
    }

    public void setLandlordName(String landlordName) {
        this.landlordName = landlordName;
    }

    public String getLandlordPhone() {
        return landlordPhone;
    }

    public void setLandlordPhone(String landlordPhone) {
        this.landlordPhone = landlordPhone;
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
        this.landlordNumber = landlordNumber;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone;
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
        this.agentNumber = agentNumber;
    }

    public Integer getDweId() {
        return dweId;
    }

    public void setDweId(Integer dweId) {
        this.dweId = dweId;
    }

    public Integer getDwellWay() {
        return dwellWay;
    }

    public void setDwellWay(Integer dwellWay) {
        this.dwellWay = dwellWay;
    }

    public Integer getDwellWhy() {
        return dwellWhy;
    }

    public void setDwellWhy(Integer dwellWhy) {
        this.dwellWhy = dwellWhy;
    }

    public Integer getHouseCategory() {
        return houseCategory;
    }

    public void setHouseCategory(Integer houseCategory) {
        this.houseCategory = houseCategory;
    }

    public String getHouseProvine() {
        return houseProvine;
    }

    public void setHouseProvine(String houseProvine) {
        this.houseProvine = houseProvine == null ? null : houseProvine.trim();
    }

    public String getHouseAvenue() {
        return houseAvenue;
    }

    public void setHouseAvenue(String houseAvenue) {
        this.houseAvenue = houseAvenue == null ? null : houseAvenue.trim();
    }

    public String getHouseCommunity() {
        return houseCommunity;
    }

    public void setHouseCommunity(String houseCommunity) {
        this.houseCommunity = houseCommunity == null ? null : houseCommunity.trim();
    }

    public String getHouseWay() {
        return houseWay;
    }

    public void setHouseWay(String houseWay) {
        this.houseWay = houseWay == null ? null : houseWay.trim();
    }

    public String getHouseHouse() {
        return houseHouse;
    }

    public void setHouseHouse(String houseHouse) {
        this.houseHouse = houseHouse == null ? null : houseHouse.trim();
    }

    public String getHouseBar() {
        return houseBar;
    }

    public void setHouseBar(String houseBar) {
        this.houseBar = houseBar == null ? null : houseBar.trim();
    }

    public String getHouseRoom() {
        return houseRoom;
    }

    public void setHouseRoom(String houseRoom) {
        this.houseRoom = houseRoom == null ? null : houseRoom.trim();
    }

    public Integer getLeaserId() {
        return leaserId;
    }

    public void setLeaserId(Integer leaserId) {
        this.leaserId = leaserId;
    }

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    public Integer getHouseUse() {
        return houseUse;
    }

    public void setHouseUse(Integer houseUse) {
        this.houseUse = houseUse;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
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