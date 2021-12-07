package me.delusidiot.gof.structural_patterns.bridge.after.champions;

import me.delusidiot.gof.structural_patterns.bridge.after.DefaultChampion;
import me.delusidiot.gof.structural_patterns.bridge.after.Skin;

public class Akali extends DefaultChampion {
    public Akali(Skin skin) {
        super(skin, "Akali");
    }
}
