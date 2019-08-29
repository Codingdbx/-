package com.cesgroup.bdc.lambda;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncationalMain01 {
	
	public static void main(String[] args) {
		
		// R apply(T t);接受一个输入参数，返回一个结果。
		Function<String,String> function =  (s) -> s.toLowerCase();
		System.out.println(function.apply("AAAA"));
		
		// boolean test(T t); 接受一个输入参数，返回一个布尔值结果。
		Predicate<String> predicate = (s) ->  null == s || "".equals(s);
		System.out.println(predicate.test(""));
		
		//void accept(T t); 代表了接受一个输入参数并且无返回的操作
		Consumer<String> consumer = (s) -> System.out.println(s);
		consumer.accept("consumer");
		
		//无参数，返回一个结果。
		Supplier<Integer> supplier = () -> new Random().nextInt(10);
		System.out.println(supplier.get());
		
	}
}
