package com.population.controller;

import com.alibaba.fastjson.JSONObject;
import com.population.pojo.Dic;
import com.population.pojo.User;
import com.population.service.FamilyMembersService;
import com.population.vo.FamilyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

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
    public List<FamilyVO> findFaminyInfo(HttpSession httpSession){
        User admin = (User) httpSession.getAttribute("admin");
        return familyMembersService.findFaminyInfo(admin.getUserId());
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
     * 添加同住家庭成员信息
     * @param familyVO
     * @return
     */
    @ResponseBody
    @RequestMapping("/saveFamilyInfo")
    public Integer saveFamilyInfo(FamilyVO familyVO, HttpSession session){
        User admin = (User) session.getAttribute("admin");
        Integer userId = admin.getUserId();
        familyVO.setPersonal(userId);
        return familyMembersService.saveFamilyInfo(familyVO);
    }

    @ResponseBody
    @RequestMapping("/updateFamily")
    public Integer updateFamily(@RequestParam(value = "list")List list, HttpSession session){
        System.out.println(list);
        ArrayList<FamilyVO> objects = new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            JSONObject jsonObject = JSONObject.parseObject(list.get(i).toString());
            System.out.println(list.get(i));
            System.out.println();
            FamilyVO familyVO = new FamilyVO();
            familyVO.setFamilyName(jsonObject.getString("familyName"));
            objects.add(familyVO);
        }
        User admin = (User) session.getAttribute("admin");
        Integer countFamily = familyMembersService.findCountFamily(admin.getUserId());
        if(countFamily>0){
            Integer i = familyMembersService.updateFamily(objects);
        }else {
            System.out.println("无数据");
        }
        return countFamily;
    }
}
