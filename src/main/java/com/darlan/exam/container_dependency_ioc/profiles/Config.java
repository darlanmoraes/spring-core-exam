package com.darlan.exam.container_dependency_ioc.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {

    @Bean
    @Profile("component-a")
    public Component componentA() {
        return new ComponentA();
    }

    @Bean
    @Profile("component-b")
    public Component componentB() {
        return new ComponentB();
    }

    @Bean
    @Profile("component-c")
    public Component componentC() {
        return new ComponentC();
    }

}
