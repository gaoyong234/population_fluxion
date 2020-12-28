package com.population.dao;

import com.population.pojo.Industry;

public interface IndustryMapper {
    int deleteByPrimaryKey(Integer indId);

    int insert(Industry record);

    int insertSelective(Industry record);

    Industry selectByPrimaryKey(Integer indId);

    int updateByPrimaryKeySelective(Industry record);

    int updateByPrimaryKey(Industry record);
}