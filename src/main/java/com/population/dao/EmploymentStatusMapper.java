package com.population.dao;

import com.population.pojo.EmploymentStatus;

public interface EmploymentStatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmploymentStatus record);

    int insertSelective(EmploymentStatus record);

    EmploymentStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmploymentStatus record);

    int updateByPrimaryKey(EmploymentStatus record);
}