package me.delusidiot.gof.structural_patterns.composite.after;

public class Client {
    public static void main(String[] args) {
        Item doranBlade = new Item("doranBlade", 450L);
        Item healPotion = new Item("healPotion", 50L);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }

}
