package dao;
//
import com.lsgf.dao.UserDao;
import com.lsgf.pojo.User;
import com.lsgf.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();

            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();

            for (User user :
                    userList) {
                System.out.println(user.toString());
            }

            sqlSession.close();
    }

    @Test
    public void getUserById(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();
        //执行
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        User user = mapper.getUserById(1);
        System.out.println(user.toString());
        sqlSession.close();
    }

    static   Logger logger = Logger.getLogger(UserDaoTest.class);
    @Test
    public void testlog4j(){
        logger.info("info:进入了testLog4j");
        logger.debug("debug:进入了testLog4j");
        logger.error("error:进入了testLog4j");
    }

    @Test
    public void getUserByLimit(){

        SqlSession sqlSession  = MybatisUtils.getSqlSession();

        UserDao mapper = sqlSession.getMapper(UserDao.class);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex",3);
        map.put("pageSize",2);


        List<User> userList = mapper.getUserByLimit(map);

        for (User user :
                userList) {
            System.out.println(user.toString());
        }

        sqlSession.close();
    }

}

