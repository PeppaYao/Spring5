package com.bytedance.controller;

import com.bytedance.domain.MyAutoWired;
import com.bytedance.service.UserService;

/**
 * @author yaojun
 * @create 2020-12-07 17:33
 */
public class UserController {
    @MyAutoWired("张三")
    public UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public UserController() {
    }

    public UserService getUserService() {
        return userService;
    }
}
