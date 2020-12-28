package com.population.dao;

import com.population.pojo.Insurance;

public interface InsuranceMapper {
    int deleteByPrimaryKey(Integer insId);

    int insert(Insurance record);

    int insertSelective(Insurance record);

    Insurance selectByPrimaryKey(Integer insId);

    int updateByPrimaryKeySelective(Insurance record);

    int updateByPrimaryKey(Insurance record);
}