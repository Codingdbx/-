package com.cesgroup.bdc.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMatchMain {

	public static void main(String[] args) {
		
		List<Integer> datas =  Arrays.asList(1,8,3,5,3,9,10);
		// 是否全部大于零
		boolean allMatch = datas.stream().allMatch(n -> n > 0);
		
		System.out.println(allMatch);
		
		// 任意一个大于9
		boolean anyMatch = datas.stream().anyMatch(n -> n > 9);
		
		// 没有大于10
		boolean noneMatch = datas.stream().noneMatch(n -> n > 10);
		
		Optional<Integer> num = datas.stream().filter(n -> n > 7).findFirst();
		
		System.out.println(num.get());
		
		// 求和
		datas.stream().reduce((x,y)->x+y).ifPresent(System.out::println);
		
		// 最大值
		datas.stream().reduce(StreamMatchMain::max).ifPresent(System.out::println);
		
		
	}
	
	public static int max(int x ,int y) {
		return x > y ? x:y;
	}
	
}
