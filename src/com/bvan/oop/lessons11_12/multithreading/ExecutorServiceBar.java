package com.bvan.oop.lessons11_12.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author bvanchuhov
 */
public class ExecutorServiceBar {

    public static void main(String[] args) {
        ExecutorService executorService =
                Executors.newCachedThreadPool();

        for (int drinker = 0; drinker < 3; drinker++) {
            Runnable runnable = new Drinker();
            executorService.execute(runnable);
        }
        executorService.shutdown();

        ThreadUtils.println("Bar is closed");
    }
}
