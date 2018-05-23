package com.darlan.exam.aspect_oriented_programming.aspects;

import org.springframework.stereotype.Component;

@Component
public class PojoA implements Pojo {

    @Override
    public String toString() {
        return "PojoA{}";
    }

}
