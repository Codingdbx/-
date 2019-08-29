package com.cesgroup.zw.t04.trans.trans01;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@ComponentScan("com.cesgroup.zw.t04.trans.trans01")
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
public class TranscationConfig {
	
	@Bean
	public DataSource datasource() {
		
		DruidDataSource datasource = new DruidDataSource();
		datasource.setDriverClassName(driverClass);
		datasource.setUrl(jdbcUrl);
		datasource.setUsername(username);
		datasource.setPassword(password);
		return datasource;
	}
	
	@Bean
	public PlatformTransactionManager PlatformTransactionManager() {
		return new DataSourceTransactionManager(datasource());
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(datasource());
	}
	

	@Value("${spring.datasource.driver-class-name}")
	private String driverClass;
	
	@Value("${spring.datasource.url}")
	private String jdbcUrl;
	
	@Value("${spring.datasource.username}")
	private String username;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	
}
