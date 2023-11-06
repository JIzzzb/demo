package com.example.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * spring容器类，容器外class获取容器内bean
 */
@Component
public class SpringUtils implements ApplicationContextAware {
    private static ApplicationContext spring;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        if (spring == null)
            spring = context;
    }

    //获取applicationContext
    public static ApplicationContext getApplicationContext() {
        return spring;
    }

    //通过name获取 Bean.
    public static Object getBean(String name) {
        return getApplicationContext().getBean(name);
    }

    //通过class获取Bean.
    public static <T> T getBean(Class<T> clazz) {
        return getApplicationContext().getBean(clazz);
    }

    //通过name,以及Clazz返回指定的Bean
    public static <T> T getBean(String name, Class<T> clazz) {
        return getApplicationContext().getBean(name, clazz);
    }

}
