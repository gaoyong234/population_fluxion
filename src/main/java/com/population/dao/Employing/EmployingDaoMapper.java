package com.population.dao.Employing;

import com.population.pojo.Employing;
import com.population.vo.EmployingVO;

import java.util.List;

public interface EmployingDaoMapper {
    //添加
    Integer insertEmploying(EmployingVO employingVO);
    //修改
    Integer updateEmploying(EmployingVO employingVO);
    //删除
    Integer deleteEmployingUpdate(Integer empId);
    //查询
    List<EmployingVO> selectAllEmploying();
    //查询单条
    EmployingVO selectEmploying(Integer userId);
    //查询条数num
    Integer selectEmployingCount(Integer userId);
}
