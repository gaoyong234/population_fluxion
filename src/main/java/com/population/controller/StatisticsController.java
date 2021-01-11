package com.population.controller;

import com.population.pojo.User;
import com.population.pojo.personal;
import com.population.service.OutsiderService;
import com.population.service.PersonalService;
import com.population.service.ProvinceService;
import com.population.service.UserService;
import com.population.vo.OutsiderVo;
import com.population.vo.UserMyVo;
import com.population.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/statistics")
public class StatisticsController {
    @Autowired
    private ProvinceService provinceService;

    @Autowired
    private UserService userService;

    @Autowired
    private OutsiderService outsiderService;

    @RequestMapping("message")
    public String toStatistics(){
        return "statistics/statistics.html";
    }

    /**
     * 查询省下面所有的市
     * @param httpSession 拿取用户信息
     * @return 返回一个市的集合
     */
    @RequestMapping("/findCity")
    @ResponseBody
    public List findCity( HttpSession httpSession){
        User admin = (User)httpSession.getAttribute("admin");
        Integer userId = admin.getUserId();
        UserVO oneUser = userService.findOneUser(userId);
        Integer userProvince = oneUser.getUserProvince();
        return provinceService.findCity(userProvince);
    }

    /**
     * 查询用户自己的信息
     * @param httpSession 从Session中获取自己的数据
     * @return 返回从Session 中获取的用户信息
     */
    @RequestMapping("findUser")
    @ResponseBody
    public User findUser(HttpSession httpSession){
        User admin = (User)httpSession.getAttribute("admin");
        return admin;
    }


    @RequestMapping("findOutsider")
    @ResponseBody
    public List findOutsider(UserMyVo user, HttpSession session){
        User admin = (User)session.getAttribute("admin");
        Integer userProvince = admin.getUserProvince();
        user.setUserProvince(userProvince);
        List<OutsiderVo> voList= outsiderService.findOutsider(user);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        return voList;
    }

}
