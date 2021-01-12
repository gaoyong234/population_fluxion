package com.population.dao;

import com.population.pojo.RegisterAudit;

public interface RegisterAuditMapper {
    int deleteByPrimaryKey(Integer registerId);

    int insert(RegisterAudit record);

    int insertSelective(RegisterAudit record);

    RegisterAudit selectByPrimaryKey(Integer registerId);

    int updateByPrimaryKeySelective(RegisterAudit record);

    int updateByPrimaryKey(RegisterAudit record);
}