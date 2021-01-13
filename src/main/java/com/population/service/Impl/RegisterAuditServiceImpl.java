package com.population.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.population.dao.RegisterAudit.RegisterAuditDaoMapper;
import com.population.pojo.RegisterAudit;
import com.population.service.RegisterAuditService;
import com.population.util.ReturnUtil;
import com.population.vo.Message;
import com.population.vo.RegisterAuditVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterAuditServiceImpl implements RegisterAuditService {
    @Autowired
    private RegisterAuditDaoMapper registerAuditDaoMapper;

    @Override
    public Integer addRegisterAudit(RegisterAudit registerAudit) {
        return registerAuditDaoMapper.insertRegisterAudit(registerAudit);
    }

    @Override
    public PageInfo<RegisterAuditVO> findAllRegisterAudit(Integer pageNum, Integer pageSize, RegisterAuditVO registerAudit) {
        PageHelper.startPage(pageNum,pageSize);
        List<RegisterAuditVO> registerAuditList = registerAuditDaoMapper.selectRegisterAudit(registerAudit);
        PageInfo<RegisterAuditVO> pageInfo = new PageInfo<>(registerAuditList);
        return pageInfo;
    }

    @Override
    public Message changeRegisterAudit(List<Integer> registerAuditIdList, Integer registerAuditStatus) {
        RegisterAudit registerAudit = new RegisterAudit();
        registerAudit.setRegisterAuditStatus(registerAuditStatus);

        Integer num=0;
        for (int i = 0; i < registerAuditIdList.size(); i++) {
            registerAudit.setRegisterId(registerAuditIdList.get(i));

            num += registerAuditDaoMapper.updateRegisterAudit(registerAudit);
        }
        Message message = ReturnUtil.returnData("审核", num);
        return message;
    }
}
