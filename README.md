

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
### bean作用域
- singleton: 始终只创建一个实例。默认模式。
- prototype：每次获取的实例都是不同的。
- request：只能在web开发中使用到。
- session：只能在web开发中使用到。
- application：只能在web开发中使用到。
- websocket：只能在web开发中使用到。
### bean自动装配
- xml显示配置 
- 在Java中显示配置
- 隐式自动装配bean【重要】: 1.byname通过bean_id名。2.bytype通过类名。
小结：
- byname,需要保证所有bean的id唯一，并且这个bean需要和自动注入的属性的set方法的值一致。
- bytype,需要保证所有bean的class唯一，并且这个bean需要和自动注入的属性的类型一致。
### 使用注解实现自动装配
jdk1.5支持注解，spring2.5支持注解。
使用注解
- 导入约束。`xmlns:context="http://www.springframework.org/schema/context"`
- 配置注解的支持。`<context:annotation-config/>`
@AutoWired
既可以在属性上使用，也可以在set方法上使用。
使用AutoWired可以不用编写set方法，前提是这个自动装配的属性在IOC容器中存在，且符合名字byname
@Nullable标记这个字段可以为Null
如果显示定义了AutoWired的required属性为false，说明这个对象可以为Null，否则不允许为空。
```java
@AutoWired(required=false)
```
@AutoWired无法自动装配时，可以使用@Qualifier(value="dog222")指定唯一的bean对象注入。
```java
@Autowired
@Qualifier(value = "cat111")
```