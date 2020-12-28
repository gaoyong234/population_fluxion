package com.population.dao;

import com.population.pojo.Child;

public interface ChildMapper {
    int deleteByPrimaryKey(Integer chId);

    int insert(Child record);

    int insertSelective(Child record);

    Child selectByPrimaryKey(Integer chId);

    int updateByPrimaryKeySelective(Child record);

    int updateByPrimaryKey(Child record);
}