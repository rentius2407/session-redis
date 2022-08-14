package com.tut;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().disable()
                .csrf().disable()
                .cors().disable()
                .authorizeRequests().anyRequest().permitAll();

        http
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
                .invalidSessionUrl("/invalidSession");
    }
}
