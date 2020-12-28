package com.population.dao;

import com.population.pojo.Family;

public interface FamilyMapper {
    int deleteByPrimaryKey(Integer famId);

    int insert(Family record);

    int insertSelective(Family record);

    Family selectByPrimaryKey(Integer famId);

    int updateByPrimaryKeySelective(Family record);

    int updateByPrimaryKey(Family record);
}