package com.bvan.oop.lessons9_10.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class SetExample {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(10);

        System.out.println(set);

        System.out.println(set.contains(10));
        System.out.println(set.contains(15));
    }
}
