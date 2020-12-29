package com.population.controller;

import com.population.pojo.Province;
import com.population.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Province")
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    /**
     * 查询所有省
     * @return
     */
    @RequestMapping("/findProvince")
    @ResponseBody
    public List findProvince(){
        return provinceService.findProvince();
    }

    /**
     * 查询省下面所有的市
     * @param province 市信息
     * @return
     */
    @RequestMapping("/findCity")
    @ResponseBody
    public List findCity(Province province){
        return provinceService.findCity(province);
    }

    /**
     * 查询所有市下面的所有县
     * @param province
     * @return
     */
    @RequestMapping("/findCounty")
    @ResponseBody
    public List findCounty(Province province){
        return provinceService.findCounty(province);
    }

    /**
     * 查询乡镇
     * @param province
     * @return
     */
    @RequestMapping("/findArea")
    @ResponseBody
    public List findArea(Province province){
        return provinceService.findArea(province);
    }

}
