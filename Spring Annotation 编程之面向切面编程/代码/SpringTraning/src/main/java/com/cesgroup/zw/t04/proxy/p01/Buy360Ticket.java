package com.cesgroup.zw.t04.proxy.p01;

public class Buy360Ticket implements BuyTicket{

	private BuyTicket buyTicket;
	
	public Buy360Ticket(BuyTicket buyTicket) {
		this.buyTicket = buyTicket;
	}
	@Override
	public Integer payment(Integer num) {
		
		return num * 5 + buyTicket.payment(num);
	}

}
