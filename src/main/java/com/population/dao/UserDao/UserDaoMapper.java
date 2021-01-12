package com.population.dao.UserDao;

import com.population.pojo.User;
import com.population.vo.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDaoMapper {

    //查询权限管理内的用户数据
    List<UserVO> selectAllUser(User user);

    //用户审核
    Integer updateUserAudit(@Param(value = "userId") Integer userId,@Param(value = "auditStatus") Integer auditStatus);

    //根据用户id查询用户信息
    UserVO selectOneUser(Integer userId);
    //查询自己角色下管辖的用户信息

    List<UserVO> selectUserByRoleId(User user);
}
