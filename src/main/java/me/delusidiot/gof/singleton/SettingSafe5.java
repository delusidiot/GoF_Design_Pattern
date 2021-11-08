package me.delusidiot.gof.singleton;

import java.io.Serializable;

public class SettingSafe5 implements Serializable {
    private SettingSafe5(){}

    private static class SettingsHolder {
        private static final SettingSafe5 INSTANCE = new SettingSafe5();
    }
    public static SettingSafe5 getInstance(){
        return SettingsHolder.INSTANCE;
    }
}