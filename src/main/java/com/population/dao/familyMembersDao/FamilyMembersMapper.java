package com.population.dao.familyMembersDao;

import com.population.vo.FamilyVO;

import java.util.List;

public interface FamilyMembersMapper {

    List<FamilyVO> findFaminyInfo(Integer userId);

    Integer saveFamilyInfo(FamilyVO familyVO);
}