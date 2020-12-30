package com.population.controller;

import com.population.service.MateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Mate")
public class MateController {

    @Autowired
    private MateService mateService;

    @RequestMapping("/toMate")
    public String toMate(){
        return "mate/mateMessage";
    }

}
