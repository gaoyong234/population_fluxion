package com.population.service.Impl;

import com.population.dao.LeaserMapper;
import com.population.dao.dwellDao.ResidenceMapper;
import com.population.pojo.Dwell;
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
    public DwellVO findResidenceInfo(Integer userId) {
        return residenceMapper.findResidenceInfo(userId);
    }

    @Override
    public Integer findResidenceCountInfo(Integer userId) {
        return residenceMapper.findResidenceCountInfo(userId);
    }

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

    @Override
    public Integer updateResidenceInfo(DwellVO dwellVO) {
        Integer msg = 0;
        Leaser leaser = new Leaser();
        Dwell dwell = new Dwell();
        leaser.setLeaId(dwellVO.getLeaserId());
        leaser.setLandlordName(dwellVO.getLandlordName());
        leaser.setLandlordPhone(dwellVO.getLandlordPhone());
        leaser.setLandlordDuty(dwellVO.getLandlordDuty());
        leaser.setLandlordNumber(dwellVO.getLandlordNumber());
        leaser.setAgentName(dwellVO.getAgentName());
        leaser.setAgentPhone(dwellVO.getAgentPhone());
        leaser.setAgentDuty(dwellVO.getAgentDuty());
        leaser.setAgentNumber(dwellVO.getAgentNumber());
        int i = leaserMapper.updateByPrimaryKeySelective(leaser);

        dwell.setDweId(dwellVO.getDweId());
        dwell.setSpareInt(dwellVO.getSpareInt());
        dwell.setDwellWay(dwellVO.getDwellWay());
        dwell.setDwellWhy(dwellVO.getDwellWhy());
        dwell.setHouseCategory(dwellVO.getHouseCategory());
        dwell.setHouseProvine(dwellVO.getHouseProvine());
        dwell.setHouseAvenue(dwellVO.getHouseAvenue());
        dwell.setHouseCommunity(dwellVO.getHouseCommunity());
        dwell.setHouseWay(dwellVO.getHouseWay());
        dwell.setHouseBar(dwellVO.getHouseBar());
        dwell.setHouseRoom(dwellVO.getHouseRoom());
        dwell.setLeaserId(dwellVO.getLeaserId());
        dwell.setHouseType(dwellVO.getHouseType());
        dwell.setHouseUse(dwellVO.getHouseUse());
        dwell.setMessage(dwellVO.getMessage());
        int y = residenceMapper.updateResidenceInfo(dwell);
        if (i>0 && y>0){
            msg = 1;
        }else {
            msg = 0;
        }
        return msg;
    }
}
