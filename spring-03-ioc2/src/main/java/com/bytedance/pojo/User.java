package com.bytedance.pojo;

public class User {
    private String name;
    public User(){
        System.out.println("默认无参构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name = "+name);
    }
}
