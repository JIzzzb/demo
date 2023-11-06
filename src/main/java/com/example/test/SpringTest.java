package com.example.test;

import com.example.service.UserService;
import com.example.utils.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class SpringTest {

    @Resource
   UserService userService; // 直接使用容器报空指针异常
    /**
     * 测试spring容器外的类如何使用spring内部容器
     * two ways: 1、把类从容器中拿出来 2、把当前类放入容器
     */
    public void test1() {
        //method1 通过SpringUtils工具类实现容器外使用容器内对象
//        UserService userService = SpringUtils.getBean(UserService.class);
        userService.getMsg();
    }
}
