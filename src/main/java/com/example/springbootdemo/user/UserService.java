package com.example.springbootdemo.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springbootdemo.user.dto.User;

@Service
public class UserService {
    List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public User create(User userDTO) {
        users.add(userDTO);
        return userDTO;
    }
}
