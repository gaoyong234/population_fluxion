package com.population.dao;

import com.population.pojo.Dwell;

public interface DwellMapper {
    int deleteByPrimaryKey(Integer dweId);

    int insert(Dwell record);

    int insertSelective(Dwell record);

    Dwell selectByPrimaryKey(Integer dweId);

    int updateByPrimaryKeySelective(Dwell record);

    int updateByPrimaryKey(Dwell record);
}