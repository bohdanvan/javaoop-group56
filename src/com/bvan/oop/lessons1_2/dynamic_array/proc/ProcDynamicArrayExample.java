package com.bvan.oop.lessons1_2.dynamic_array.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ProcDynamicArrayExample {

    public static void main(String[] args) {
        int[] elems = readClientElems();
        System.out.println(Arrays.toString(elems));
        System.out.println("Goodbye");
    }

    private static int[] readClientElems() {
        Scanner scanner = new Scanner(System.in);

        int[] elems = new int[3];
        int size = 0;

        int n = readElem(scanner);
        while (n != 0) {
            // BL
            if (size == elems.length) {
                elems = Arrays.copyOf(elems, elems.length*2);
            }
            elems[size] = n;
            size++;

            n = readElem(scanner);
        }
        return Arrays.copyOf(elems, size);
    }

    private static int readElem(Scanner scanner) {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // idle

            System.out.println("Illegal elem");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }

    private static int[] addLastElem(int[] elems, int n) {
        int[] newElems = Arrays.copyOf(elems, elems.length+1);
        newElems[newElems.length - 1] = n;
        return newElems;
    }
}
