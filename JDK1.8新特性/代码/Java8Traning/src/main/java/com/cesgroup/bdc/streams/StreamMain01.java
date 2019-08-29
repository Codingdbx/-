package com.cesgroup.bdc.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain01 {

	
	public static void main(String[] args) {
	
		List<Person>  persons = Arrays.asList(new Person("1","zhangs",12),new Person("2","li",12),new Person("3","wx",3));
		
		// 分组
		Map<Integer, List<Person>>
			map = persons.stream().collect(Collectors.groupingBy(Person::getAge));
		
		System.out.println(map);
		
	}
	
	static class Person{
		private String no;
		private String name;
		private Integer age;
		public Person(String no,String name,Integer age) {this.no= no;this.name = name;this.age=age;}
		
		public String getName() {
			return name;
		}
		public String getNo() {
			return no;
		}
		public Integer getAge() {return age;}
		
		
		@Override
		public String toString() {
			return "Person [no=" + no + ", name=" + name + ", age=" + age + "]";
		}



	}
	
}

