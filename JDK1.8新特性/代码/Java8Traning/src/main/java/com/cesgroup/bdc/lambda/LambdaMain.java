package com.cesgroup.bdc.lambda;

public class LambdaMain {
	
	public static void main(String[] args) {
		//（int x,int y）-> x + y;      //int add(int x,int y);
		Test1 test1 = (x,y) -> x + y; 
		System.out.println(test1.add(1, 2));
		// (String str) -> null == str;  // boolean isNull(String str);
		Test2 test2 = (String str) -> null == str; 
		System.out.println(test2.isNull(null));
		//  () -> 100;    // int getInt();
		Test3 test3 = () -> 45;
		System.out.println(test3.getInt());
		//(int x,int y) -> {return x + y };  //int add(int x,int y);
		Test4<Integer,Integer,Integer> test4 =  (x,y) -> {return x + y;}; 
		System.out.println(test4.add(4, 2));
		
	}
	interface Test1{ int add(int x,int y);}
	interface Test2{ boolean isNull(String str);}
	interface Test3{  int getInt();}
	interface Test4<X,Y,Z>{ Z add(X x,Y y);}
}
