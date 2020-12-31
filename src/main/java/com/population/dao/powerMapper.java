package com.population.dao;

import com.population.pojo.power;

public interface powerMapper {
    int deleteByPrimaryKey(Integer powerId);

    int insert(power record);

    int insertSelective(power record);

    power selectByPrimaryKey(Integer powerId);

    int updateByPrimaryKeySelective(power record);

    int updateByPrimaryKey(power record);
}