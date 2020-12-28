package com.population.pojo;

import java.util.Date;

public class Child {
    private Integer chId;

    private Integer matePeer;

    private Integer marital;

    private String maritalNumber;

    private Integer verify;

    private Integer boy;

    private Integer girl;

    private Integer policyIn;

    private Integer policyOut;

    private Integer onlyChild;

    private Integer alimony;

    private Integer contraception;

    private Date contraceptionTime;

    private Integer onceBog;

    private Date onceBirthday;

    private Integer oncePolicy;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer delId;

    private String spareStr;

    private Integer spareInt;

    public Integer getChId() {
        return chId;
    }

    public void setChId(Integer chId) {
        this.chId = chId;
    }

    public Integer getMatePeer() {
        return matePeer;
    }

    public void setMatePeer(Integer matePeer) {
        this.matePeer = matePeer;
    }

    public Integer getMarital() {
        return marital;
    }

    public void setMarital(Integer marital) {
        this.marital = marital;
    }

    public String getMaritalNumber() {
        return maritalNumber;
    }

    public void setMaritalNumber(String maritalNumber) {
        this.maritalNumber = maritalNumber == null ? null : maritalNumber.trim();
    }

    public Integer getVerify() {
        return verify;
    }

    public void setVerify(Integer verify) {
        this.verify = verify;
    }

    public Integer getBoy() {
        return boy;
    }

    public void setBoy(Integer boy) {
        this.boy = boy;
    }

    public Integer getGirl() {
        return girl;
    }

    public void setGirl(Integer girl) {
        this.girl = girl;
    }

    public Integer getPolicyIn() {
        return policyIn;
    }

    public void setPolicyIn(Integer policyIn) {
        this.policyIn = policyIn;
    }

    public Integer getPolicyOut() {
        return policyOut;
    }

    public void setPolicyOut(Integer policyOut) {
        this.policyOut = policyOut;
    }

    public Integer getOnlyChild() {
        return onlyChild;
    }

    public void setOnlyChild(Integer onlyChild) {
        this.onlyChild = onlyChild;
    }

    public Integer getAlimony() {
        return alimony;
    }

    public void setAlimony(Integer alimony) {
        this.alimony = alimony;
    }

    public Integer getContraception() {
        return contraception;
    }

    public void setContraception(Integer contraception) {
        this.contraception = contraception;
    }

    public Date getContraceptionTime() {
        return contraceptionTime;
    }

    public void setContraceptionTime(Date contraceptionTime) {
        this.contraceptionTime = contraceptionTime;
    }

    public Integer getOnceBog() {
        return onceBog;
    }

    public void setOnceBog(Integer onceBog) {
        this.onceBog = onceBog;
    }

    public Date getOnceBirthday() {
        return onceBirthday;
    }

    public void setOnceBirthday(Date onceBirthday) {
        this.onceBirthday = onceBirthday;
    }

    public Integer getOncePolicy() {
        return oncePolicy;
    }

    public void setOncePolicy(Integer oncePolicy) {
        this.oncePolicy = oncePolicy;
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