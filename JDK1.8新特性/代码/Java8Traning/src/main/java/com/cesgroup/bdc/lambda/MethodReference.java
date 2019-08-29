package com.cesgroup.bdc.lambda;

import java.util.function.Consumer;

public class MethodReference {
	
	public static void main(String[] args) {
		
		Consumer<String> consumer = (s) -> System.out.println(s); 
		accept(consumer,"helloworld");
		
		accept((s) -> System.out.println(s),"helloworld");
		// public void println(String x) 和consumer的方法相同
		accept(System.out::println,"helloworld");
		
		accept(MethodReference::println,"helloworld");
		
	}
	
	public static <T> void accept(Consumer<T> consumer,T t) {
		consumer.accept(t);
	}
	
	public static void println(String x) {
		System.out.println(x);
	}

}
