package com.population.dao;

import com.population.pojo.Mate;

public interface MateMapper {
    int deleteByPrimaryKey(Integer maId);

    int insert(Mate record);

    int insertSelective(Mate record);

    Mate selectByPrimaryKey(Integer maId);

    int updateByPrimaryKeySelective(Mate record);

    int updateByPrimaryKey(Mate record);
}