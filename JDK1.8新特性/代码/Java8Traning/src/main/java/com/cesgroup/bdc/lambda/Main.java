package com.cesgroup.bdc.lambda;

public class Main {

	public static void main(String[] args) {
		
		GreetingService service = new GreetingService() {
			public void sayMessage(String message) {
				System.out.println("sayMessage "+message);
			}
		};
		service.sayMessage(" 20190427");
		
		GreetingService service1 
			= (message) -> System.out.println("sayMessage "+message);
		service1.sayMessage(" 20190427");
	}
	
}
