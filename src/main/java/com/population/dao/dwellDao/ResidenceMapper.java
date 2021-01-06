package com.population.dao.dwellDao;

import com.population.vo.DwellVO;

public interface ResidenceMapper {
    //提交居住信息
    int saveResidenceInfo(DwellVO dwellVO);
}