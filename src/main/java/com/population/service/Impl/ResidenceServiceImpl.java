package com.population.service.Impl;

import com.population.dao.LeaserMapper;
import com.population.dao.dwellDao.ResidenceMapper;
import com.population.pojo.Leaser;
import com.population.service.ResidenceService;
import com.population.vo.DwellVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ResidenceServiceImpl implements ResidenceService {

    @Autowired
    private ResidenceMapper residenceMapper;

    @Autowired
    private LeaserMapper leaserMapper;

    @Override
    public Integer saveResidenceInfo(DwellVO dwellVO) {
        Integer msg = 0;
        Leaser leaser = new Leaser();
        leaser.setLandlordName(dwellVO.getLandlordName());
        leaser.setLandlordPhone(dwellVO.getLandlordPhone());
        leaser.setLandlordDuty(dwellVO.getLandlordDuty());
        leaser.setLandlordNumber(dwellVO.getLandlordNumber());
        leaser.setAgentName(dwellVO.getAgentName());
        leaser.setAgentPhone(dwellVO.getAgentPhone());
        leaser.setAgentDuty(dwellVO.getAgentDuty());
        leaser.setAgentNumber(dwellVO.getAgentNumber());
        leaser.setGmtCreate(new Date());
        int i = leaserMapper.insertSelective(leaser);
        dwellVO.setLeaserId(leaser.getLeaId());
        dwellVO.setGmtCreate(new Date());
        int y = residenceMapper.saveResidenceInfo(dwellVO);
        if (i>0 && y>0){
            msg = 1;
        }
        return msg;
    }
}
