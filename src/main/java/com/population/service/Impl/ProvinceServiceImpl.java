package com.population.service.Impl;

import com.population.dao.ProvinceDao.ProvinceDaoMapper;
import com.population.pojo.Province;
import com.population.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceDaoMapper provinceDaoMapper;
    @Override
    public List<Province> findProvince() {
        return provinceDaoMapper.selectProvince();
    }

    @Override
    public List<Province> findCity(Integer provinceId) {
        List<Province> provinces = provinceDaoMapper.selectCity(provinceId);
        if(provinces.size()==0){

            provinces = provinceDaoMapper.selectOneCity(provinceId);
        }
        return provinces;
    }

    @Override
    public List<Province> findCounty(Integer provinceId,Integer cityId) {
        List<Province> provinces = provinceDaoMapper.selectCounty(provinceId, cityId);
        if (provinces.size()==0){
            provinces= provinceDaoMapper.selectOneCounty(provinceId);
        }
        return provinces;
    }

    @Override
    public List<Province> findArea(Integer provinceId,Integer cityId,Integer countyId) {
        if (provinceId==cityId){
            cityId=2;
        }
        return provinceDaoMapper.selectArea(provinceId,cityId,countyId);
    }
}
