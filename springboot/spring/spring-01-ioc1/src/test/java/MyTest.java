import com.lsgf.dao.UserDao;
import com.lsgf.dao.UserDaoOracleImpl;
import com.lsgf.service.UserService;
import com.lsgf.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
        //用户实际调用的是业务层，dao层他们不需要接触
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
//        userService.getUser();


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//
//        String userDaoName =new Scanner(System.in).nextLine() ;
//        UserDao userDaoDefault =(UserDao) context.getBean(userDaoName);
//
//        UserDao userDaoMysql =(UserDao) context.getBean("mysql");
//
//        UserDao userDaoOracle =(UserDao) context.getBean("oracle");

        UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
//        userService.setUserDao(userDaoDefault);
        userService.getUser();
    }
}
