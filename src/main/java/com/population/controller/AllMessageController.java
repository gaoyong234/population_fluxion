package com.population.controller;

import com.population.service.AllMessageService;
import com.population.vo.AllMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/AllMessage")
public class AllMessageController {
    @Autowired
    private AllMessageService allMessageService;

     @RequestMapping("/toAllMessage")
    public ModelAndView toAllMessage(Integer userId, ModelAndView modelAndView){
         System.out.println(userId);
         modelAndView.setViewName("allMessage/AllMessage");
         modelAndView.addObject("userId",userId);
         return modelAndView;
     }
     @RequestMapping("/findAllMessage")
     @ResponseBody
    public AllMessage findAllMessage(Integer userId){
         return allMessageService.findAllMessage(userId);
     }
}
