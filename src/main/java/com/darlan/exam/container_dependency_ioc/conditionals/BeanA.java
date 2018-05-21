package com.darlan.exam.container_dependency_ioc.conditionals;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(ConditionalA.class)
public class BeanA implements Bean {

    @Override
    public String toString() {
        return "BeanA{}";
    }

}
