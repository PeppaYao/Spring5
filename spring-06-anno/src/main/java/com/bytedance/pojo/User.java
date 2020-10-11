package com.bytedance.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//等价于<bean id="user" class="com.bytedance.pojo.User"></bean>
//组件
@Component
public class User {
    //<property name="name" value="姚军"/></property>

    public String name;
    @Value("姚军")
    public void setName(String name) {
        this.name = name;
    }
}
