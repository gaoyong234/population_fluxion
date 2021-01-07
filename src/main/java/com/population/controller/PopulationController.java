package com.population.controller;

import com.github.pagehelper.PageInfo;
import com.population.service.PopulationService;
import com.population.vo.PersonalVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("population")
public class PopulationController {

    @Autowired
    private PopulationService populationService;

    /**
     * 跳转到流动人口信息管理界面
     * @return
     */
    @RequestMapping("/toPopulationInfo")
    public String toPopulationInfo(){
        return "population/populationInfo";
    }

    @ResponseBody
    @RequestMapping("/findPersonalInfo")
    public PageInfo<PersonalVO> findPersonalInfo(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                                 @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize,
                                                 PersonalVO personalVO){
        return populationService.findPersonalInfo(pageNum,pageSize,personalVO);
    }

}
