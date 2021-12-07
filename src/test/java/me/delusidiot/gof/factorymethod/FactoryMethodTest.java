package me.delusidiot.gof.factorymethod;

import me.delusidiot.gof.creational_patterns.factorymethod.after.BlackShipFactory;
import me.delusidiot.gof.creational_patterns.factorymethod.after.Client;
import me.delusidiot.gof.creational_patterns.factorymethod.after.Ship;
import me.delusidiot.gof.creational_patterns.factorymethod.after.WhiteShipFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactoryMethodTest {
    @Test
    void afterTest() {
        Ship whiteShip = Client.getInstance(new WhiteShipFactory(), "whiteship", "jjeon@gmail.com");
        Ship blackShip = Client.getInstance(new BlackShipFactory(), "whiteship", "jjeon@gmail.com");
        assertThat(whiteShip.getLogo()).isEqualTo("\uD83D\uDEE5");
        assertThat(whiteShip.getColor()).isEqualTo("white");
        assertThat(blackShip.getLogo()).isEqualTo("💻");
        assertThat(blackShip.getColor()).isEqualTo("black");
    }
}