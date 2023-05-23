import com.lsgf.mapper.UserMapper;
import com.lsgf.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {



    @Test
    public void test() throws IOException {
        //通过mybatis配置来实现  以后被Spring取代了
//        String resources="mybatis-config.xml";
//        InputStream in = Resources.getResourceAsStream(resources);
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
//        SqlSession sqlSession = sessionFactory.openSession(true);
//
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = mapper.selectUser();
//        for (User user :
//                users) {
//            System.out.println(user);
//        }

        //方式一
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user:
             users) {
            System.out.println(user);
        }

        //方式二
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
        //!!
//        UserMapper mapper = context.getBean("userMapper2", UserMapper.class);
//        List<User> users = mapper.selectUser();
//        for (User user:
//                users) {
//            System.out.println(user);
//        }
    }
}
