package me.delusidiot.gof.structural_patterns.composite.before;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    List<Item> items;

    public Bag() {
        items = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
