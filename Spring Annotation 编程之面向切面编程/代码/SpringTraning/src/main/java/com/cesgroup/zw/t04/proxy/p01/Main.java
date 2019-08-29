package com.cesgroup.zw.t04.proxy.p01;

public class Main {

	public static void main(String[] args) {
		
		BuyTicket buyTicket = new Buy360Ticket(new Buy12306Ticket());

		System.out.println(buyTicket.payment(2));
		
	}

}
