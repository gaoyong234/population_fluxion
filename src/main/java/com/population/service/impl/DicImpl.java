package com.population.service.impl;

import com.population.dao.DicMapper;
import com.population.pojo.Dic;
import com.population.service.DicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicImpl implements DicService {
    @Autowired
    private DicMapper dicMapper;

    @Override
    public List<Dic> findAll() {
        List<Dic> dics= dicMapper.findAll();
        return dics;
    }
}
