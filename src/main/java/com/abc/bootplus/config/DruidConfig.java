package com.abc.bootplus.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

//标识是一个配置类，配置过滤器，servlet,取代
public class DruidConfig {
   @Bean
    public FilterRegistrationBean configFr(){
        FilterRegistrationBean filter = new FilterRegistrationBean();
        filter.setFilter(new WebStatFilter());
        filter.addUrlPatterns("/");
        return filter;
    }

    @Bean
    //实现可视化视图
    public ServletRegistrationBean servlet(){
        ServletRegistrationBean servlet = new ServletRegistrationBean();
        servlet.setServlet(new StatViewServlet());
        servlet.addUrlMappings("/druid/*");
       return servlet;
  }
}
