package com.population.dao;

import com.population.pojo.Employing;

public interface EmployingMapper {
    int deleteByPrimaryKey(Integer emId);

    int insert(Employing record);

    int insertSelective(Employing record);

    Employing selectByPrimaryKey(Integer emId);

    int updateByPrimaryKeySelective(Employing record);

    int updateByPrimaryKey(Employing record);
}