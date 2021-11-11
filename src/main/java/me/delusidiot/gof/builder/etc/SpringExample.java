package me.delusidiot.gof.builder.etc;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {
    public static void main(String[] args) {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("www.google.com")
                .path("search?q=gof+design+pattern")
                .build();
        System.out.println("uriComponents = " + uriComponents);
    }
}
