package com.population.service;

import com.github.pagehelper.PageInfo;
import com.population.pojo.User;
import com.population.pojo.power;
import com.population.vo.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User getUserByAccount(String userPhone);

    Message recuRuser(User user);

    List<power> findAllPorwer(Integer userId);

    PageInfo<User> findAllUser(Integer pageNum,Integer pageSize,User user);
}
