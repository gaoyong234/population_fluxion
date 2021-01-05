package com.population.dao.ProvinceDao;

import com.population.pojo.Province;
import com.population.vo.ProvinceVO;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface ProvinceDaoMapper {
    //查询省
    List<Province> selectProvince();
    //查询市
    List<Province> selectCity(Integer provinceId);
    //查询县
    List<Province> selectCounty(@Param(value = "provinceId") Integer provinceId, @Param(value = "cityId") Integer cityId);
    //查询乡镇
    List<Province> selectArea(@Param(value = "provinceId") Integer provinceId, @Param(value = "cityId") Integer cityId,@Param(value = "countyId") Integer countyId);
    //根据乡镇信息查询相应的省市县
    //暂时不能用
    ProvinceVO selectProvinceCityCounty(Integer id);
    //关于北京市，天津市，等处理
    List<Province> selectOneCity(Integer provinceId);
    //关于北京市
    List<Province> selectOneCounty(Integer provinceId);

}
