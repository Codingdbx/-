package com.cesgroup.zw.t04.proxy.p03;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibBuyProxyTicket implements MethodInterceptor{

	private Object target ;
	
	public Object proxy(Object object) {
		this.target  = object;
		Enhancer enhancer=new Enhancer();
		 enhancer.setCallback(this);
		 enhancer.setSuperclass(object.getClass());
		 return enhancer.create();
	}
	
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("===========intercept===============");
		return arg3.invoke(target, arg2);
	}

}
