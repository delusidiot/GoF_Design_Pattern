package me.delusidiot.gof.factorymethod.before;

public class Client {
    public static void main(String[] args) {
        Ship whiteShip = ShipFactory.orderShip("Whiteship", "jjeon@gmail.com");
        System.out.println("whiteShip = " + whiteShip);
        Ship blackShip = ShipFactory.orderShip("Blackship", "jjeon@gmail.com");
        System.out.println("blackShip = " + blackShip);
    }
}
