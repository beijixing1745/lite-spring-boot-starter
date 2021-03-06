/**
 * Welcome to https://waylau.com
 */
package com.waylau.lite.spring.boot.starter.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Spring Security Configuration.
 * 
 * @since 1.0.0 2019年2月14日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@EnableWebSecurity // 启用Spring Security功能
public class LiteSecurityConfig 
	extends WebSecurityConfigurerAdapter {

	/**
	 * 自定义配置
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception { 
		
		// 允许所有人访问
		http.authorizeRequests().anyRequest().anonymous();
	}
	/*
	@Override
	protected void configure(HttpSecurity http) throws Exception { 
		http.authorizeRequests().anyRequest().authenticated() //所有请求都需认证
		.and()
		.formLogin() // 使用form表单登录
		.and()
		.httpBasic(); // HTTP基本认证
	}

	@SuppressWarnings("deprecation")
	@Bean
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager manager = 
				new InMemoryUserDetailsManager();
		
		manager.createUser(
				User.withDefaultPasswordEncoder()  // 密码编码器
				.username("waylau")  // 用户名
				.password("123")	// 密码
				.roles("USER")		// 角色
				.build()
				);
		return manager;
	}
	*/
}