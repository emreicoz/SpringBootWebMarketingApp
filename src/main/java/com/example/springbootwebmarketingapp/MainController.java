package com.example.springbootwebmarketingapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value = {"/"})
    public String getHomePage() {
        return "main.html";
    }
}