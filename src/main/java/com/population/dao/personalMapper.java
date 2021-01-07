package com.population.dao;

import com.population.pojo.personal;

public interface personalMapper {
    int deleteByPrimaryKey(Integer personal);

    int insert(personal record);

    int insertSelective(personal record);

    personal selectByPrimaryKey(Integer personal);

    int updateByPrimaryKeySelective(personal record);

    int updateByPrimaryKey(personal record);

    personal findUserId(Integer userId);

    Integer updatePersonal(personal personal);
}