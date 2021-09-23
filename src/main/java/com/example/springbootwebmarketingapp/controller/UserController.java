package com.example.springbootwebmarketingapp.controller;

import com.example.springbootwebmarketingapp.model.User;
import com.example.springbootwebmarketingapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> allUsers() {
        List<User> userList = userService.getAll();
        return ResponseEntity.ok(userList);
    }

    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:/home";
    }

    @GetMapping("/getUser")
    public String getUser(Long id) {
        User user = userService.getSingle(id);
        return "userDetail";
    }

    @PostMapping("/updateUser")
    public String updateUser(User user) {
        userService.add(user);
        return "User updated";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("userLogin") Object user) {
        /*try{
            userService.getByLoginInfo(user.email, user.password);
        }catch (Error error){
            System.out.println(error);
        }

         */
        return "Logged in";
    }


}
