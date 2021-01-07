package com.shop.config.interceptor;

import com.shop.config.interceptor.util.SecurityInterceptor;
import com.shop.config.interceptor.util.TokenInterceptor;
import com.shop.config.interceptor.util.WebInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
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

    /**
     * 延迟加载权限验证拦截
     * @return
     */
    @Bean
    public HandlerInterceptor getSecurityInterceptor(){
        return new SecurityInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("===============   启动 WebMvcConfigurer 注册类  ===============");
        addPathPatterns.add("/**");
        excludePathPatterns.add("/client/login");
        excludePathPatterns.add("/client/register");
        excludePathPatterns.add("/client/obtainShortMessageVerification");

        InterceptorRegistration webInterceptor = registry.addInterceptor(new WebInterceptor());
        webInterceptor.addPathPatterns("/**");

        InterceptorRegistration tokenInterceptor = registry.addInterceptor(new TokenInterceptor());
        tokenInterceptor.addPathPatterns(addPathPatterns);
        tokenInterceptor.excludePathPatterns(excludePathPatterns);

        InterceptorRegistration securityInterceptor = registry.addInterceptor(getSecurityInterceptor());
        securityInterceptor.addPathPatterns("/**");
        securityInterceptor.excludePathPatterns("/client/login");
        securityInterceptor.excludePathPatterns("/client/register");
        securityInterceptor.excludePathPatterns("/client/obtainShortMessageVerification");
    }
}
