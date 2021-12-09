package me.delusidiot.gof.structural_patterns.composite.after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {
    List<Component> items;

    public Bag() {
        items = new ArrayList<>();
    }

    public void add(Component item) {
        items.add(item);
    }

    public List<Component> getItems() {
        return items;
    }

    @Override
    public Long getPrice() {
        return items.stream().mapToLong(Component::getPrice).sum();
    }
}
