package com.example.mybatisplus_c3p0.service;

import com.example.mybatisplus_c3p0.dao.User;

import java.util.List;

public interface UserService {

    public List<User> selectUser();
}
