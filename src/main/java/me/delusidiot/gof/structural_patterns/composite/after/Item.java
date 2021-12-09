package me.delusidiot.gof.structural_patterns.composite.after;

public class Item implements Component{
    private String name;
    private Long price;

    public Item(String name, Long price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Long getPrice() {
        return price;
    }
}
