package com.bvan.oop.lessons7_8.generic.box;

/**
 * @author bvanchuhov
 */
public class IntBox {

    private final int value;

    public IntBox(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    @Override
    public String toString() {
        return "IntBox{" +
                "value=" + value +
                '}';
    }
}
