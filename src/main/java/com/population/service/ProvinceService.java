package com.population.service;

import com.population.pojo.Province;

import java.util.List;

public interface ProvinceService {
    //查询省
    List<Province> findProvince();
    //查询市
    List<Province> findCity(Province pro);
    //查询县
    List<Province> findCounty(Province pro);
    //查询乡镇
    List<Province> findArea(Province pro);
}
