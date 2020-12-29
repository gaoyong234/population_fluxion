package com.population.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MateVO {

    private Integer maId;

    private Integer userId;

    //姓名
    private String mateName;

    //身份证号
    private String mateNumber;

    //现居住地点省
    private Integer mateProvince;

    //现居住地点省
    private String mateProvinceName;

    //现居住地点市
    private Integer mateCity;

    //现居住地点市
    private String mateCityName;

    //现居住地点县
    private Integer mateCounty;

    //现居住地点县
    private String mateCountyName;

    //现居住地点乡镇
    private Integer mateArea;

    //现居住地点乡镇
    private String mateAreaName;

    //现居住地点村
    private String mateVillage;


    //工作单位
    private String workUnit;

    //配偶电话
    private String matePhone;

    //删除标识
    private Integer delId;

    //创建时间
    private Date gmtCreate;

    //修改时间
    private Date gmtMoeified;

    private String spareStr;

    private Integer spareInt;

    //从业状态id
    private Integer background;

    //从业状态名称
    private String backgroundName;
}
