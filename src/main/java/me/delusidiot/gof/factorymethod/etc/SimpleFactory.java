package me.delusidiot.gof.factorymethod.etc;

import me.delusidiot.gof.factorymethod.after.BlackShip;
import me.delusidiot.gof.factorymethod.after.WhiteShip;

public class SimpleFactory {
    public Object createProduct(String name){
        if (name.equals("white")){
            return new WhiteShip();
        } else if (name.equals("black")) {
            return new BlackShip();
        }
        throw new IllegalArgumentException();
    }
}
