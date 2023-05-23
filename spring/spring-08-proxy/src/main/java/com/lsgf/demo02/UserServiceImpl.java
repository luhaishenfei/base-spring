package com.lsgf.demo02;

public class UserServiceImpl implements UserService {

    @Override
    public void add() {
//        通过代理实现日志，让业务更存粹
//        System.out.println("使用了add方法");
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
//        System.out.println("使用了delete方法");
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
//        System.out.println("使用了update方法");
        System.out.println("修改了一个用户");
    }

    @Override
    public void query() {
//        System.out.println("使用了query方法");
        System.out.println("查询了一个用户");
    }
}
