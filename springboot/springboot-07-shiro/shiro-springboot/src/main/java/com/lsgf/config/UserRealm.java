package com.lsgf.config;

import com.lsgf.pojo.User;
import com.lsgf.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

//自定义的 UserRealm
public class UserRealm extends AuthorizingRealm {
    @Autowired
    UserService userService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了=>授权Authorization");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        info.addStringPermission("user:add");

//        拿到当前登录的对象
        Subject subject = SecurityUtils.getSubject();
        User currentUser = (User) subject.getPrincipal();//拿到User对象

        //设置当前用户的权限
        info.addStringPermission(currentUser.getPerms());

        return info;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("执行了=>认证Authentication");
        UsernamePasswordToken userToken = (UsernamePasswordToken) token;

        //连接数据库
        User user = userService.queryUserByName(userToken.getUsername());
        if (user==null){//没有这个人
            return null;
        }
//        return new SimpleAuthenticationInfo("", user.getPwd(), "");


        Subject currentSubject=SecurityUtils.getSubject();
        Session session = currentSubject.getSession();
        session.setAttribute("loginUser",user);

        return new SimpleAuthenticationInfo(user, user.getPwd(), "");



//        String name = "root";
//        String password = "123456";
//
//        UsernamePasswordToken userToken = (UsernamePasswordToken) token;
//        if (!userToken.getUsername().equals(name)) {
//            return null;//抛出异常 UnKnownAccountException
//        }

        //密码认证，shiro做
//        return new SimpleAuthenticationInfo("", password, "");

    }
}
