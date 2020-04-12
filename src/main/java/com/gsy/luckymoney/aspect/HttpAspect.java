package com.gsy.luckymoney.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpAspect {

    // Before方法执行之前就执行该方法了
    @Before("execution(public * com.gsy.luckymoney.controller.GirlController.*(..))")
    public void doBefore() {
        System.out.println("hhhhhhhhhhhhh");
    }

    // Before方法执行之前就执行该方法了
    @After("execution(public * com.gsy.luckymoney.controller.GirlController.*(..))")
    public void doAfter() {
        System.out.println("hhhhhhhhhhhhh");
    }
}
