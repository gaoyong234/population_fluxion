package com.population.dao;

import com.population.pojo.DwellCause;

public interface DwellCauseMapper {
    int deleteByPrimaryKey(Integer dcId);

    int insert(DwellCause record);

    int insertSelective(DwellCause record);

    DwellCause selectByPrimaryKey(Integer dcId);

    int updateByPrimaryKeySelective(DwellCause record);

    int updateByPrimaryKey(DwellCause record);
}