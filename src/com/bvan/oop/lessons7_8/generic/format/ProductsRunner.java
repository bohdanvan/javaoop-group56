package com.bvan.oop.lessons7_8.generic.format;

/**
 * @author bvanchuhov
 */
public class ProductsRunner {

    public static void main(String[] args) {
        Printer<Product> printer = new Printer<>();
        printer.add(new Product("Mac", 2000));
        printer.add(new Product("Lenovo", 1500));

        printer.print(new ToStringFormatter<>());
        System.out.println();

        printer.print(new CsvFormatter<>(","));
        System.out.println();
    }
}
