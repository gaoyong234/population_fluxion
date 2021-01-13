package com.population.dao.personalDao;

import com.population.vo.PersonalVO;

import java.util.List;

public interface PersonalsMapper {
    List<PersonalVO> findPersonalInfo(PersonalVO personalVO);

    //根据userId查询个人信息id

    Integer selectPersonalId(Integer userId);
}