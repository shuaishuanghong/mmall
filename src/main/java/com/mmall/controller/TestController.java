package com.mmall.controller;

import com.mmall.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Method;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private userService user;

    @RequestMapping("ss")
    public String test(Model model){
        model.addAttribute("ss",user.check());
        return "testIndex";
    }
}
