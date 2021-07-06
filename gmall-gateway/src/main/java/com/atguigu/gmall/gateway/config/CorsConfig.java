package com.atguigu.gmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration    //用configuration标记是一个配置类
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter(){

        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //添加允许跨域的请求域名。*代表所有域名，但是不能携带cookie；
        corsConfiguration.addAllowedOrigin("http://manager.gmall.com");
        corsConfiguration.addAllowedOrigin("http://localhost:1000");
        //添加允许跨域的方法.*代表所有方法
        corsConfiguration.addAllowedMethod("*");
        //允许携带任何头信息
        corsConfiguration.addAllowedHeader("*");
        //设置允许携带cookie
        corsConfiguration.setAllowCredentials(true);

        //跨域配置对象
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        //拦截所有域名
        configurationSource.registerCorsConfiguration("/**",corsConfiguration);

        //括号里面需要一个参数，而CorsConfigurationSource是一个接口，需要new一个接口的实现类；
        return  new CorsWebFilter(configurationSource);
    }


}
