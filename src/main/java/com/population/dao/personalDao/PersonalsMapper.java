package com.population.dao.personalDao;

import com.population.vo.PersonalVO;

import java.util.List;

public interface PersonalsMapper {
    List<PersonalVO> findPersonalInfo(PersonalVO personalVO);
}