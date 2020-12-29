package com.population.controller;

import com.population.pojo.Dic;
import com.population.service.FamilyMembersService;
import com.population.vo.FamilyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/familyMembers")
public class FamilyMembersController {

    @Autowired
    private FamilyMembersService familyMembersService;

    /**
     * 跳转到同住家庭成员信息页面
     * @return
     */
    @RequestMapping("/toFamilyMembersInfo")
    public String toFamilyMembersInfo(){
        return "/familyMembers/familyMembersInfo";
    }

    /**
     * 查询同住家庭成员信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/findFaminyInfo")
    public List<FamilyVO> findFaminyInfo(){
        return familyMembersService.findFaminyInfo();
    }

    /**
     * 查找字典表关系信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/findRelationshipInfo")
    public List<Dic> findRelationshipInfo(){
        return familyMembersService.findRelationshipInfo();
    }

    /**
     * 保存同住家庭成员信息
     * @param familyVO
     * @return
     */
    @ResponseBody
    @RequestMapping("/saveFamilyInfo")
    public Integer saveFamilyInfo(FamilyVO familyVO){
        return familyMembersService.saveFamilyInfo(familyVO);
    }
}
