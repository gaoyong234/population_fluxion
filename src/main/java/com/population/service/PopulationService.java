package com.population.service;

import com.github.pagehelper.PageInfo;
import com.population.vo.PersonalVO;

public interface PopulationService {
    PageInfo<PersonalVO> findPersonalInfo(Integer pageNum, Integer pageSize, PersonalVO personalVO);
}
