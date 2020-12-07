package com.bytedance.config;

import com.bytedance.service.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author yaojun
 * @create 2020-12-07 15:40
 */
@Configuration
@ComponentScan("com.bytedance.service")
public class MyConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
