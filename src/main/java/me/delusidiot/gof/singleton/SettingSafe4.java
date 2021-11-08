package me.delusidiot.gof.singleton;

public class SettingSafe4 {
    private SettingSafe4(){}

    private static class SettingsHolder {
        private static final SettingSafe4 INSTANCE = new SettingSafe4();
    }
    public static SettingSafe4 getInstance(){
        return SettingsHolder.INSTANCE;
    }
}