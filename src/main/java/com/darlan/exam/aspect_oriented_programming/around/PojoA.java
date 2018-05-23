package com.darlan.exam.aspect_oriented_programming.around;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PojoA implements Pojo {

    private static final Logger log = LoggerFactory.getLogger(PojoA.class);

    @Override
    public void toString(final String source) {
        log.info("PojoA{} ->" + source);
    }

}
