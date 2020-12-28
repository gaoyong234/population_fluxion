package com.population.dao;

import com.population.pojo.Professional;

public interface ProfessionalMapper {
    int deleteByPrimaryKey(Integer proId);

    int insert(Professional record);

    int insertSelective(Professional record);

    Professional selectByPrimaryKey(Integer proId);

    int updateByPrimaryKeySelective(Professional record);

    int updateByPrimaryKey(Professional record);
}