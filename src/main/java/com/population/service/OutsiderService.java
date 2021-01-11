package com.population.service;

import com.population.pojo.User;
import com.population.vo.OutsiderVo;
import com.population.vo.UserMyVo;

import java.util.List;

public interface OutsiderService {
    List<OutsiderVo> findOutsider(UserMyVo userProvince);
}
