package com.bvan.oop.lessons5_6.format.proc;

import com.bvan.oop.lessons5_6.format.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ProcProducts {

    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void print(String format) {
        for (Product product : products) {
            String s = format(product, format);
            System.out.println(s);
        }
    }

    private String format(Product product, String format) {
        switch (format) {
            case "csv":
                return product.getName() + ";" + product.getPrice();
            case "name":
                return product.getName();
            case "json":
                return "{\"name\": \"" + product.getName() + "\", \"price\": " + product.getPrice() + "\"}";
            default:
                throw new IllegalArgumentException("no such format: " + format);
        }
    }
}
