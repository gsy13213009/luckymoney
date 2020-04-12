package com.gsy.luckymoney.aspect;


import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

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
    public void doBefore(JoinPoint joinPoint) {

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        // url
        logger.info("url={}", request.getRequestURL());
        // method
        logger.info("method={}", request.getMethod());
        // ip
        logger.info("ip={}", request.getRemoteAddr());
        // 类方法
        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        // 参数
        logger.info("args={}", joinPoint.getArgs());

    }

    // Before方法执行之前就执行该方法了
//    @After("execution(public * com.gsy.luckymoney.controller.GirlController.*(..))")
    @After("log()")
    public void doAfter() {
        logger.info("hhhhhhhhhhhhhh");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
        // 打印出返回信息
        logger.info(object.toString());
    }
}
