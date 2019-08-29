package com.dbx.myblog.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.*;


/**
 * 自定义注解：实现 二个注解的功能，@RequestMapping + @ResponseBody功能。
 *
 * Created by DBC-PC on 2018/9/18
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RequestMapping
@ResponseBody
public @interface RequestAndResponseAnnotation {

    @AliasFor(value = "path",annotation = RequestMapping.class) // 注解别名
            String[] request() default {};
}
