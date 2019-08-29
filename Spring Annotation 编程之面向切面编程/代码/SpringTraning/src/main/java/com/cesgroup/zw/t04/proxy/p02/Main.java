package com.cesgroup.zw.t04.proxy.p02;

import com.cesgroup.zw.t04.proxy.p01.Buy12306Ticket;
import com.cesgroup.zw.t04.proxy.p01.BuyTicket;

public class Main {

	public static void main(String[] args) {
		BuyTicket buyTicket =	(BuyTicket) new JdkBuyProxyTicket().getInstance(new Buy12306Ticket());
		System.out.println(buyTicket.payment(3));
	}

}
