package com.bvan.oop.lessons7_8.generic.format;

import com.bvan.oop.lessons5_6.format.Product;

 /**
 * @author bvanchuhov
 */
public class NameFormatter implements Formatter<Product> {

    @Override
    public String format(Product product) {
        return product.getName();
    }
}
