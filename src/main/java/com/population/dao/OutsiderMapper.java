package com.population.dao;

import com.population.pojo.User;
import com.population.vo.OutsiderVo;
import com.population.vo.UserMyVo;

import java.util.List;

public interface OutsiderMapper {
    List<OutsiderVo> findOutsider(UserMyVo user);
}
