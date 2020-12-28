package com.population.dao;

import com.population.pojo.BloodType;

public interface BloodTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BloodType record);

    int insertSelective(BloodType record);

    BloodType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BloodType record);

    int updateByPrimaryKey(BloodType record);
}