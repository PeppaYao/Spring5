import com.bytedance.dao.UserMysqlImpl;
import com.bytedance.dao.UserOracleImpl;
import com.bytedance.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        //用户实际调用的是业务层，DAO层它们不需要接触。
        //业务层再去调用DAO层
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserMysqlImpl());
        userService.getUser();

        userService.setUserDao(new UserOracleImpl());
        userService.getUser();
    }
}
