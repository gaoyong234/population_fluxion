package com.population.dao.RegisterAudit;

import com.population.pojo.RegisterAudit;
import com.population.vo.RegisterAuditVO;

import java.util.List;

public interface RegisterAuditDaoMapper {
    //添加
    Integer insertRegisterAudit(RegisterAudit registerAudit);
    //查询
    List<RegisterAuditVO> selectRegisterAudit(RegisterAuditVO registerAuditVO);
    //审核
    Integer updateRegisterAudit(RegisterAudit registerAudit);
}
