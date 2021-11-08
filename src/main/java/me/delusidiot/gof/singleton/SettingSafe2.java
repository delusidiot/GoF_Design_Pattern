package me.delusidiot.gof.singleton;

public class SettingSafe2 {
    private final static SettingSafe2 INSTANCE = new SettingSafe2();
    private SettingSafe2() {}
    public static SettingSafe2 getInstance(){
        return INSTANCE;
    }
}
