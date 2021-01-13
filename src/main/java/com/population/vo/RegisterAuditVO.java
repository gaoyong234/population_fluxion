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
public class RegisterAuditVO {
    private Integer registerId;

    private Integer personalId;

    private Integer registerAuditStatus;

    private Integer userId;

    private String comment;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gmtCreate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date gmtModified;

    private Integer delId;

    private String spareStr;

    private Integer spareInt;

    //联系方式
    private String personalPhone;

    //姓名
    private String personalName;
    //单位
    private String employingName;
}
