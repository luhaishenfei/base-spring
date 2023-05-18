package com.lsgf.dao;

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

    //    try{
            //执行
            //方式一
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();
            //方式二 不推荐使用
            //List<User> userList = sqlSession.selectList("com.lsgf.dao.UserDao.getUserList");

            for (User user :
                    userList) {
                System.out.println(user.getId()+","+user.getDname()+","+user.getLoc());
            }
      //  }catch (){

        //}finally {
            sqlSession.close();
        //}
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

        int res = mapper.addUser(new User(3,"测试部","长沙"));
        if (res>0){
            System.out.println("insert succeed");
            User user = mapper.getUserById(3);
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


    //万能Map  我们的实体类，或者数据库中的表、字段或者参数过多，我们应当考虑使用Map
    @Test
    public void addUser2(){
        SqlSession sqlSession  = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        Map<String, Object> map=new HashMap<>();
        map.put("userid",5);
        map.put("userloc","台湾");
        int res = mapper.addUser2(map);
        //提交事务  增删改必须提交事务
        sqlSession.commit();
        test();
        sqlSession.close();


    }

    //万能Map  我们的实体类，或者数据库中的表、字段或者参数过多，我们应当考虑使用Map
    @Test
    public void getUserById2(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();
        //执行
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        HashMap<String,Object> map = new HashMap<>();
        map.put("userid",10);
        User user = mapper.getUserById2(map);
        System.out.println(user.getId()+","+user.getDname()+","+user.getLoc());
        sqlSession.close();
    }


    @Test
    public void getUserLike(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        List<User> userList = mapper.getUserLike("长_");
        for (User user :
                userList) {
            System.out.println(user.getId()+","+user.getDname()+","+user.getLoc());
        }
        //  }catch (){

        //}finally {
        sqlSession.close();
        //}
    }


    @Test
    public void getUserLikesqlzhuru(){
        //获得sqlsession对象
        SqlSession sqlSession  = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        List<User> userList = mapper.getUserLikesqlzhuru("%长% or 1=1");
        for (User user :
                userList) {
            System.out.println(user.getId()+","+user.getDname()+","+user.getLoc());
        }

        sqlSession.close();
    }

}

