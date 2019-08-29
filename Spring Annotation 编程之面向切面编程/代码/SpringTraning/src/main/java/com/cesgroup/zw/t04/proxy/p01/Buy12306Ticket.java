package com.cesgroup.zw.t04.proxy.p01;

public class Buy12306Ticket implements BuyTicket{

	@Override
	public Integer payment(Integer num) {
		
		return num * 100;
	}

}
