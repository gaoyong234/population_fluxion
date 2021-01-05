package com.population.controller;

import com.population.pojo.User;
import com.population.pojo.power;
import com.population.service.UserService;
import com.population.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("userLogin")
public class UserController {
    @Autowired
    private UserService userService;
    /**
     *
     * @param userPhone 用户名
     * @param userPassword 密码
     * @param httpSession session
     * @return  登 录主页
     */
    @RequestMapping("/login")
    @ResponseBody
    public Message userLogin(String userPhone, String userPassword, HttpSession httpSession){
        //通过用户名密码查到用户信息
        User admin = userService.getUserByAccount(userPhone);
        Message m = new Message();
        if (admin!=null) {
            if (userPassword != null && userPassword.equals(admin.getUserPassword())) {
                httpSession.setAttribute("admin", admin);
                m.setEstimate(true);
                m.setXyId(admin.getUserId());
                m.setSlogan("正确！！");
            }else {
                m.setEstimate(false);
                m.setSlogan("用户名或密码不正确！！");
            }
        }else {
            m.setEstimate(false);
            m.setSlogan("未找到该用户,请核验用户名！！");
        }
        return m;
    }

    /**
     * 页面跳转到 注册
     * @return
     */
    @RequestMapping("toRegister")
    public String toRegister(){
        return "register";
    }

    /**
     * 页面跳转到 主页
     * @return
     */
    @RequestMapping("inindex")
    public String inindex(){
        return "index";
    }

    /**
     * 判断用户是否已经被注册,如果没有注册,则注册
     * @param user 前端传入的用户信息
     * @return 返回一个类.里面有提示信息
     */
    @RequestMapping("userRecur")
    @ResponseBody
    public Message Recur(User user){
        Message message= userService.recuRuser(user);
        return message;
    }

    /**
     * 登录成功 跳转 页面
     * @return
     */
    @RequestMapping("homePage")
    public String inHomePage(){
        return "homePage1";
    }

    /**
     * 查询所有的权限
     * @param session 从session中获取用户的ID
     * @return 返回一个自身所有拥有的权限的集合
     */
    @RequestMapping("findAllPorwer")
    @ResponseBody
    public List<power> findPorwer(HttpSession session){
        User admin = (User) session.getAttribute("admin");
        Integer userId = admin.getUserId();
        List<power> list=userService.findAllPorwer(userId);
        return list;
    }

}
