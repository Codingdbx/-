package com.cesgroup.zw.t04.aop.aop01;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.cesgroup.zw.t04.aop.aop01.biz.Person;


public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		
		System.out.println("-----------------------");
		print(context.getBeanDefinitionNames());
		
		Person  person = context.getBean(Person.class);
		
		person.write();

	}

	public static void print(String[] beanNames) {

		Arrays.asList(beanNames).forEach(System.out::println);
	}
}
