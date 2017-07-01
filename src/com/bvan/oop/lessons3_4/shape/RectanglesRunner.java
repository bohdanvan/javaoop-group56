package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class RectanglesRunner {

    public static void main(String[] args) {
        Rectangles rectangles = new Rectangles();
        rectangles.add(new Rectangle(10.0, 20.0));
        rectangles.add(new Rectangle(3.0, 2.0));

        System.out.println(rectangles);

        double area = rectangles.getArea();
        System.out.println("area = " + area);
    }
}
