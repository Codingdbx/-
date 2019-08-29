package com.cesgroup.zw.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * created by dbx on 2019/4/28
 */
@Aspect
public class LogAspect {

    @Pointcut(value = "execution(* com.cesgroup.zw.log.biz.Log.write())")
    public void pointcut() { }

    @Before(value = "pointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知");
    }

    @After(value = "pointcut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("后置通知");
    }

    //返回值通知
    @AfterReturning(returning="result",value="pointcut()")
    public void afterReturning(JoinPoint joinPoint,Object result ) {
        System.out.println("--------------------返回值通知--------------------");
    }

    //抛出异常通知
    @AfterThrowing(value="pointcut()",throwing="ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        System.out.println("--------------------抛出异常通知--------------------");
    }

    @Around(value = "pointcut()")
    public void around(ProceedingJoinPoint pjd) throws Throwable {
        System.out.println("环绕前。。");

        pjd.proceed();

        System.out.println("环绕后。。");
    }
}
