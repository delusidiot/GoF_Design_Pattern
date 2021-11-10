package me.delusidiot.gof.abstract_factory;

import me.delusidiot.gof.abstract_factory.after.Ship;
import me.delusidiot.gof.abstract_factory.etc.FactoryBeanConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AbstractFactoryInSpring {
    @Test
    void xmlConfig(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Ship whiteShip = applicationContext.getBean("whiteship", Ship.class);
        Assertions.assertThat(whiteShip.getName()).isEqualTo("ShipFactoryWhiteShip");
    }
    @Test
    void annotationConfig(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        Ship bean = applicationContext.getBean(Ship.class);
        Assertions.assertThat(bean.getName()).isEqualTo("ShipFactoryWhiteShip");
    }
}
