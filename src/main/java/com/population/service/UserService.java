package com.population.service;

import com.github.pagehelper.PageInfo;
import com.population.pojo.User;
import com.population.pojo.power;
import com.population.vo.Message;
import com.population.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User getUserByAccount(String userPhone);

    Message recuRuser(User user);

    List<power> findAllPorwer(Integer userId);

    PageInfo<User> findAllUser(Integer pageNum,Integer pageSize,User user);

    Message changeUserAudit(List<Integer> auditList,Integer auditStatus);

    UserVO findOneUser(Integer userId);

    PageInfo<UserVO> findUserByRoleId(Integer pageNum,Integer pageSize,User user);
}
