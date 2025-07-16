package com.jspiders.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
public class SpringConfig 
{
	@Bean
	public DriverManagerDataSource managerDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/USER", "root", "78789899");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dataSource;
	}
	@Bean
	public NamedParameterJdbcTemplate parameterJdbcTemplate() {
		return new NamedParameterJdbcTemplate(managerDataSource());
	}
}
