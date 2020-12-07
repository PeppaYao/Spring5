import com.bytedance.controller.UserController;
import com.bytedance.service.UserService;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author yaojun
 * @create 2020-12-07 18:40
 */
public class MyTest01 {
    @Test
    public void test() throws Exception {
        UserController userController = new UserController();
        Class clazz = userController.getClass();

        UserService userService = new UserService();
        //获取属性
        Field field = clazz.getField("userService");
        //只有通过方法才能够设置对应的属性值
        String name = field.getName();
        name = name.substring(0,1).toUpperCase() + name.substring(1);
        String setMethodName = "set" + name;
        //通过方法注入属性的对象
        Method service = clazz.getMethod(setMethodName, UserService.class);
        service.invoke(userController, userService); //第一个是实例，第二个是调用函数的参数们

        System.out.println(userController.getUserService());

    }
}
