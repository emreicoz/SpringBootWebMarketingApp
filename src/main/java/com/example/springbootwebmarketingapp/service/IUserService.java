package com.example.springbootwebmarketingapp.service;

import com.example.springbootwebmarketingapp.model.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();

    Long add(User user);

    void update(User user);

    void delete(Long id);

    User getSingle(Long id);

    Object getByLoginInfo(String email, String password);
}
