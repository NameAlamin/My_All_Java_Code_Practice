package com.hp1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootControllers {
    @GetMapping("/")
    public String helloWorld(Model model){
        model.addAttribute("message","Running Message");
        return  "hello";
    }
}
