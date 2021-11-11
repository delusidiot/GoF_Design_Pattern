package me.delusidiot.gof.builder.etc;

import java.util.stream.Stream;

public class StreamBuilderExample {
    public static void main(String[] args) {
        Stream.Builder<String> stringBuilder = Stream.builder();
        Stream<String> result = stringBuilder.add("java").add("GoF").build();
        result.forEach(System.out::println);
    }
}
