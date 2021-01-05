package com.population.controller;

import com.population.pojo.Mate;
import com.population.pojo.User;
import com.population.service.MateService;
import com.population.vo.MateVO;
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

    /**
     * 添加配偶
     * @param mate 配偶信息
     * @param httpSession session
      * @return 添加成功信息
     */
    @RequestMapping("/addMate")
    @ResponseBody
    public Message addMate(Mate mate, HttpSession httpSession){
        User admin = (User)httpSession.getAttribute("admin");
        mate.setUserId(admin.getUserId());
        Integer countMate = mateService.findCountMate(admin.getUserId());
        if (countMate>0){
            return mateService.changeMate(mate);
        }
        return mateService.addMate(mate);
    }

    /**
     *  查询用配偶
     * @param session session 从中获取用户id
     * @return
     */
    @RequestMapping("/findMate")
    @ResponseBody
    public Mate findMate(HttpSession session){
        User admin = (User) session.getAttribute("admin");

        return mateService.findOndMate(admin.getUserId());
    }

}
