package com.capgemini.boardgamecapmates.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Around("@annotation(com.capgemini.boardgamecapmates.aspect.TrackTime)")
    @Around("execution(* com.capgemini.boardgamecapmates.services.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();


        Object proceed = joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("It works!!!!! Time Taken by {} is {}", joinPoint, timeTaken);
        return proceed;
    }
}