package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class SingleThreadBar {

    public static void main(String[] args) {
        new Drinker().run();
        new Drinker().run();
        new Drinker().run();

        System.out.println("Bar is closed");
    }
}
