package com.example.springbootwebmarketingapp.controller;

import com.example.springbootwebmarketingapp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value = {"/"})
    public String getHomePage() {
        return "home";
    }

    @GetMapping("/login")
    public String login(Model model, @ModelAttribute("userLogin") User user) {
        model.addAttribute(user);
        return "login";
    }

    @GetMapping("/signUp")
    public String signUp(Model model, @ModelAttribute("user") User user) {
        model.addAttribute(user);
        return "signUp";
    }
}