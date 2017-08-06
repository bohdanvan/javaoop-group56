package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithJoin {

    public static void main(String[] args) {
        Thread drinkerThread = new Thread(new Drinker());
        drinkerThread.start();

        try {
            drinkerThread.join(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadUtils.println("Bar is closed");
    }
}
