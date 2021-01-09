package com.population.dao.dwellDao;

import com.population.pojo.Dwell;
import com.population.vo.DwellVO;

public interface ResidenceMapper {
    //提交居住信息
    int saveResidenceInfo(DwellVO dwellVO);
    //查询居住信息（根据用户id）
    DwellVO findResidenceInfo(Integer userId);
    //查询居住信息条数（根据用户id）
    Integer findResidenceCountInfo(Integer userId);
    //修改
    int updateResidenceInfo(Dwell dwell);
}