package com.cesgroup.zw.t04.proxy.p02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkBuyProxyTicket implements InvocationHandler{

	private Object target;
	
	public Object getInstance(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("=======输出日志=========");
		return method.invoke(target, args);
	}

}
