package com.example.springbootwebmarketingapp.controller;

import com.example.springbootwebmarketingapp.model.User;
import com.example.springbootwebmarketingapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping
    public List<User> allUsers() {
        List<User> userList = userService.getAll();
        return userList;
    }

}
