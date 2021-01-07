package com.population.dao.UserDao;

import com.population.pojo.User;

import java.util.List;

public interface UserDaoMapper {
    List<User> selectAllUser(User user);
}
