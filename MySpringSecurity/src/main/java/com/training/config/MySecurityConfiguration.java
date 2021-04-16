package com.training.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@EnableWebSecurity
public class MySecurityConfiguration extends 
WebSecurityConfigurerAdapter{
	
	public void configure(HttpSecurity httpSecurity) throws Exception
	{
	httpSecurity
	.authorizeRequests()
	.antMatchers("/hello/user")

	.hasRole("USER")
	.antMatchers("/hello/admin")
	.hasRole("ADMIN")
	.anyRequest()
	.authenticated()
	.and()
	.formLogin();

	httpSecurity.csrf().disable();
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception
	{
	auth
	.inMemoryAuthentication()
	.withUser("user1")
	.password("{noop}user1")
	.roles("USER")
	.and()
	.withUser("admin")
	.password("{noop}admin")
	.roles("ADMIN");

	}



}
