

### 学习视频

- [狂神说课程](https://www.bilibili.com/video/BV12J411M7Sj)
- [极客时间](https://www.bilibili.com/video/BV12h411R7JZ?p=19)

### 核心模块

- Spring core
- Spring beans
- spring context
- spring expression
- spring aop

### IOC

控制反转，依赖注入，反射
控制反转，是一种设计思想，依赖注入是实现IOC的一种方法。
控制反转是一种通过描述(xml或注解)并通过第三方去生产或获取特定对象的方式。在Sping中实现IOC的是IOC容器，其实现方式是依赖注入。
所谓IOC，一句话搞定：对象由Spring来创建管理和装配。
### IOC创建对象的方式
- 无参构造创建对象，默认。
- 有参数构造对象

### xml配置
所有xml中的对象，都会被创建，无论是否调用。
在配置文件加载的时候，容器中管理的对象就已经初始化了。
### spring配置
- 别名
```xml
<alias name="user" alias="fasdfasdf"></alias>
```
- bean配置
id：bean的唯一标识符，即对象名。 class:bean对象所对应的全限定名，包名+类名。 name：也是别名可以取多个 用逗号或者空格分开。 scope：作用域单例或者多例。
- import
用于团队开发使用，可以将多个配置文件，导入合并为一个。
applicationContext.xml
```xml
<import resource="bean1.xml" />
<import resource="bean2.xml" />
<import resource="bean3.xml" />
```
### 依赖注入
- 构造器注入
- set注入：bean对象的创建依赖于容器。bean对象中的所有属性，由容器来注入。
- 拓展方式注入：p命名和c命名，使用前需要导入约束。
