package com.lsgf.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//AOP
//授权
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //链式编程
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //首页所有人可以访问，功能页只有对应有权限的人才能访问
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("vip1")
                .antMatchers("/level2/**").hasRole("vip2")
                .antMatchers("/level3/**").hasRole("vip3");

        //没用权限默认会到登录页面
        //Login
        http.formLogin().loginPage("/toLogin")
//                .usernameParameter("user")
//                .passwordParameter("pwd")
                .loginProcessingUrl("/login");



        //防止网络工具
        http.csrf().disable();//关闭csrf功能

        //注销
        http.logout()
                .deleteCookies("remove")
                .invalidateHttpSession(true)
                .logoutSuccessUrl("/");//注销后跳转回首页

        //开启记住我功能
        http.rememberMe();
    }

    //认证
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {



        //这些数据正常应该从数据库中读
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("lsgf").password(new BCryptPasswordEncoder().encode("123456")).roles("vip2", "vip3")
                .and()
                .withUser("root").password(new BCryptPasswordEncoder().encode("123")).roles("vip1", "vip2", "vip3")
                .and()
                .withUser("guest").password(new BCryptPasswordEncoder().encode("123456")).roles("vip1");

    }
}
