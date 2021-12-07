package me.delusidiot.gof.structural_patterns.bridge.after.champions;

import me.delusidiot.gof.structural_patterns.bridge.after.DefaultChampion;
import me.delusidiot.gof.structural_patterns.bridge.after.Skin;

public class Ahri extends DefaultChampion {

    public Ahri(Skin skin) {
        super(skin, "Ahri");
    }
}
