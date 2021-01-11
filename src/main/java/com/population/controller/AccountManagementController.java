package com.population.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/AccountManagementController")
public class AccountManagementController {

    @RequestMapping("/toAccountManagement")
    public String toAccountManagement(){
        return "/account/AccountManagement";
    }

}
