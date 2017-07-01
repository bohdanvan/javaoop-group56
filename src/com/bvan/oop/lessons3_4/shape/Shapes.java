package com.bvan.oop.lessons3_4.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class Shapes {

    private final List<Shape> shapes = new ArrayList<>();

    public Shapes add(Shape shape) {
        shapes.add(shape);
        return this;
    }

    public Shape get(int index) {
        return shapes.get(index);
    }

    public double getArea() {
        double area = 0.;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        return area;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        for (Shape shape : shapes) {
            joiner.add(shape.toString());
        }
        return "Shapes:\n" + joiner.toString();
    }
}
