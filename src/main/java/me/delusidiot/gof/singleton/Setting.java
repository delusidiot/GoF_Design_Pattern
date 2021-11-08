package me.delusidiot.gof.singleton;

public class Setting {
    private static Setting instance;
    private Setting(){}
    public static Setting getInstance() {

        return instance;
    }
}
