package com.cesgroup.bdc.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMain {
	
	public static void main(String[] args) {
		
		createStream().forEach(System.out::println);	
		createStream01().forEach(System.out::println);
		createStream02().forEach(System.out::println);
		createStream03().forEach(System.out::println);
	}
	
	public static Stream<String> createStream(){
		return Arrays.asList("z","c","d","b","w").stream();
	}

	public static Stream<String> createStream01(){
		return Stream.of("z","c","d","b","w");
	}
	
	public static Stream<Integer> createStream02(){
		
		return Stream.iterate(0, a -> a + 2).limit(10);
	} 
	
	public static Stream<Double> createStream03(){
		return Stream.generate(Math::random).limit(10);
	}

}
