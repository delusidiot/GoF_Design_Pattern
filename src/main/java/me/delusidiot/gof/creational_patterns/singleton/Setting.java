package me.delusidiot.gof.creational_patterns.singleton;

public class Setting {
    private static Setting instance;
    private Setting(){}
    public static Setting getInstance() {

        return instance;
    }
}
