package com.example.demo;

import com.example.test.SpringTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    SpringTest springTest;

    @Test
    void contextLoads() {
        springTest.test1();
    }

}
