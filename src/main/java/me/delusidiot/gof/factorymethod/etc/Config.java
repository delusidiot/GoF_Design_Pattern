package me.delusidiot.gof.factorymethod.etc;

import org.springframework.context.annotation.Bean;

public class Config {
    @Bean
    public String hello(){
        return "hi";
    }
}
