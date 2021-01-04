package com.population.dao;

import com.population.pojo.User;
import com.population.pojo.power;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findPhone(String userPhone);

    Integer recuRuser(User user);

    Integer inertUser(User user);

}