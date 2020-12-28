package com.population.dao;

import com.population.pojo.Denomination;

public interface DenominationMapper {
    int deleteByPrimaryKey(Integer denId);

    int insert(Denomination record);

    int insertSelective(Denomination record);

    Denomination selectByPrimaryKey(Integer denId);

    int updateByPrimaryKeySelective(Denomination record);

    int updateByPrimaryKey(Denomination record);
}