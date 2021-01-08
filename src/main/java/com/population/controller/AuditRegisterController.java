package com.population.controller;

import com.population.service.UserService;
import com.population.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/AuditRegister")
public class AuditRegisterController {
    @Autowired
    private UserService userService;

    @RequestMapping("/toAudit")
    public String toAudit(){
        return "/audit/Audit";
    }
    @RequestMapping("/AuditUser")
    @ResponseBody
    public Message auditUser(@RequestParam(value = "auditList") List<Integer> auditList,@RequestParam(value = "auditStatus") Integer auditStatus){
        return userService.changeUserAudit(auditList,auditStatus);
    }

}
