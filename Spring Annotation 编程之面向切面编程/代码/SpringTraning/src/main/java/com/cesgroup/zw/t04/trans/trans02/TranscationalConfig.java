
package com.cesgroup.zw.t04.trans.trans02;

import com.alibaba.druid.pool.DruidDataSource;
import com.cesgroup.zw.t04.trans.trans02.service.Impl.LogServiceImpl;
import com.cesgroup.zw.t04.trans.trans02.service.Impl.ServiceImpl;
import com.cesgroup.zw.t04.trans.trans02.service.LogService;
import com.cesgroup.zw.t04.trans.trans02.service.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * created by dbx on 2019/4/28
 */
@Configuration
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class TranscationalConfig {

    @Bean
    public Service getService(){
        return new ServiceImpl();
    }

    @Bean
    public LogService getLogService(){
        return new LogServiceImpl();
    }

    @Bean
    public DataSource datasource() {

        DruidDataSource datasource = new DruidDataSource();
        datasource.setDriverClassName(driverClass);
        datasource.setUrl(jdbcUrl);
        datasource.setUsername(username);
        datasource.setPassword(password);
        return datasource;
    }

    @Bean
    public PlatformTransactionManager PlatformTransactionManager() {
        return new DataSourceTransactionManager(datasource());
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(datasource());
    }

    @Value("${spring.datasource.driver-class-name}")
    private String driverClass;

    @Value("${spring.datasource.url}")
    private String jdbcUrl;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;
}
