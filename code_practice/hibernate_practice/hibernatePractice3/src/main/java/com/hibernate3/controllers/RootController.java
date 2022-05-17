package com.hibernate3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {
    @GetMapping("/")
    public String helloWorld(Model model){
        model.addAttribute("name","Hello Alamin");
        return "home";
    }
    @GetMapping("/profile")
    public String helloHome(Model model){
        return "profile";
    }
}
