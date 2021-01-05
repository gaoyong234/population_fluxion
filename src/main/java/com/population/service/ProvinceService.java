package com.population.service;

import com.population.pojo.Province;

import java.util.List;

public interface ProvinceService {
    //查询省
    List<Province> findProvince();
    //查询市
    List<Province> findCity(Integer provinceId);
    //查询县
    List<Province> findCounty(Integer provinceId,Integer cityId);
    //查询乡镇
    List<Province> findArea(Integer provinceId,Integer cityId,Integer countyId);
}
