package com.darlan.exam.container_dependency_ioc.conditionals;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(ConditionalB.class)
public class BeanB implements Bean {

    @Override
    public String toString() {
        return "BeanB{}";
    }
    
}
