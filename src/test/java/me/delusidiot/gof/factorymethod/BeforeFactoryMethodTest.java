package me.delusidiot.gof.factorymethod;

import me.delusidiot.gof.creational_patterns.factorymethod.before.Ship;
import me.delusidiot.gof.creational_patterns.factorymethod.before.ShipFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BeforeFactoryMethodTest {
    @Test
    void beforeTest() {
        Ship whiteShip = ShipFactory.orderShip("Whiteship", "jjeon@gmail.com");
        Ship blackShip = ShipFactory.orderShip("Blackship", "jjeon@gmail.com");
        assertThat(whiteShip.getLogo()).isEqualTo("\uD83D\uDEE5");
        assertThat(whiteShip.getColor()).isEqualTo("white");
        assertThat(blackShip.getLogo()).isEqualTo("💻");
        assertThat(blackShip.getColor()).isEqualTo("black");
    }

}
