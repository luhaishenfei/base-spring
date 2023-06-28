package dao;
//
import com.lsgf.dao.UserDao;
import com.lsgf.pojo.User;
import com.lsgf.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();

            //底层用的反射
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();

            for (User user :
                    userList) {
                System.out.println(user.toString());
            }

            sqlSession.close();
    }

    @Test
    public void testGetUserByIDAndName(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();

        //底层用的反射
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserByIDAndName(2,"秘书部");

        for (User user :
                userList) {
            System.out.println(user.toString());
        }

        sqlSession.close();
    }

    @Test
    public void testAddUser(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();

        //底层用的反射
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int res = mapper.addUser(new User(3,"司机部","上海"));
        if (res>0){
            System.out.println("插入成功");
            sqlSession.commit();
        }

        sqlSession.close();
    }


    @Test
    public void testUpdateUser(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();

        //底层用的反射
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int res = mapper.UpdateUser(new User(3,"更新部","南京"));
        if (res>0){
            System.out.println("更新成功");
            sqlSession.commit();
        }
        sqlSession.close();
    }


    @Test
    public void testDeleteUser(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();

        //底层用的反射
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        int res = mapper.DeleteUser(3);
        if (res>0){
            System.out.println("删除成功");
            sqlSession.commit();
        }
        sqlSession.close();
    }


}

