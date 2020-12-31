package com.population.controller;

import com.population.pojo.User;
import com.population.service.UserService;
import com.population.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

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

    @RequestMapping("toRegister")
    public String toRegister(){
        return "register";
    }


    @RequestMapping("userRecur")
    @ResponseBody
    public Message Recur(User user){
        Message message= userService.recuRuser(user);
        return message;
    }

}
