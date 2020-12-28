package com.population.dao;

import com.population.pojo.DwellWay;

public interface DwellWayMapper {
    int deleteByPrimaryKey(Integer dwId);

    int insert(DwellWay record);

    int insertSelective(DwellWay record);

    DwellWay selectByPrimaryKey(Integer dwId);

    int updateByPrimaryKeySelective(DwellWay record);

    int updateByPrimaryKey(DwellWay record);
}