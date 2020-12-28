package com.population.dao;

import com.population.pojo.HouseCategory;

public interface HouseCategoryMapper {
    int deleteByPrimaryKey(Integer hcId);

    int insert(HouseCategory record);

    int insertSelective(HouseCategory record);

    HouseCategory selectByPrimaryKey(Integer hcId);

    int updateByPrimaryKeySelective(HouseCategory record);

    int updateByPrimaryKey(HouseCategory record);
}