package com.cesgroup.bdc.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference01 {
	
	public static void main(String[] args) {
		
		
		// 静态方法引用 Integer num = Integer.parseInt("123");
		Function<String,Integer> fun = Integer::parseInt;
		Integer num = fun.apply("123");
		System.out.println(num);
		
		// 实例方法引用 new Person().display();
		Consumer<String> consumer = new Person()::display;
		consumer.accept("hello");
		
		// 无参构造方法引用 new Person();
		Supplier<Person> supplier = Person::new;
		supplier.get().display("hello");
			
		// 一个参数构造方法引用 new Person("wx") 
		Function<String, Person> person01 = Person::new;
		Person per = person01.apply("wx");
		
		// 二个参数构造方法引用 new Person("wx",12) 
		BiFunction<String,Integer,Person> person02 = Person::new;
		person02.apply("wx", 12);
		
		// 函数方法引用
		BiConsumer<Person, String> biConsumer = Person::display;
		biConsumer.accept(new Person(), "hello");
		
		// String 类 public String toUpperCase()
		Function<String,String> strFun = String::toUpperCase;
		System.out.println(strFun.apply("hello"));

		
	}
	
	static class Person {
		private String name ="";
		public Person() {};
		public Person(String name) {this.name = name;};
		public Person(String name,int age) {this.name = name;};
		public void display(String str) {System.out.println(str + "\tperson"+name);}	
	}
	
	

}
