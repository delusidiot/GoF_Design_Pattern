package me.delusidiot.gof.abstract_factory;

import me.delusidiot.gof.creational_patterns.abstract_factory.after.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {
    @Test
    void afterAbstractFactoryInPartsPro(){
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        Assertions.assertThat(ship.getAnchor()).isInstanceOf(WhiteAnchorPro.class);
        Assertions.assertThat(ship.getWheel()).isInstanceOf(WhiteWheelPro.class);
    }

    @Test
    void afterAbstractFactoryInParts(){
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        Assertions.assertThat(ship.getAnchor()).isInstanceOf(WhiteAnchor.class);
        Assertions.assertThat(ship.getWheel()).isInstanceOf(WhiteWheel.class);
    }
}
