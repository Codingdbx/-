package com.cesgroup.zw.log;


import com.cesgroup.zw.log.biz.Log;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * created by dbx on 2019/4/28
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LogConfig.class);

        //System.out.println("-----------------------");

        Log log = context.getBean(Log.class);

        log.write();

    }
}
