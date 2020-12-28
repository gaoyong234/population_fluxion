package com.population.pojo;

import java.util.Date;

public class PregnancyStatus {
    private Integer id;

    private String pregnancyName;

    private Date creationTime;

    private Date revisionTime;

    private Integer del;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPregnancyName() {
        return pregnancyName;
    }

    public void setPregnancyName(String pregnancyName) {
        this.pregnancyName = pregnancyName == null ? null : pregnancyName.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getRevisionTime() {
        return revisionTime;
    }

    public void setRevisionTime(Date revisionTime) {
        this.revisionTime = revisionTime;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }
}