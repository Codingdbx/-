package com.cesgroup.bdc.lambda;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FuncationalMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// 写法1
		Callable<Integer> callable = () -> 
			{System.out.println(Thread.currentThread().getName()); return 0;};
		FutureTask<Integer> ft = new FutureTask<>(callable);
		new Thread(ft).start();
		System.out.println("callable ->"+ft.get());
		
		// 写法2
		Callable<Integer> callable1 = new Callable<Integer>() {
			public Integer call() throws Exception {
				System.out.println(Thread.currentThread().getName());
				return 1;
			}
		};
		FutureTask<Integer> ft1 = new FutureTask<>(callable1);
		new Thread(ft1).start();
		System.out.println("callable1 ->"+ft1.get());
		
		// 写法3
		FutureTask<Integer> ft2 = new FutureTask<>(
				()-> {System.out.println(Thread.currentThread().getName());return 2;});
		new Thread(ft2).start();
		System.out.println("callable2 ->"+ft2.get());
		
		
		
		
		

	}

}
