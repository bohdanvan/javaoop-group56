package com.bvan.oop.lessons7_8.generic.format;

import java.util.Arrays;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Product implements Formattable {

    private final String name;
    private final long price;

    public Product(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public List<String> getValues() {
        return Arrays.asList(
                name,
                String.valueOf(price)
        );
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
