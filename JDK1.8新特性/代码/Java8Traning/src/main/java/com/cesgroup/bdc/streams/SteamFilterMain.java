package com.cesgroup.bdc.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamFilterMain {
	
	public static void main(String[] args) {
		
		List<Integer> datas =  Arrays.asList(1,8,3,5,3,9,10);
		// 过滤
		datas.stream().filter(n -> n > 6).forEach(System.out::print);
		
		System.out.println();
		// 去重
		datas.stream().distinct().forEach(System.out::print);
	
		System.out.println();
		// 从第几个开始 limit 和mysql 相同
		datas.stream().skip(4).limit(1).forEach(System.out::print);
		
		
	}

}
