package me.delusidiot.gof.factorymethod.after;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "jjeon@gmail.com");
        client.print(new BlackShipFactory(), "blackship", "jjeon@gmail.com");
    }

    private void print(ShipFactory ShipFactory, String name, String email) {
        System.out.println("ShipFactory = " + ShipFactory.orderShip(name, email));
    }

    public static Ship getInstance(ShipFactory shipFactory, String name, String email) {
        return shipFactory.orderShip(name, email);
    }
}
