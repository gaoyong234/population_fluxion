package com.population.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/statistics")
public class Statistics {

    @RequestMapping("message")
    public String toStatistics(){
        return "statistics/statistics.html";
    }
}
