package com.population.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployingVO {
    private Integer emId;

    private String employingName;

    private Integer unitType;

    private String unitSiteProvine;

    private String unitSiteAvenue;

    private String unitSiteCommunity;

    private String unitSiteWay;

    private String unitSiteHouse;

    private String unitSiteBar;

    private String organization;

    private String legalPerson;

    private Integer contractTime;

    private String unitPhone;

    private String insurance;

    private String unitSocial;

    private String unitNumber;

    private String unitPerson;

    private Integer industrySort;

    private Integer grade;

    private Integer professionSkill;

    private String profession;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gmtCreate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gmtModified;

    private Integer delId;

    private String spareStr;

    private Integer spareInt;

    //参保的id
    private List<Integer> insuranceId;
}
