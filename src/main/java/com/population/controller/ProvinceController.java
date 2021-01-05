package com.population.controller;

import com.population.pojo.Province;
import com.population.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
     * @param provinceId 市信息id
     * @return
     */
    @RequestMapping("/findCity")
    @ResponseBody
    public List findCity(Integer provinceId){
        return provinceService.findCity(provinceId);
    }

    /**
     * 查询所有市下面的所有县
     * @param provinceId 省id
     * @param cityId  市 id
     * @return
     */
    @RequestMapping("/findCounty")
    @ResponseBody
    public List findCounty(
            @RequestParam(value = "provinceId") Integer provinceId,
            @RequestParam(value = "cityId") Integer cityId){
        return provinceService.findCounty(provinceId,cityId);
    }

    /**
     * 查询县下的所有镇
     * @param provinceId 省
     * @param cityId 市
     * @param countyId 县
     * @return
     */
    @RequestMapping("/findArea")
    @ResponseBody
    public List findArea(@RequestParam(value = "provinceId") Integer provinceId,
                         @RequestParam(value = "cityId") Integer cityId,
                         @RequestParam(value = "countyId") Integer countyId){
        return provinceService.findArea(provinceId,cityId,countyId);
    }

}
