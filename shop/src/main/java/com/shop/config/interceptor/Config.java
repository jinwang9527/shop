package com.shop.config.interceptor;

import com.shop.config.interceptor.util.SecurityInterceptor;
import com.shop.config.interceptor.util.TokenInterceptor;
import com.shop.config.interceptor.util.WebInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Configuration
public class Config implements WebMvcConfigurer {

    List<String> excludePathPatterns = new ArrayList<>();

    List<String> addPathPatterns = new ArrayList<>();

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("===============   启动 WebMvcConfigurer 注册类  ===============");
        addPathPatterns.add("/**");
        excludePathPatterns.add("/client/login");

        InterceptorRegistration webInterceptor = registry.addInterceptor(new WebInterceptor());
        webInterceptor.addPathPatterns("/**");

        InterceptorRegistration tokenInterceptor = registry.addInterceptor(new TokenInterceptor());
        tokenInterceptor.addPathPatterns(addPathPatterns);
        tokenInterceptor.excludePathPatterns(excludePathPatterns);

        InterceptorRegistration securityInterceptor = registry.addInterceptor(new SecurityInterceptor());
        securityInterceptor.addPathPatterns("/**");
        securityInterceptor.excludePathPatterns("/client/login");


    }
}
