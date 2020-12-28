package com.population.dao;

import com.population.pojo.UnitType;

public interface UnitTypeMapper {
    int deleteByPrimaryKey(Integer utId);

    int insert(UnitType record);

    int insertSelective(UnitType record);

    UnitType selectByPrimaryKey(Integer utId);

    int updateByPrimaryKeySelective(UnitType record);

    int updateByPrimaryKey(UnitType record);
}