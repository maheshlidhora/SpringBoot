package com.jspders.BeanProgram.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jspders.BeanProgram.Beans.User;

@Configuration
public class SpringConfig 
{
	@Bean
	public CommandLineRunner commandLineRunner()
	{
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				user1().display();
				System.out.println("-_-_-_-_-_-_-_");
				user2().display();
			}
		};
		
	}
	
	@Bean
	public User user1() 
	{
		return new User(101, "Anil", "Selesman");
	}
	@Bean
	public User user2() 
	{
		return new User(102, "Chiman", "Selesman");
	}
}
