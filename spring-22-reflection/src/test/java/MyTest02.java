import com.bytedance.controller.UserController;
import com.bytedance.domain.MyAutoWired;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

/**
 * @author yaojun
 * @create 2020-12-07 17:36
 */
public class MyTest02 {
    @Test
    public void test(){
        UserController userController = new UserController();
        //自定义注解进行注入
        Class aClass = userController.getClass();

        Stream.of(aClass.getDeclaredFields()).forEach(field->{
            MyAutoWired annotation = field.getAnnotation(MyAutoWired.class);
            if(annotation != null){
                field.setAccessible(true);
                Class<?> type = field.getType();
                try {
                    Object o = type.newInstance(); //有错
                    field.set(userController, o);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(userController.getUserService());
    }
}
