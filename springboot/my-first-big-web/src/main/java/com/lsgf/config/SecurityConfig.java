package com.lsgf.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/queryCt4WordList").hasRole("fp5")
                .antMatchers("/deleteWordById").hasRole("fp7");

        http.formLogin().loginPage("/pleaseLogin")
                .loginProcessingUrl("/login");

        http.csrf().disable();//关闭csrf功能

        //注销
        http.logout()
                .deleteCookies("remove")
                .invalidateHttpSession(true)
                .logoutSuccessUrl("/");//注销后跳转回首页

        //开启记住我功能
        http.rememberMe();
    }


//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().passwordEncoder(
////                .withUser("lsgf")
//        )
//    }

}
