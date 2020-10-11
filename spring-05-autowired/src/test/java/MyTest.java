import com.bytedance.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Person person = context.getBean("person", Person.class);
        person.getCat().shut();
        person.getDog().shut();
    }
}
