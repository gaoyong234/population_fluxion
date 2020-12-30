package com.population.dao.MateDao;

import com.population.pojo.Mate;
import com.population.vo.MateVO;

import java.util.List;

public interface MateDaoMapper {


    //根据userId查询相应的配偶信息
    Mate selectMate(Integer userId);
    //查询全部的信息
    List<MateVO> selectAllMate();
    //修改配偶信息
    Integer updateMate(Mate mate);
    //删除配偶信息
    Integer delMateByUpdate(Integer maId);
    //添加配偶信息
    Integer insertMate(Mate mate);

}
