package com.mmall.controller;

import com.mmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private IUserService user;

    @RequestMapping("ss")
    public String test(Model model){
        model.addAttribute("ss",user.check());
        return "testIndex";
    }
}
