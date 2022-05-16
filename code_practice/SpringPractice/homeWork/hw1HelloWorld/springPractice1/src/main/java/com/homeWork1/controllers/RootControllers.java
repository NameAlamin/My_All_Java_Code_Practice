package com.homeWork1.controllers;

import com.homeWork1.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootControllers {

    @Autowired
    private AccountService accountService;



    @GetMapping("/")
    public String helloWorld(Model model) {
        System.out.println(accountService.getAccountDetails());
        model.addAttribute("name", "World");
        return "hello1";
    }

    @GetMapping("/say-hello")
    public String helloName(Model model, @RequestParam(name = "name", defaultValue = "") String name) {
        model.addAttribute("name", name.isBlank() ? "World" : name);
        return "hello1";
    }
}
