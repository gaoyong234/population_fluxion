package com.population.dao;

import com.population.pojo.Personal;

public interface PersonalMapper {
    int deleteByPrimaryKey(Integer personal);

    int insert(Personal record);

    int insertSelective(Personal record);

    Personal selectByPrimaryKey(Integer personal);

    int updateByPrimaryKeySelective(Personal record);

    int updateByPrimaryKey(Personal record);
}