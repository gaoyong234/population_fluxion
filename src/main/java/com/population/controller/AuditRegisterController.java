package com.population.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/AuditRegister")
public class AuditRegisterController {

    @RequestMapping("/toAudit")
    public String toAudit(){
        return "/audit/Audit";
    }

}
