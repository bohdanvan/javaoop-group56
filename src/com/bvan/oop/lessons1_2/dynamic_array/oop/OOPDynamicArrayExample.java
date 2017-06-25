package com.bvan.oop.lessons1_2.dynamic_array.oop;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class OOPDynamicArrayExample {

    public static void main(String[] args) {
        DynamicArray elems = readClientElems();
        System.out.println(elems.toString());
        System.out.println("Goodbye");
    }

    private static DynamicArray readClientElems() {
        Scanner scanner = new Scanner(System.in);

        DynamicArray elems = new DynamicArray(30, 1.5);

        int n = readElem(scanner);
        while (n != 0) {
            elems.addLast(n);

            n = readElem(scanner);
        }
        return elems;
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
}
