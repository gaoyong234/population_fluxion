package com.population.dao;

import com.population.pojo.Occupation;

public interface OccupationMapper {
    int deleteByPrimaryKey(Integer occId);

    int insert(Occupation record);

    int insertSelective(Occupation record);

    Occupation selectByPrimaryKey(Integer occId);

    int updateByPrimaryKeySelective(Occupation record);

    int updateByPrimaryKey(Occupation record);
}