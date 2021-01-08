package com.population.dao.familyMembersDao;

import com.population.vo.FamilyVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FamilyMembersMapper {

    List<FamilyVO> findFaminyInfo(Integer userId);

    Integer saveFamilyInfo(FamilyVO familyVO);

    Integer findCountFamily(Integer userId);
    //
    Integer updateFamily(@Param("list")List list);
}