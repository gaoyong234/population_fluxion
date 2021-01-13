package com.population.controller;

import com.github.pagehelper.PageInfo;
import com.population.pojo.RegisterAudit;
import com.population.service.RegisterAuditService;
import com.population.vo.Message;
import com.population.vo.RegisterAuditVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/RegisterAudit")
public class RegisterAuditController {
    @Autowired
    private RegisterAuditService registerAuditService;

    /**
     *  登记审核跳转
     * @return
     */
    @RequestMapping("/toRegisterAudit")
    public String toRegisterAudit(){
        return "/registerAudit/RegisterAudit";
    }

    /**
     * 查所有
     * @param pageNum
     * @param pageSize
     * @param registerAudit
     * @return
     */
    @RequestMapping("/findAllRegisterAudit")
    @ResponseBody
    public PageInfo<RegisterAuditVO> findAllRegisterAudit(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                                          @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                                          RegisterAuditVO registerAudit){


        return registerAuditService.findAllRegisterAudit(pageNum,pageSize,registerAudit);
    }


    @RequestMapping("/changeRegisterAudit")
    @ResponseBody
    public Message changeRegisterAudit(@RequestParam(value = "auditList") List<Integer> auditList,
                                       @RequestParam(value = "registerAuditStatus") Integer registerAuditStatus){
        return registerAuditService.changeRegisterAudit(auditList,registerAuditStatus);
    }
}
