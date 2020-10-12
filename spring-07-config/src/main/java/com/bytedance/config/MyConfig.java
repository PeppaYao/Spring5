package com.bytedance.config;

import com.bytedance.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//说明这个类被spring管理了，注册到容器中
//这是一个配置类，和bean.xml作用相同
@Configuration
//扫描目标下的bean
@ComponentScan("com.bytedance.pojo")
//导入其他配置类
@Import(MyConfig2.class)
public class MyConfig {
    //注册一个bean，就相当于xml中的bean标签
    //这个方法的名字，就相当于bean标签中的id
    //这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User(); //返回要注入到bean的对象
    }
}
