package com.example.demo.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {

   /* @Bean
    @ConfigurationProperties(value = "spring.datasource")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }*/

    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet());
        bean.addUrlMappings("/druid/*");
        Map initParam = new HashMap();
        initParam.put("loginUsername","admin");
        initParam.put("loginPassword","123456");
        bean.setInitParameters(initParam);
        return bean;
    }

    @Bean
    public FilterRegistrationBean a(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new WebStatFilter());
        bean.setUrlPatterns(Arrays.asList("/*"));
        Map initParam = new HashMap();
        initParam.put("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        bean.setInitParameters(initParam);
        return bean;
    }




}
