package com.bvan.oop.lessons9_10.equals_hashcode;

import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class EqualsHashCodeExample {

    public static void main(String[] args) {
        A a = new A(10);
        A b = new A(10);
        A c = new A(20);

        System.out.println("Equals: ");
        System.out.println(a.equals(a)); // T
        System.out.println(a.equals(b)); // T
        System.out.println(b.equals(a)); // T
        System.out.println(a.equals(c)); // F
        System.out.println(Objects.equals(a, b));
        System.out.println();

        System.out.println("Hash code: ");
        System.out.println(a.hashCode() == a.hashCode()); // T
        System.out.println(a.hashCode() == b.hashCode()); // T
        System.out.println(a.hashCode() == c.hashCode()); // F, but could be T
    }
}

class A {
    private final int x;

    public A(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return x == a.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                '}';
    }
}
