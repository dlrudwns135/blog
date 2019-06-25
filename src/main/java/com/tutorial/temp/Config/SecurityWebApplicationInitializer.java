package com.tutorial.temp.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * SecurityWebApplicationInitializer기능명
 *
 * @작성일 : 19.06.25
 * @작성자 : leekj
 * @클래스설명 :
 */
@Configuration
@EnableWebSecurity
public class SecurityWebApplicationInitializer extends WebSecurityConfigurerAdapter {
    @Autowired private UserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity
                .authorizeRequests()
                .antMatchers("/").permitAll()
            .and()
            .csrf().disable()
            .httpBasic();
    }
}
