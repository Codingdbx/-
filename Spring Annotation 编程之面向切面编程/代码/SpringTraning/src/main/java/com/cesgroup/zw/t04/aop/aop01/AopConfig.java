package com.cesgroup.zw.t04.aop.aop01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.cesgroup.zw.t04.aop.aop01.biz.Person;

@EnableAspectJAutoProxy
@Configuration
public class AopConfig {
	
	@Bean
	public Person person() {
		return new Person();
	}
	
	@Bean
	public Advices advices() {
		return new Advices();
	}

}
