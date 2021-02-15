package com.ex.maven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Configure {
	DriverManagerDataSource dmds;
	JdbcTemplate template;
	
	@Bean
	public DriverManagerDataSource getConnection() {
		dmds=new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/motivity");
		dmds.setUsername("root");
		dmds.setPassword("root");
		return dmds;
	}
	@Bean
	public JdbcTemplate getTemplate() {
		template=new JdbcTemplate();
		template.setDataSource(dmds);
		return template;
	}
	@Bean
	public StudentDao dao() {
		StudentDao sdao=new StudentDao();
		sdao.setJdbcTemplate(template);
		return sdao;
	}
}
