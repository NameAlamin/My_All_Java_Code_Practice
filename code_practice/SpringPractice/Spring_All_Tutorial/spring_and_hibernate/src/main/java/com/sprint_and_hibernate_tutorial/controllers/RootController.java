package com.sprint_and_hibernate_tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {
    @GetMapping("/")
    public String helloWorld(Model model) {
        model.addAttribute("name", "World");
        return "helloworld";
    }
}
