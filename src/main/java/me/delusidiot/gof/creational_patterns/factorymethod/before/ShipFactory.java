package me.delusidiot.gof.creational_patterns.factorymethod.before;

public class ShipFactory {
    public static Ship orderShip(String name, String email){
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("make ship name");
        if (email == null || email.isBlank())
            throw new IllegalArgumentException("Please leave your contact information");

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("\uD83D\uDEE5");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("💻");
        }

        if (name.equalsIgnoreCase("whiteship")) {
            ship.setColor("white");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setColor("black");
        }

        sendEmailTo(email, ship);

        return ship;
    }

    private static void prepareFor(String name){
        System.out.println("prepare....." + name);
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " maked");
    }
}
