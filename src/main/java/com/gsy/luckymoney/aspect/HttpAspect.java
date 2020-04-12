package com.gsy.luckymoney.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    // 优化代码，使用Pointcut定义log方法，避免多次写execution
    @Pointcut("execution(public * com.gsy.luckymoney.controller.GirlController.*(..))")
    public void log() {

    }

    // Before方法执行之前就执行该方法了
//    @Before("execution(public * com.gsy.luckymoney.controller.GirlController.*(..))")
    @Before("log()")
    public void doBefore() {
        logger.info("ffffffffffff");
    }

    // Before方法执行之前就执行该方法了
//    @After("execution(public * com.gsy.luckymoney.controller.GirlController.*(..))")
    @After("log()")
    public void doAfter() {
        logger.info("hhhhhhhhhhhhhh");
    }
}
