package com.cesgroup.zw.t04.trans.trans01;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cesgroup.zw.t04.trans.trans01.entity.Person;
import com.cesgroup.zw.t04.trans.trans01.service.PersonService;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TranscationConfig.class);
		
		System.out.println("-----------------------");
		print(context.getBeanDefinitionNames());
		
		PersonService personService = context.getBean(PersonService.class);

		personService.createTable();
		
		personService.add(new Person(1001,"zs"));
		
		personService.addException(new Person(1003,"zs---Ex"));
		
	}

	public static void print(String[] beanNames) {

		Arrays.asList(beanNames).forEach(System.out::println);
	}
}
