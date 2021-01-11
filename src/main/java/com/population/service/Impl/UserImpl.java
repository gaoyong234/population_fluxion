package com.population.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.population.dao.UserDao.UserDaoMapper;
import com.population.dao.UserMapper;
import com.population.dao.powerMapper;
import com.population.pojo.User;
import com.population.pojo.power;
import com.population.service.UserService;
import com.population.util.ReturnUtil;
import com.population.vo.Message;
import com.population.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private powerMapper powerMapper;
    @Autowired
    private UserDaoMapper userDaoMapper;

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
            Date date = new Date();
            user.setGmtCreate(date);
            Integer uin= userMapper.inertUser(user);
           if (uin>0){
               m.setSlogan("注册成功！！");
               m.setEstimate(true);
           }

        }
        return m;
    }

    @Override
    public List<power> findAllPorwer(Integer userId) {
        return powerMapper.findAllPower(userId);
    }

    @Override
    public PageInfo<User> findAllUser(Integer pageNum, Integer pageSize, User user) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> userList = userDaoMapper.selectAllUser(user);
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return pageInfo;
    }

    @Override
    public Message changeUserAudit(List<Integer> auditList, Integer auditStatus) {

        Integer num = 0;
        for (int i = 0; i < auditList.size(); i++) {
            num += userDaoMapper.updateUserAudit(auditList.get(i), auditStatus);
        }
        Message message = ReturnUtil.returnData("审核", num);

        return message;
    }

    @Override
    public UserVO findOneUser(Integer userId) {
        return userDaoMapper.selectOneUser(userId);
    }

    @Override
    public PageInfo<UserVO> findUserByRoleId(Integer pageNum, Integer pageSize,User user) {
        PageHelper.startPage(pageNum,pageSize);
        List<UserVO> list = userDaoMapper.selectUserByRoleId(user);
        PageInfo<UserVO> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }


}
