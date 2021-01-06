package com.population.service;

import com.population.pojo.Employing;
import com.population.vo.EmployingVO;
import com.population.vo.Message;

import java.util.List;

public interface EmployingService {
    //添加
    Message addEmploying(Employing employing);
    //修改
    Message changeEmploying(Employing employing);
    //删除
    Message removeEmployingUpdate(Integer empId);
    //查询
    List<EmployingVO> findAllEmploying();
    //查询单条
    EmployingVO findEmploying(Integer userId);
    //查询条数num
    Integer findEmployingCount(Integer userId);
}
