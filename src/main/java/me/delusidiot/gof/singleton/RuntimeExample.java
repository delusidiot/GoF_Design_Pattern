package me.delusidiot.gof.singleton;

public class RuntimeExample {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("runtime = " + runtime.maxMemory());
        System.out.println("runtime = " + runtime.freeMemory());
    }
}
