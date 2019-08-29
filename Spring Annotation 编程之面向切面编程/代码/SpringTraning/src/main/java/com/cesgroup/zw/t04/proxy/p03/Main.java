package com.cesgroup.zw.t04.proxy.p03;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map map =	(Map) new CglibBuyProxyTicket().proxy(new HashMap());
		
		map.put("sss", "测试");
		System.out.println(map);
	}

}
