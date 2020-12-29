package com.population.dao.ProvinceDao;

import com.population.pojo.Province;
import com.population.vo.ProvinceVO;

import java.util.List;

public interface ProvinceDaoMapper {
    //查询省
    List<Province> selectProvince();
    //查询市
    List<Province> selectCity(Province pro);
    //查询县
    List<Province> selectCounty(Province pro);
    //查询乡镇
    List<Province> selectArea(Province pro);
    //根据乡镇信息查询相应的省市县
    //暂时不能用
    ProvinceVO selectProvinceCityCounty(Integer id);

}
