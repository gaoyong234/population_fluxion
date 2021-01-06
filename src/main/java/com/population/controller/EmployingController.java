package com.population.controller;

import com.population.pojo.Employing;
import com.population.pojo.User;
import com.population.service.EmployingService;
import com.population.vo.EmployingVO;
import com.population.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/Employing")
public class EmployingController {

    @Autowired
    private EmployingService employingService;

    @RequestMapping("/toEmploying")
    public String toEmploying(){
        return "employing/EmployingMessage";
    }

    @RequestMapping("/addEmploying")
    @ResponseBody
    public Message addEmploying(Employing employing ,HttpSession session){

        User admin = (User) session.getAttribute("admin");
        if (employingService.findEmployingCount(admin.getUserId())>0){
            return employingService.changeEmploying(employing);
        }
        employing.setSpareInt(admin.getUserId());
        return employingService.addEmploying(employing);
    }
    @RequestMapping("/findEmploying")
    @ResponseBody
    public EmployingVO findEmploying(HttpSession session){
        User admin = (User) session.getAttribute("admin");
        return employingService.findEmploying(admin.getUserId());
    }

}
