package com.bvan.oop.lessons3_4.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ShapeRunner {

    public static void main(String[] args) {
        Shape shape1 = new Rectangle(10.0, 20.0);
        System.out.println(shape1.getArea()); // 200

        Shape shape2 = new Circle(10.0);
        System.out.println(shape2.getArea()); // 314

        List<Shape> shapes = new ArrayList<>();
        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(shape2);
        shapes.add(new EquilateralTriangle(10.0));

        double areaSum = areaSum(shapes);
        System.out.println("areaSum = " + areaSum);

        Shape shape = shapes.get(2);
        if (shape instanceof EquilateralTriangle) {
            EquilateralTriangle triangle =
                    (EquilateralTriangle) shape;
            System.out.println(triangle.getSide());
        }
    }

    public static double areaSum(List<Shape> shapes) {
        double areaSum = 0.0;
        for (Shape shape : shapes) {
            areaSum += shape.getArea();
        }
        return areaSum;
    }
}
