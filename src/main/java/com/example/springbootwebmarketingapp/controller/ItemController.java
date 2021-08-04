package com.example.springbootwebmarketingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {
    @RequestMapping(value = {"/home"})
    public String getHomePage() {
        return "home";
    }
}