package com.example.mybatisplus_c3p0.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.mybatisplus_c3p0.dao.User;
import com.example.mybatisplus_c3p0.mapper.UserMapper;
import com.example.mybatisplus_c3p0.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Autowired
    public List<User> selectUser() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>();
        wrapper.eq(User::getName1, "test");
        return userMapper.selectList(wrapper);
    }
}
