package com.bvan.oop.lessons1_2;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Bob");

        System.out.println(names.toString());
    }
}
