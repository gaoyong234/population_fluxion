package com.population.controller;

import com.population.pojo.Child;
import com.population.service.FamilyPlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("familyPlanning")
public class FamilyPlanningController {

    @Autowired
    private FamilyPlanningService familyPlanningService;

    /**
     * 跳转到计生信息页面
     * @return
     */
    @RequestMapping("/toFamilyPlanningInfo")
    public String toFamilyPlanningInfo(){
        return "/familyPlanning/familyPlanningInfo";
    }

    /**
     * 保存计生信息
     * @param child
     * @return
     */
    @ResponseBody
    @RequestMapping("/saveFamilyPlanningInfo")
    public Integer saveFamilyPlanningInfo(Child child){
        return familyPlanningService.saveFamilyPlanningInfo(child);
    }

}
