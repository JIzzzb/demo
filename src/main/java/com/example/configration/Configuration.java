package com.example.configration;


import com.example.test.SpringTest;
import org.springframework.context.annotation.Bean;

//METHOD3
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public SpringTest getSpringTest() {
        return  new SpringTest();
    }
}
