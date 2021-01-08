package com.population.service.Impl;

import com.population.dao.DicMapper;
import com.population.dao.familyMembersDao.FamilyMembersMapper;
import com.population.pojo.Dic;
import com.population.service.FamilyMembersService;
import com.population.vo.FamilyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamilyMembersServiceImpl implements FamilyMembersService {

    @Autowired
    private FamilyMembersMapper familyMembersMapper;

    @Autowired
    private DicMapper dicMapper;

    @Override
    public List<FamilyVO> findFaminyInfo(Integer userId) {
        return familyMembersMapper.findFaminyInfo(userId);
    }

    @Override
    public List<Dic> findRelationshipInfo() {
        return dicMapper.findAll();
    }

    @Override
    public Integer saveFamilyInfo(FamilyVO familyVO) {
        return familyMembersMapper.saveFamilyInfo(familyVO);
    }

    @Override
    public Integer findCountFamily(Integer userId) {
        Integer countFamily = familyMembersMapper.findCountFamily(userId);
        return countFamily;
    }

    @Override
    public Integer updateFamily(List list) {
        return familyMembersMapper.updateFamily(list);
    }
}
