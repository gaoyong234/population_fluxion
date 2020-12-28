package com.population.dao;

import com.population.pojo.CultureDegree;

public interface CultureDegreeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CultureDegree record);

    int insertSelective(CultureDegree record);

    CultureDegree selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CultureDegree record);

    int updateByPrimaryKey(CultureDegree record);
}