package com.cesgroup.bdc.optional;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class OptionalMain {

	public static void main(String[] args) {
		
		Integer value1 = null;
		
		// 当为null时默认为0
		Optional<Integer> optional = Optional.ofNullable(value1);
		Integer num = optional.orElse(0);
		
		
		System.out.println(num);
		
		Person person = null ;
		
		Function<String, Person> fun = Person::new;
		Person person01 = Optional.ofNullable(person).orElse(fun.apply("wx"));
		System.out.println(person01.getName());

	
	}
	
	static class Person{
		private String name;
		public Person(String name) {this.name = name;}
		
		public String getName() {return name;};
	}
}
