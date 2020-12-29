package com.population.controller;

import com.population.service.DicService;
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

    @RequestMapping("personal")
    public String personal(){
        return "basic/basic.html";
    }


    @RequestMapping("findDic")
    @ResponseBody
    public List findDictionaries(){
        return dicService.findAll();
    }

}
