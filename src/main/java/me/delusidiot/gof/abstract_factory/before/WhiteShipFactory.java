package me.delusidiot.gof.abstract_factory.before;


public class WhiteShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setWhiteAnchor(new WhiteAnchor());
        ship.setWhiteWheel(new WhiteWheel());
        return ship;
    }
}
