package com.population.controller;

import com.population.pojo.personal;
import com.population.service.DicService;
import com.population.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/personal")
public class PersonalController {
    @Autowired
    private DicService dicService;

    @Autowired
    private PersonalService personalService;

    /**
     * 跳转到个人信息页面
     * @return
     */
    @RequestMapping("personal")
    public String personal(){
        return "basic/basic.html";
    }

    /**
     * 查询所有的字典表信息
     * @return 返回字典表信息的集合
     */
    @RequestMapping("findDic")
    @ResponseBody
    public List findDictionaries(){
        return dicService.findAll();
    }

    @RequestMapping("inserPersonal")
    @ResponseBody
    public Integer inserPersonal(personal personal){
    Integer inner=personalService.inserPersonal(personal);
    return inner;
    }
}
