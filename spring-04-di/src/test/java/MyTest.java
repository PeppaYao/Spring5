import com.bytedance.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student1 = (Student) context.getBean("student_1");
        System.out.println(student1.toString());
    }
}
