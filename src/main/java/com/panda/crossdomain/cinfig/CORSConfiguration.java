package com.panda.crossdomain.cinfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @program: cross-domain
 * @description:
 * @author: jiangzq
 * @create: 2019-10-31 10:06
 **/
@Configuration
public class CORSConfiguration {
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter(){
            public void addCorsMapping(CorsRegistry registry) {
                registry.addMapping("api/**").allowedOrigins("http://127.0.0.1:8080");
            }
        };
    }
}
