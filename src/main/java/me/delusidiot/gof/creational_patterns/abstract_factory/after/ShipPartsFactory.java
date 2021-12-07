package me.delusidiot.gof.creational_patterns.abstract_factory.after;

public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();
}
