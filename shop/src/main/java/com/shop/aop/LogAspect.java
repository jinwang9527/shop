package com.shop.aop;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Slf4j
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution( * com.shop..*Controller.*(..))")
    public void aspect(){}

    @Around("aspect()")
    public Object run1(ProceedingJoinPoint joinPoint) throws Throwable {
        Object obj = null;
        try {
            StopWatch stopWatch = StopWatch.createStarted();
            Object target = joinPoint.getTarget().getClass().getName();
            log.info("调用方法 -->" + target);
            Object[] args = joinPoint.getArgs();
            obj = joinPoint.proceed(args);
            stopWatch.stop();
            log.info("调用方法耗时 -->" + stopWatch.getTime(TimeUnit.MILLISECONDS) + "ms");
        } catch (Exception e) {
            e.printStackTrace();

        }
        return obj;
    }

}
