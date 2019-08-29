package com.cesgroup.zw.componentscan.validator;

import com.cesgroup.zw.componentscan.annotation02.dao.StaffDao;
import com.cesgroup.zw.componentscan.validator.TypeFilter.MyTypeFilter;
import com.cesgroup.zw.componentscan.validator.intf.IValidate;
import com.cesgroup.zw.componentscan.validator.vali.isChinese;
import com.cesgroup.zw.componentscan.validator.vali.isLetterDigit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.util.Arrays;

/**
 * @Description:
 * @Author: YJK
 * @CreateDate: 2018/10/25$ 14:26$
 * @UpdateUser: yc
 * @UpdateDate: 2018/10/25$ 14:26$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@ComponentScan(value="com.cesgroup.zw.componentscan.validate",
        useDefaultFilters=false,includeFilters= {
        @ComponentScan.Filter(type= FilterType.CUSTOM,value=MyTypeFilter.class)
        //@Filter(type=FilterType.ANNOTATION,value=Mapper.class) //可以通过注解类
})
public class validateMain {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(validateMain.class);
        IValidate chinese = context.getBean(isChinese.class);
        IValidate letterDigit =  context.getBean(isLetterDigit.class);

        String chineseMessage = chinese.resultMessage();
        boolean chineseResult = chinese.resultContent("上海局");

        String letterDigitMessage = letterDigit.resultMessage();
        boolean letterDigitResult = letterDigit.resultContent("2131231231");

        System.out.println("chineseMessage:"+chineseMessage);
        System.out.println("chineseResult:"+chineseResult);
        System.out.println("letterDigitMessage:"+letterDigitMessage);
        System.out.println("letterDigitResult:"+letterDigitResult);
    }

}
