package com.population.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Employing")
public class EmployingController {
    @RequestMapping("/toEmploying")
    public String toEmploying(){
        return "employing/EmployingMessage";
    }

}
