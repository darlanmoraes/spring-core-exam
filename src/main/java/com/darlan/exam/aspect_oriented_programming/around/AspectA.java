package com.darlan.exam.aspect_oriented_programming.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
public class AspectA {

    private static final Logger log = LoggerFactory.getLogger(AspectA.class);
    private final Map<String, Integer> count = new HashMap<>();

    @Pointcut("execution(* com.darlan.exam.aspect_oriented_programming.around.PojoA.toString(..)) && args(source)")
    public void pointcut(final String source){ }

    @Around("pointcut(source)")
    public void onAround(final ProceedingJoinPoint jp, final String source) {
        try {
            jp.proceed(jp.getArgs());
        } catch (Throwable e) {
            log.error("Can't call method", e);
        } finally {
            count.putIfAbsent(source, 0);
            count.put(source, count.get(source) + 1);
        }
    }

    public Integer getCount(final String source) {
        return this.count.get(source);
    }

}
