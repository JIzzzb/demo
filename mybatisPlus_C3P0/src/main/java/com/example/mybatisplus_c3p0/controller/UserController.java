package com.example.mybatisplus_c3p0.controller;

import com.example.mybatisplus_c3p0.dao.User;
import com.example.mybatisplus_c3p0.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/select")
    public String test() {
        return userService.selectUser().toString();
    }
}
