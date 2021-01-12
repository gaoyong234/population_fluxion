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

    /**
     *  查询所有流动人口信息+模糊查询+分页
     * @param pageNum   从第几页显示
     * @param pageSize 一页显示多少条
     * @param personalVO 接收条件查询的参数实体类vo
     * @return
     */
    @ResponseBody
    @RequestMapping("/findPersonalInfo")
    public PageInfo<PersonalVO> findPersonalInfo(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                                 @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize,
                                                 PersonalVO personalVO){
        return populationService.findPersonalInfo(pageNum,pageSize,personalVO);
    }

}
