package dao;

import com.lsgf.dao.UserDao;
import com.lsgf.pojo.User;
import com.lsgf.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void test(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();

            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();

            for (User user :
                    userList) {
                System.out.println(user.getId()+","+user.getDname()+","+user.getLoc());
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
        System.out.println(user.getId()+","+user.getDname()+","+user.getLoc());
        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession  = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        int addUserId =4;

        int res = mapper.addUser(new User(addUserId,"测试部","长沙"));
        if (res>0){
            System.out.println("insert succeed");
            User user = mapper.getUserById(addUserId);
            System.out.println(user.getId()+","+user.getDname()+","+user.getLoc());
        }
        //提交事务  增删改必须提交事务
        sqlSession.commit();

        sqlSession.close();


    }

    @Test
    public void updateUser(){
        SqlSession sqlSession  = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        int res = mapper.updateUser(new User(3,"更新部","天津"));
        if (res>0){
            System.out.println("update succeed");
            User user = mapper.getUserById(3);
            System.out.println(user.getId()+","+user.getDname()+","+user.getLoc());
        }
        //提交事务  增删改必须提交事务
        sqlSession.commit();

        sqlSession.close();


    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession  = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        int res = mapper.deleteUser(3);
        if (res>0){
            System.out.println("delete succeed");
        }
        //提交事务  增删改必须提交事务
        sqlSession.commit();

        sqlSession.close();


    }

}

