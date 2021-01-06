package com.population.controller;

import com.population.service.ResidenceService;
import com.population.vo.DwellVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("residence")
public class ResidenceController {

    @Autowired
    private ResidenceService residenceService;

    /**
     * 跳转到居住信息页面
     * @return
     */
    @RequestMapping("/toResidenceInfo")
    public String toResidenceInfo(){
        return "residence/residenceInfo";
    }

    /**
     * 提交居住信息
     * @param dwellVO
     * @return
     */
    @ResponseBody
    @RequestMapping("/saveResidenceInfo")
    public Integer saveResidenceInfo(DwellVO dwellVO){
        return residenceService.saveResidenceInfo(dwellVO);
    }

}