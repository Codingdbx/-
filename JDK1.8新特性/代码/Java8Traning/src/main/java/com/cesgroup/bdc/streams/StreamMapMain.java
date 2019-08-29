package com.cesgroup.bdc.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class StreamMapMain {
	
	public static void main(String[] args) {
		
		List<Integer> datas =  Arrays.asList(1,8,3,5,3,9,10);
		
		datas.stream().map(n -> n + 2).forEach(System.out::print);
		
		System.out.println();
		
		List<Person>  persons = Arrays.asList(new Person("zhangs",12),new Person("li",59),new Person("wx",3));
		
		persons.stream().map(per -> per.getName()).forEach(System.out::println);
		
		List<String> arrs =  Arrays.asList("hello","world");
		
		Stream<String[]> streams = arrs.stream().map(str -> str.split(""));
		
		streams.flatMap(Arrays::stream).distinct().forEach(System.out::print);

	}

	
	static class Person{
		private String name;
		private Integer age;
		public Person(String name,Integer age) {this.name = name;this.age=age;}
		
		public String getName() {
			return name;
		}
		public Integer getAge() {return age;}
		
		public Integer getAge1(String str) {return age;}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}

	}

}
