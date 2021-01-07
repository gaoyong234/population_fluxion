package com.population.service;

import com.population.pojo.Dic;
import com.population.vo.FamilyVO;

import java.util.List;

public interface FamilyMembersService {
    //查询同住家庭成员信息
    List<FamilyVO> findFaminyInfo(Integer userId);
    //查找字典表关系信息
    List<Dic> findRelationshipInfo();
    //保存同住家庭成员信息
    Integer saveFamilyInfo(FamilyVO familyVO);
}
