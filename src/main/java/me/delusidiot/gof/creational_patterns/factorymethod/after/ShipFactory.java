package me.delusidiot.gof.creational_patterns.factorymethod.after;

public interface ShipFactory {

    default Ship orderShip(String name, String email){
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }

    private void sendEmailTo(String email, Ship ship){
        System.out.println(ship.getName() + " maked");
    }

    Ship createShip();

    private void prepareFor(String name){
        System.out.println("Getting ready... = " + name);
    }

    private void validate(String name, String email) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("make ship name");
        if (email == null || email.isBlank())
            throw new IllegalArgumentException("Please leave your contact information");

    }
}
