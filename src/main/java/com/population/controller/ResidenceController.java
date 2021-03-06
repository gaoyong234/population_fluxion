package com.population.controller;

import com.population.pojo.RegisterAudit;
import com.population.pojo.User;
import com.population.service.PersonalService;
import com.population.service.RegisterAuditService;
import com.population.service.ResidenceService;
import com.population.vo.DwellVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("residence")
public class ResidenceController {

    @Autowired
    private ResidenceService residenceService;
    @Autowired
    private PersonalService personalService;
    @Autowired
    private RegisterAuditService registerAuditService;

    /**
     * 跳转到居住信息页面
     * @return
     */
    @RequestMapping("/toResidenceInfo")
    public String toResidenceInfo(){
        return "residence/residenceInfo";
    }

    /**
     * 查询居住信息（根据用户id）
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping("/findResidenceInfo")
    public DwellVO findResidenceInfo(HttpSession session){
        User admin = (User) session.getAttribute("admin");
        return residenceService.findResidenceInfo(admin.getUserId());
    }

    /**
     * 提交居住信息
     * @param dwellVO
     * @return
     */
    @ResponseBody
    @RequestMapping("/saveResidenceInfo")
    @Transactional
    public Integer saveResidenceInfo(DwellVO dwellVO,HttpSession session){
        User admin = (User) session.getAttribute("admin");
        RegisterAudit registerAudit = new RegisterAudit();
        dwellVO.setSpareInt(admin.getUserId());
        Integer count = residenceService.findResidenceCountInfo(admin.getUserId());
        if(count>0){
            return residenceService.updateResidenceInfo(dwellVO);
        }
        Integer personalId = personalService.findPersonalIdByUserId(admin.getUserId());
        registerAudit.setPersonalId(personalId);
        registerAudit.setUserId(admin.getUserId());
        registerAudit.setGmtCreate(new Date());
        //添加登记信息
        registerAuditService.addRegisterAudit(registerAudit);
        return residenceService.saveResidenceInfo(dwellVO);
    }

}