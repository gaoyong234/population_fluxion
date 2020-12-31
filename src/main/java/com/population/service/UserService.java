package com.population.service;

import com.population.pojo.User;
import com.population.vo.Message;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User getUserByAccount(String userPhone);

    Message recuRuser(User user);
}
