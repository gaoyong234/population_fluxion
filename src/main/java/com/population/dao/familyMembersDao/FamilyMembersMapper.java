package com.population.dao.familyMembersDao;

import com.population.vo.FamilyVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FamilyMembersMapper {
    //查询同住家庭成员信息
    List<FamilyVO> findFaminyInfo(Integer userId);
    //保存同住家庭成员信息
    Integer saveFamilyInfo(FamilyVO familyVO);
    //查询同住家庭成员信息条数（根据用户id）
    Integer findCountFamily(Integer userId);
    //修改（批量修改多条住家庭成员信息）
    Integer updateFamily(@Param("list")List list);
}