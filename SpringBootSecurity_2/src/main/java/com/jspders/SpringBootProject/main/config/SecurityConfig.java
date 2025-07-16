package com.jspders.SpringBootProject.main.config;

import org.springframework.boot.autoconfigure.web.ServerProperties.Reactive.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig 
{
	private Customizer customizer;
	private Session session;
	
//	First Way with the Help of lambda Expressions Syntax.
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception 
	{
		http.csrf(customizer -> customizer.disable());
		http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
//		http.formLogin(Customizer.withDefaults());   // It will bring Login Form on Browser.
		http.httpBasic(Customizer.withDefaults());   // It will works for POSTMAN API. 
		
//		TO MAKE HTTP STATELESS (STATELESS MEANS IT NEVER CREATE COOOKIES ): So that we don't have to worry about Session ID & It disable Form Login By Default.
		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		 
		
		return http.build();
		
		
//		WHAT IS THE DIFFRENCE BETWEEN FORM & BASIC AUTHENTICATION.
		
//		AVOBE PROCESS WE CAN BE DECLARE AS ONE SINGLE BUILDER PATTERN.
//		return http
//				.csrf(customizer -> customizer.disable())
//				.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated())
//				.formLogin(Customizer.withDefaults())
//				.httpBasic(Customizer.withDefaults())
//				.sessionManagement(session -> session
//						.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//				.build();
	}
}
