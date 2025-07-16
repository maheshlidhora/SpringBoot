package com.jspders.SpringBootSecurity.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig 
{
	@Autowired
	private UserDetailsService userDetailsService;
	
	private static final String[] PUBLIC_URLS = {
			"/", 
			"/index.html", 
			"/user/logPage", "/user/doLogin", "/submitLogForm", 
			"/user/regPage", "/user/doRegistration", "/submitRegForm",
			"/failed"
		};

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception 
    {
    	http.csrf((customizer) -> customizer.disable());
    	//    	Default Configuration for All Hit Points.
    	//    	http.authorizeHttpRequests((request) -> request.anyRequest().authenticated());
    	http.authorizeHttpRequests((request) -> request.requestMatchers(PUBLIC_URLS).permitAll().anyRequest().authenticated());

    	//    	For Web Login
    	http.formLogin(Customizer.withDefaults());
		//    	http.formLogin(form -> form
		//    			.loginPage("/user/logPage")
		//    			.defaultSuccessUrl("/", true)
		//    			.failureForwardUrl("/failed")
		//    			.failureUrl(null)
		//    			);
    	
    	//    	For API Login
    	http.httpBasic(Customizer.withDefaults());
        return http.build();
    }
    
    @Bean
    public AuthenticationProvider authenticationProvider() {
    	DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
    	//    	For No Password Encoder
    	//    	authenticationProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
    	authenticationProvider.setPasswordEncoder(new BCryptPasswordEncoder(12));
    	
    	
    	authenticationProvider.setUserDetailsService(userDetailsService);
    	return authenticationProvider;
    }
}