package com.example.springbootwebmarketingapp.service;

import com.example.springbootwebmarketingapp.model.User;
import com.example.springbootwebmarketingapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        List<User> userList = (List<User>) userRepository.findAll();
        return userList;
    }

    @Override
    public Long add(User user) {
        Long userId = user.getId();
        userRepository.save(user);
        return userId;
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getSingle(Long id) {
        User user = userRepository.findById(id).get();
        return user;
    }

    @Override
    public Object getByLoginInfo(String userName, String password) {
        Object user = userRepository.findByLoginInfo(userName, password);
        return user;
    }
}
