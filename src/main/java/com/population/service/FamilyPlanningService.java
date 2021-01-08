package com.population.service;

import com.population.pojo.Child;

public interface FamilyPlanningService {
    //保存计生信息
    Integer saveFamilyPlanningInfo(Child child);
    //查询计生信息根据用户id
    Child findFamilyPlanningInfo(Integer userId);
    //查询是否有用户的数据根据用户id
    Integer findCountFamilyPlanningInfo(Integer userId);
    //修改
    Integer updateFamilyPlanning(Child child);
}
