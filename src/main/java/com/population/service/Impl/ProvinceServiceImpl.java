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
    public List<Province> findCity(Province pro) {
        return provinceDaoMapper.selectCity(pro);
    }

    @Override
    public List<Province> findCounty(Province pro) {
        return provinceDaoMapper.selectCounty(pro);
    }

    @Override
    public List<Province> findArea(Province pro) {
        return provinceDaoMapper.selectArea(pro);
    }
}
