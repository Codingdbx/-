package com.cesgroup.zw.componentscan.myValidate;

import com.cesgroup.zw.componentscan.annotation01.ComponentScanMain;
import com.cesgroup.zw.componentscan.myValidate.dao.IValidate;
import com.cesgroup.zw.componentscan.myValidate.impl.MyMobileValidate;
import com.cesgroup.zw.componentscan.myValidate.impl.MyTelephoneValidate;
import com.cesgroup.zw.componentscan.myValidate.myTypeFilter.MyTypeFilter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * Created by 未来人类 on 2018/10/23.
 * 只有实现了IValidate接口的实现类才可以通过MyTypeValidate过滤器的检验
 */
@ComponentScan(value="com.cesgroup.zw.componentscan.myValidate",
        useDefaultFilters=false,includeFilters= {
        @ComponentScan.Filter(type= FilterType.CUSTOM,value=MyTypeFilter.class)
})
public class MyValidateLoader {
    //这行是应用启动时只初始化一次
    private static MyValidateLoader myValidateLoader = new MyValidateLoader();
    //私有化初始方法
    private MyValidateLoader(){

    }
    //获取单例
    public static MyValidateLoader getInstance(){
        return myValidateLoader;
    }

    //私有化，以防可被外部代码直接使用
    private static ApplicationContext context = new AnnotationConfigApplicationContext(MyValidateLoader.class);
    //返回手机的验证器
    public IValidate loadMobileValidate(){
        return context.getBean(MyMobileValidate.class);
    }
    //返回座机的验证器
    public IValidate loadTelephoneValidate(){
        return context.getBean(MyTelephoneValidate.class);
    }
}
