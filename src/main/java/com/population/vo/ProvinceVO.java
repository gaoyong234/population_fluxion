package com.population.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProvinceVO {
    //
    private Integer id;

    //地区code
    private Long code;

    //名称
    private String name;

    //省编号
    private String province;

    //市编号
    private String city;

    //县编号
    private String area;

    //乡镇编号
    private String town;

    //省id
    private Integer provinceId;

    //省名称
    private String provinceName;

    //市id
    private Integer cityId;
    //市名称
    private String cityName;
    //县id
    private Integer areaId;
    //县名称
    private String areaName;

}
