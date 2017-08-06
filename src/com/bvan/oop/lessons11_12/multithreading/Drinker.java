package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class Drinker implements Runnable {

    private static int nextId = 0;
    private final int id = nextId++;

    @Override
    public void run() {
        ThreadUtils.println(myInfo() + "Hello");
        for (int beer = 0; beer < 3; beer++) {
            ThreadUtils.println(myInfo() +
                    "I'm drinking " + beer + " beer");
        }
        ThreadUtils.println(myInfo() + "I'm done");
    }

    private String myInfo() {
        return "I'm " + id + " drinker. ";
    }
}
