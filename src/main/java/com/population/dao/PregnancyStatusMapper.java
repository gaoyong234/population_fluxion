package com.population.dao;

import com.population.pojo.PregnancyStatus;

public interface PregnancyStatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PregnancyStatus record);

    int insertSelective(PregnancyStatus record);

    PregnancyStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PregnancyStatus record);

    int updateByPrimaryKey(PregnancyStatus record);
}