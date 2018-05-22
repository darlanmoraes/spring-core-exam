package com.darlan.exam.container_dependency_ioc.ambiguity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class Config {

    @Bean
    @Primary
    @QualifierB
    public PojoB pojoB() {
        return new PojoB();
    }


}
