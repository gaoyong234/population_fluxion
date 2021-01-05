package com.population.service.Impl;

import com.population.dao.personalMapper;
import com.population.pojo.personal;
import com.population.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalImpl implements PersonalService {
    @Autowired
    private personalMapper personalMapper;

    @Override
    public Integer inserPersonal(personal personal) {
        Integer insert = personalMapper.insertSelective(personal);
        return insert;
    }
}
