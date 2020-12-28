package com.population.dao;

import com.population.pojo.BuildingPurpose;

public interface BuildingPurposeMapper {
    int deleteByPrimaryKey(Integer bpId);

    int insert(BuildingPurpose record);

    int insertSelective(BuildingPurpose record);

    BuildingPurpose selectByPrimaryKey(Integer bpId);

    int updateByPrimaryKeySelective(BuildingPurpose record);

    int updateByPrimaryKey(BuildingPurpose record);
}