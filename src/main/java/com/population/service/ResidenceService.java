package com.population.service;

import com.population.vo.DwellVO;

public interface ResidenceService {
    //提交居住信息
    Integer saveResidenceInfo(DwellVO dwellVO);
    //查询居住信息（根据用户id）
    DwellVO findResidenceInfo(Integer userId);
    //查询居住信息条数（根据用户id）
    Integer findResidenceCountInfo(Integer userId);
    //修改
    Integer updateResidenceInfo(DwellVO dwellVO);
}
