package com.population.dao;

import com.population.pojo.HouseType;

public interface HouseTypeMapper {
    int deleteByPrimaryKey(Integer htId);

    int insert(HouseType record);

    int insertSelective(HouseType record);

    HouseType selectByPrimaryKey(Integer htId);

    int updateByPrimaryKeySelective(HouseType record);

    int updateByPrimaryKey(HouseType record);
}