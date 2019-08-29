package com.cesgroup.zw.componentscan.myValidate;

import com.cesgroup.zw.componentscan.annotation01.ComponentScanMain;
import com.cesgroup.zw.componentscan.myValidate.dao.IValidate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 未来人类 on 2018/10/23.
 */
public class MyValidateMain {
    public static void main(String[] args) {

        MyValidateLoader myValidateLoader = MyValidateLoader.getInstance();
        IValidate mobileValidate = myValidateLoader.loadMobileValidate();
        String message = mobileValidate.getValidateMessage();
        boolean ifQualified = mobileValidate.verifyContent("1391780814");

        System.out.println(message);
        System.out.println(ifQualified);

        IValidate telephoneValidate = myValidateLoader.loadTelephoneValidate();
        String messageTel = telephoneValidate.getValidateMessage();
        boolean ifQualifiedTel = telephoneValidate.verifyContent("021-12121212");

        System.out.println(messageTel);
        System.out.println(ifQualifiedTel);

    }
}
