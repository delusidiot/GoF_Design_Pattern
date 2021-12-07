package me.delusidiot.gof.creational_patterns.factorymethod.etc;

import org.springframework.context.annotation.Bean;

public class Config {
    @Bean
    public String hello(){
        return "hi";
    }
}
