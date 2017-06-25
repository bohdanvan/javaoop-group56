package com.bvan.oop.lessons1_2;

/**
 * @author bvanchuhov
 */
public class OverloadingExample {

    public static void main(String[] args) {
        int[] array = {10, 20, 5};
        int sum = sum(array);
        System.out.println(sum);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
}
