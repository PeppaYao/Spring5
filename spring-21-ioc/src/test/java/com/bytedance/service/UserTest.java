package com.bytedance.service;

import com.bytedance.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yaojun
 * @create 2020-12-07 15:17
 */
public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.name);
    }
}
