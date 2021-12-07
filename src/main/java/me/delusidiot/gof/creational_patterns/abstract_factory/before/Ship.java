package me.delusidiot.gof.creational_patterns.abstract_factory.before;

public class Ship {
    private String name;
    private String color;
    private String logo;
    private WhiteAnchor whiteAnchor;
    private WhiteWheel whiteWheel;

    public WhiteAnchor getWhiteAnchor() {
        return whiteAnchor;
    }

    public void setWhiteAnchor(WhiteAnchor whiteAnchor) {
        this.whiteAnchor = whiteAnchor;
    }

    public WhiteWheel getWhiteWheel() {
        return whiteWheel;
    }

    public void setWhiteWheel(WhiteWheel whiteWheel) {
        this.whiteWheel = whiteWheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
