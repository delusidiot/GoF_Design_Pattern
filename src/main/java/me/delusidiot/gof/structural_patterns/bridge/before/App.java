package me.delusidiot.gof.structural_patterns.bridge.before;

public class App {
    public static void main(String[] args) {
        Champion Ahri = new KDAAhri();
        Ahri.skillE();
        Ahri.skillQ();
    }
}
