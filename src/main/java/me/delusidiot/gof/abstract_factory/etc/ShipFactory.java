package me.delusidiot.gof.abstract_factory.etc;

import me.delusidiot.gof.abstract_factory.after.Ship;
import me.delusidiot.gof.abstract_factory.after.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("ShipFactoryWhiteShip");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
