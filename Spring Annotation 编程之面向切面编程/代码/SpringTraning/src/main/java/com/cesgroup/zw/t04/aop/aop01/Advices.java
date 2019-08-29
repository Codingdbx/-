package com.cesgroup.zw.t04.aop.aop01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class Advices {

	//@Pointcut("execution(public * com.cesgroup.zw..aop01.*.*(..))") 
	@Pointcut("execution(public * com.cesgroup.zw..aop01.biz.*.*(..))") 
	public void point() {};

	//前置通知
	@Before("point()")
	public void before(JoinPoint joinPoint) {
		System.out.println("----------前置通知--------------");
	}
	
	//后置通知
	@After("point()")
    public void after(JoinPoint jp){
        System.out.println("--------------------后置通知--------------------");
    }

    //返回值通知
	@AfterReturning(returning="result",value="point()")
	public void afterReturning(JoinPoint joinPoint,Object result ) {
		 System.out.println("--------------------返回值通知--------------------");
	}

	//抛出异常通知
	@AfterThrowing(value="point()",throwing="ex")
	public void afterThrowing(JoinPoint joinPoint, Exception ex) {
		 System.out.println("--------------------抛出异常通知--------------------");
	}

	//环绕通知
	@Around("point()")
	public void aroundMethod(ProceedingJoinPoint pjd) throws Throwable {
		System.out.println("--------------------环绕通知开始--------------------");
		pjd.proceed();
		 System.out.println("--------------------环绕通知结束--------------------");
	}



}

