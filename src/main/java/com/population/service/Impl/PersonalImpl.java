package com.population.service.Impl;

import com.population.dao.personalDao.PersonalsMapper;
import com.population.dao.personalMapper;
import com.population.pojo.personal;
import com.population.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class PersonalImpl implements PersonalService {
    @Autowired
    private personalMapper personalMapper;
    @Autowired
    private PersonalsMapper personalsMapper;

    @Override
    public Integer inserPersonal(personal personal) {
        Integer insert = personalMapper.insertSelective(personal);
        return insert;
    }

    @Override
    @Transactional
    public personal findUser(Integer userId) {
        personal personal=personalMapper.findUserId(userId);
        if(personal==null){
            com.population.pojo.personal per = new personal();
            per.setGmtCreate(new Date());
            per.setUserId(userId);
            personalMapper.insertSelective(per);
        }
        return personal;
    }

    @Override
    public Integer updatePersonal(personal personal) {
        Integer integer= personalMapper.updatePersonal(personal);
        return integer;
    }

    @Override
    public Integer findPersonalIdByUserId(Integer userId) {

        return personalsMapper.selectPersonalId(userId);
    }
}
