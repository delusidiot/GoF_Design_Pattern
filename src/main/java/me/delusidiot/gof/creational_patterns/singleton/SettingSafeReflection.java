package me.delusidiot.gof.creational_patterns.singleton;

public enum SettingSafeReflection {
    INSTANCE;

    SettingSafeReflection(){

    }

    private Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
