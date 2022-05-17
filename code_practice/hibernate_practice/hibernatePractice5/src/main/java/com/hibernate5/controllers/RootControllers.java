package com.hibernate5.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootControllers {
    @GetMapping("/")
    public String madeModel(Model model){
        model.addAttribute("name","Hi Alamin ");
        return "hello";
    }
}
