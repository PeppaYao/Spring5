package com.bytedance.service;

import com.bytedance.dao.UserDao;

public class UserServiceImpl implements  UserService{

    //组合代替继承
    //private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;
    /***
     *之前，程序是主动创建对象，控制权在程序员手上。
     *使用set注入后，程序不再具有主动性，而是变成了被动的接收对象。
     *这种思想，从本质上解决了问题，我们程序员不用再去管理对象的创建。
     *工厂模式思想
     ***/
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void getUser() {
        userDao.getUser();
    }
}
