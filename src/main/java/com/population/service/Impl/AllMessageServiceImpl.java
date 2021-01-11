package com.population.service.Impl;

import com.population.dao.ChildMapper;
import com.population.dao.Employing.EmployingDaoMapper;
import com.population.dao.MateDao.MateDaoMapper;
import com.population.dao.dwellDao.ResidenceMapper;
import com.population.dao.familyMembersDao.FamilyMembersMapper;
import com.population.service.AllMessageService;
import com.population.vo.AllMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllMessageServiceImpl implements AllMessageService {

    @Autowired
    private com.population.dao.personalMapper personalMapper;
    @Autowired
    private MateDaoMapper mateDaoMapper;
    @Autowired
    private FamilyMembersMapper familyMembersMapper;
    @Autowired
    private ChildMapper childMapper;
    @Autowired
    private EmployingDaoMapper employingDaoMapper;

    @Autowired
    private ResidenceMapper residenceMapper;
    @Override
    public AllMessage findAllMessage(Integer userId) {
        AllMessage allMessage = new AllMessage();
        allMessage.setPersonal(personalMapper.findUserId(userId));
        allMessage.setMate(mateDaoMapper.selectMate(userId));
        allMessage.setFamilyVOList(familyMembersMapper.findFaminyInfo(userId));
        allMessage.setChild(childMapper.findFamilyPlanningInfo(userId));
        allMessage.setEmployingVO(employingDaoMapper.selectEmploying(userId));
        //居住信息
        allMessage.setDwellVO(residenceMapper.findResidenceInfo(userId));
        return allMessage;
    }
}
