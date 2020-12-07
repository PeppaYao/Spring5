package com.bytedance.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author yaojun
 * @create 2020-12-07 15:16
 */
@Component
public class User {
    @Value("yaojun")
    public String name;
    public User() {
        System.out.println("输出user构造函数...");
    }
}
