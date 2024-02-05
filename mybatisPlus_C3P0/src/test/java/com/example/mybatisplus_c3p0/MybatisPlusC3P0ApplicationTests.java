package com.example.mybatisplus_c3p0;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class MybatisPlusC3P0ApplicationTests {

    protected Logger logger = LoggerFactory.getLogger(MybatisPlusC3P0ApplicationTests.class);

    @Before
    public void init() {
        logger.info("test start");
    }

    @After
    public void after(){
        logger.info("test end");
    }

}
