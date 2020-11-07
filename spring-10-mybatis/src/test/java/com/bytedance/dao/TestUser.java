package com.bytedance.dao;


import com.bytedance.pojo.User;
import com.bytedance.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestUser{
    @Test
    public void test() throws Exception{
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userdao = context.getBean("userdao", UserDao.class);
        List<User> userList = userdao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
