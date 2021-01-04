package com.population.controller;

import com.population.pojo.Dic;
import com.population.service.DicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Dic")
public class DicController {

    @Autowired
    private DicService dicService;

    /**
     * 查询某父字典的所有子字典
     * @param prentId 父子点id
     * @return 所有子字典数据
     */
    @RequestMapping("/findDicByParentId")
    @ResponseBody
    public List<Dic> findDicByParentId(Integer prentId){
        return dicService.findDicByParentId(prentId);
    }
}
