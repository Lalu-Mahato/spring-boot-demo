package com.example.springbootdemo.user.dto;

import lombok.Data;

@Data
public class User {
    private String name;
    private String email;
    private String department;
    private Integer experience;
}
