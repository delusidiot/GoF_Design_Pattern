package me.delusidiot.gof.creational_patterns.prototype.etc;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("delusidiot"));
        students.add(new Student("jjeon"));
        //TODO List not in clone
        // ArrayList in clone
        List<Student> clone = new ArrayList<>(students);
        System.out.println("clone = " + clone);
    }
}
