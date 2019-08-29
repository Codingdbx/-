package com.cesgroup.zw.log;

import com.cesgroup.zw.log.biz.Log;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * created by dbx on 2019/4/28
 */

@Configuration
@EnableAspectJAutoProxy
public class LogConfig {

    @Bean
    public Log getLog(){
        return new Log();
    }

    @Bean
    public LogAspect getLogAspect(){
        return new LogAspect();
    }
}
