package com.cesgroup.zw.t04.trans.trans02;

import com.cesgroup.zw.t04.trans.trans02.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * created by dbx on 2019/4/28
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TranscationalConfig.class);

        print(context.getBeanDefinitionNames());

        System.out.println("-----------------------");

        Service service = context.getBean(Service.class);

        service.write();

    }

    public static void print(String[] beanNames) {
        Arrays.asList(beanNames).forEach(System.out::println);
    }
}
