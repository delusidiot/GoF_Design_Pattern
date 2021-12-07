package me.delusidiot.gof.creational_patterns.singleton;

public class SettingSafe1 {
    private static SettingSafe1 instance;
    private SettingSafe1() {}
    public static synchronized SettingSafe1 getInstance(){
        if (instance == null)
            instance = new SettingSafe1();
        return instance;
    }
}
