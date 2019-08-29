package com.cesgroup.bdc.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class MethodReference02 {
	
	public static void main(String[] args) {
		
		List<Integer>  dataList1 = new ArrayList<>(Arrays.asList(1,200,3,499));
		
		dataList1.sort(Comparator.comparingInt(Integer::valueOf));
		
		System.out.println(dataList1);
		
		List<Person>  persons = Arrays.asList(new Person("zhangs",12),new Person("li",59),new Person("wx",3));
		
		persons.sort(Comparator.comparing(Person::getAge));
		
		System.out.println(persons);
		
		persons.sort((a,b)-> a.age.compareTo(b.age) * -1);

		System.out.println(persons);
		
		// 类方法引用
		Person per = new Person("zhangs",12);	
		BiFunction<Person,String,Integer > supplier = Person::getAge1;
		System.out.println(supplier.apply(per,""));
		
		
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
