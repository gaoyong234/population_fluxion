package com.population.dao;

import com.population.pojo.Child;

public interface ChildMapper {
    int deleteByPrimaryKey(Integer chId);

    int insert(Child record);

    int insertSelective(Child record);

    Child selectByPrimaryKey(Integer chId);

    int updateByPrimaryKeySelective(Child record);

    int updateByPrimaryKey(Child record);
    //查询计生信息根据用户id
    Child findFamilyPlanningInfo(Integer userId);
    //查询是否有用户的数据根据用户id
    Integer findCountFamilyPlanningInfo(Integer userId);
}