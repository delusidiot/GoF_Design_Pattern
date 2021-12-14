package me.delusidiot.gof.creational_patterns.decorator.java;

import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {

    public static void main(String[] args) {
        // AdapterInJava class에서 보는 시각에 따라 Decorator 패턴이라고 할 수 있다.

        ArrayList list = new ArrayList<>();
        list.add(new Book());

        List books = Collections.checkedList(list, Book.class); //Book만 받을 수 있는 books 를 만들있다.

        list.add(new Item());
        books.add(new Item()); // error

        //Collections.synchronized....
        //Collections.unmodifiableList()
        //등...

        HttpServletRequestWrapper requestWrapper;
        HttpServletResponseWrapper responseWrapper;
    }

    private static class Book{

    }

    private static class Item{

    }
}
