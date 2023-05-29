//package com.greatlearning.studentfest.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//
//import javax.sql.DataSource;
//
//@EnableWebSecurity
//@Configuration
//public class JDBCSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    DataSource dataSource;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .jdbcAuthentication()
//                .dataSource(dataSource)
//                .withDefaultSchema()
//                .withUser(User.withUsername("abhay").password("abhay").roles("USER"))
//                .withUser(User.withUsername("rohan").password("rohan").roles("ADMIN"));
//    }
//}
