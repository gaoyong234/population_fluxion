package com.population.controller;

import com.population.pojo.Child;
import com.population.pojo.User;
import com.population.service.FamilyPlanningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

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
     * 查询计生信息根据用户id
     * @param session
     * @return
     */
    @ResponseBody
    @RequestMapping("/findFamilyPlanningInfo")
    public Child findFamilyPlanningInfo(HttpSession session){
        User admin = (User) session.getAttribute("admin");
        return familyPlanningService.findFamilyPlanningInfo(admin.getUserId());
    }

    /**
     * 保存计生信息
     * @param child
     * @return
     */
    @ResponseBody
    @RequestMapping("/saveFamilyPlanningInfo")
    public Integer saveFamilyPlanningInfo(Child child,HttpSession session){
        User admin = (User) session.getAttribute("admin");
        child.setSpareInt(admin.getUserId());
        Integer count = familyPlanningService.findCountFamilyPlanningInfo(admin.getUserId());
        if(count > 0){
            return familyPlanningService.updateFamilyPlanning(child);
        }
            return familyPlanningService.saveFamilyPlanningInfo(child);
    }

}
