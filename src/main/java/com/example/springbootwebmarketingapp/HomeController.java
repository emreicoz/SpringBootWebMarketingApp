package com.example.springbootwebmarketingapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = {"/home"})
    public String getHomePage() {
        return "home.html";
    }
}