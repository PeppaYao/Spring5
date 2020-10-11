import com.bytedance.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
       //从applicationContext中获取对象
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       //需要什么就直接get
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");

        userServiceImpl.getUser();
    }
}
