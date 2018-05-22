package com.darlan.exam.container_dependency_ioc.ambiguity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
@QualifierA
public class PojoA implements Pojo {

    @Override
    public String toString() {
        return "PojoA{}";
    }

}
