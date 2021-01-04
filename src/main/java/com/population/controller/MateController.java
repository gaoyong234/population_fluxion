package com.population.controller;

import com.population.pojo.Mate;
import com.population.pojo.User;
import com.population.service.MateService;
import com.population.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Mate")
public class MateController {

    @Autowired
    private MateService mateService;

    @RequestMapping("/toMate")
    public String toMate(){
        return "mate/mateMessage";
    }

    @RequestMapping("/addMate")
    @ResponseBody
    public Message addMate(Mate mate, HttpSession httpSession){
        User user = new User();
        user.setUserId(1);
        httpSession.setAttribute("admin",user);
        User admin = (User)httpSession.getAttribute("admin");
        mate.setUserId(admin.getUserId());
        return mateService.addMate(mate);
    }

}
