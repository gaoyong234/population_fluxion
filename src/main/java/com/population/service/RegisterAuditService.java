package com.population.service;

import com.github.pagehelper.PageInfo;
import com.population.pojo.RegisterAudit;
import com.population.vo.Message;
import com.population.vo.RegisterAuditVO;

import java.util.List;

public interface RegisterAuditService {

    //添加
    Integer addRegisterAudit(RegisterAudit registerAudit);
    //查询
    PageInfo<RegisterAuditVO> findAllRegisterAudit(Integer pageNum, Integer pageSize, RegisterAuditVO registerAuditVO);

    //审核
    Message changeRegisterAudit(List<Integer> registerAuditIdList,Integer registerAuditStatus);
}
