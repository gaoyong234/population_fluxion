package com.population.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("residence")
public class ResidenceController {

    /**
     * 跳转到居住信息页面
     * @return
     */
    @RequestMapping("/toResidenceInfo")
    public String toResidenceInfo(){
        return "residence/residenceInfo";
    }

}