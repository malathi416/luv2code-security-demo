package com.example.luv2codesecuritydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
}
