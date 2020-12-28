package com.population.dao;

import com.population.pojo.Leaser;

public interface LeaserMapper {
    int deleteByPrimaryKey(Integer leaId);

    int insert(Leaser record);

    int insertSelective(Leaser record);

    Leaser selectByPrimaryKey(Integer leaId);

    int updateByPrimaryKeySelective(Leaser record);

    int updateByPrimaryKey(Leaser record);
}