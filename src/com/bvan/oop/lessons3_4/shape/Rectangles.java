package com.bvan.oop.lessons3_4.shape;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class Rectangles {

    private final ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void add(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public double getArea() {
        double areaSum = 0.0;
        for (Rectangle rectangle : rectangles) {
            areaSum += rectangle.getArea();
        }
        return areaSum;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        for (Rectangle rectangle : rectangles) {
            joiner.add(rectangle.toString());
        }
        return "Rectanges:\n" + joiner.toString();
    }
}
