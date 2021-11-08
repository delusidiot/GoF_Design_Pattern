package me.delusidiot.gof.singleton;

public class SettingSafe3 {
    private static volatile SettingSafe3 instance;
    private SettingSafe3() {}
    public static SettingSafe3 getInstance(){
        if (instance == null) {
            synchronized (SettingSafe3.class){
                if (instance == null) {
                    instance = new SettingSafe3();
                }
            }
        }
        return instance;
    }
}
