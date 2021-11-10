package me.delusidiot.gof.abstract_factory.etc;

import org.springframework.context.annotation.Bean;

public class FactoryBeanConfig {
    @Bean
    public ShipFactory shipFactory(){
        return new ShipFactory();
    }
}
