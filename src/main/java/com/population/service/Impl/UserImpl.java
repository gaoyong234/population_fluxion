package com.population.service.Impl;

import com.population.dao.UserMapper;
import com.population.pojo.User;
import com.population.service.UserService;
import com.population.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByAccount(String userPhone) {
        User user= userMapper.findPhone(userPhone);
        return user;
    }

    @Override
    public Message recuRuser(User user) {
        Message m = new Message();
        Integer integer=userMapper.recuRuser(user);
        if (integer>0){
            m.setEstimate(false);
            m.setSlogan("该账号已被注册！！");
        }else {

           Integer uin= userMapper.inertUser(user);
           if (uin>0){
               m.setSlogan("注册成功！！");
               m.setEstimate(true);
           }

        }
        return m;
    }


}
