package com.jspders.TheOrionWriters.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.jspders.TheOrionWriters.StaticController.StaticController;

@Configuration
public class SecurityConfig extends StaticController{
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/index.html").permitAll()  // allow access to index
                .anyRequest().authenticated()                     // all others need login
            )
            .formLogin(form -> form
                    .loginPage("/login.html")  // 👈 your custom login page
                    .loginProcessingUrl("/logPage") // 👈 Spring will handle POST here
                    .defaultSuccessUrl("/", true)
                    .permitAll()
                );
//                .logout()
//                    .logoutSuccessUrl("/") // 👈 redirect to home on logout
//                    .permitAll();  // use default login page        
        return http.build();
    }
}
