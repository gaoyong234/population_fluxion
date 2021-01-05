package com.population.service;

import com.population.pojo.Mate;
import com.population.vo.MateVO;
import com.population.vo.Message;

import java.util.List;

public interface MateService {

    //根据userId查询相应的配偶信息
    Mate findOndMate(Integer userId);
    //查询全部的信息
    List<MateVO> findAllMate();
    //修改配偶信息
    Message changeMate(Mate mate);
    //删除配偶信息
    Message removeMateByUpdate(Integer maId);
    //添加配偶信息
    Message addMate(Mate mate);
    //查询有无配偶
    Integer findCountMate(Integer userId);
}
