package com.cesgroup.bdc.lambda;

public class RunnableMain {

	public static void main(String[] args) throws InterruptedException {
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		}).start();
		
		new Thread(()->System.out.println(Thread.currentThread().getName())).start();

		
	}

}
