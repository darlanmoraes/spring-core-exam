package com.darlan.exam.aspect_oriented_programming.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectA {

    private static final Logger log = LoggerFactory.getLogger(AspectA.class);

    @Pointcut("execution(* com.darlan.exam.aspect_oriented_programming.aspects.PojoA.toString())")
    public void pointcut(){ }

    @Before("pointcut()")
    public void beforeMethod() {
        log.info("Before toString()");
    }

    @After("pointcut()")
    public void afterMethod() {
        log.info("After toString()");
    }

}
