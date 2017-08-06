package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class MultithreadingBar {

    public static void main(String[] args) {
        new Thread(new Drinker()).start();
        new Thread(new Drinker()).start();
        new Thread(new Drinker()).start();

        ThreadUtils.println("Bar is closed");
    }
}
