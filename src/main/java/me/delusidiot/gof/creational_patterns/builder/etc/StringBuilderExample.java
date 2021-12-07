package me.delusidiot.gof.creational_patterns.builder.etc;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("java").append("GoF").toString();
        System.out.println("result = " + result);
    }
}
