package com.population.service.Impl;

import com.population.dao.ChildMapper;
import com.population.pojo.Child;
import com.population.service.FamilyPlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class FamilyPlanningServiceImpl implements FamilyPlanningService {

    @Autowired
    private ChildMapper childMapper;

    @Override
    public Integer saveFamilyPlanningInfo(Child child) {
        Date date = new Date();
        child.setGmtCreate(date);
        return childMapper.insertSelective(child);
    }

    @Override
    public Child findFamilyPlanningInfo(Integer userId) {
        return childMapper.findFamilyPlanningInfo(userId);
    }

    @Override
    public Integer findCountFamilyPlanningInfo(Integer userId) {
        return childMapper.findCountFamilyPlanningInfo(userId);
    }

    @Override
    public Integer updateFamilyPlanning(Child child) {
        return childMapper.updateByPrimaryKeySelective(child);
    }
}
