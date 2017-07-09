package com.bvan.oop.lessons5_6.enum_example.formatter;

import com.bvan.oop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public enum FormatterType implements Formatter {
    CSV {
        @Override
        public String format(Product product) {
            return product.getName() + ";" + product.getPrice();
        }
    },
    PRICE {
        @Override
        public String format(Product product) {
            return String.valueOf(product.getPrice());
        }
    },
    TO_STRING {
        @Override
        public String format(Product product) {
            return product.toString();
        }
    }
}
