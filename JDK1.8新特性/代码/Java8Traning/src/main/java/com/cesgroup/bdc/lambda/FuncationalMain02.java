package com.cesgroup.bdc.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FuncationalMain02 {

	
	public static void main(String[] args) {
		
		List<String> dataList = new ArrayList<>(Arrays.asList("1",null,"3",null,""));
		Predicate<String> predicate = (s) -> null == s || "".equals(s);
		for(int i = 0;i < dataList.size();i++) {
			String str = dataList.get(i);
			if(predicate.test(str)) {
				dataList.remove(str);
			}
		}
		System.out.println("-----------------------------");
		Consumer<String> consumer = (s) -> System.out.println(s);
		dataList.forEach(consumer);
		System.out.println("-----------------------------");
		List<Integer>  dataList1 = new ArrayList<>(Arrays.asList(1,200,3,499));
		dataList1.sort((a,b)->a.compareTo(b));
		dataList1.forEach(System.out::println);
		System.out.println("-----------------------------");
		dataList1.stream().filter(a -> a > 100).
			map((a) -> a + 100).
				forEach(System.out::println); 
		
	}
	
}
