package me.delusidiot.gof.creational_patterns.factorymethod.after;

public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
