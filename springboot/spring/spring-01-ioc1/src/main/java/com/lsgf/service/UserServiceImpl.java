package com.lsgf.service;

import com.lsgf.dao.UserDao;
import com.lsgf.dao.UserDaoImpl;
import com.lsgf.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{

//    private UserDao userDao = new UserDaoMysqlImpl();
    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
