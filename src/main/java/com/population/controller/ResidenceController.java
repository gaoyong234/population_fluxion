package com.population.controller;

import com.population.pojo.User;
import com.population.service.ResidenceService;
import com.population.vo.DwellVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

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
    public Integer saveResidenceInfo(DwellVO dwellVO,HttpSession session){
        User admin = (User) session.getAttribute("admin");
        dwellVO.setSpareInt(admin.getUserId());
        Integer count = residenceService.findResidenceCountInfo(admin.getUserId());
        if(count>0){
            System.out.println("有数据");
            return residenceService.updateResidenceInfo(dwellVO);
        }
        return residenceService.saveResidenceInfo(dwellVO);
    }

}