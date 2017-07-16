package com.bvan.oop.lessons7_8.generic.format;

/**
 * @author bvanchuhov
 */
@FunctionalInterface
public interface Formatter<T> {

    String format(T value);
}
