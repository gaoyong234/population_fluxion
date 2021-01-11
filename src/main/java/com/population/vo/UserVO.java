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
public class UserVO {
    private Integer userId;

    private String userPhone;

    private String userPassword;

    private String userUnit;

    private Integer userCity;

    private Integer userProvince;

    private Integer userArea;

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

    //省名称
    private String provinceName;
    //市名称
    private String cityName;
    //县名称
    private String areaName;
    //角色
    private String roleName;
}
