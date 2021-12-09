package me.delusidiot.gof.structural_patterns.composite.before;

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

    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    private void printPrice(Bag bag) {
        System.out.println(bag.getItems().stream().mapToLong(Item::getPrice).sum());
    }
}
