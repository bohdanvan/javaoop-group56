package com.bvan.oop.lessons7_8.generic.box;

/**
 * @author bvanchuhov
 */
public class ObjectBoxRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        ObjectBox catBox = new ObjectBox(cat);

        sendBox(catBox);
    }

    private static void sendBox(ObjectBox catBox) {
        Object value = catBox.get();
        if (value instanceof Cat) {
            Cat cat = (Cat) value;
            cat.meow();
        } else {
            throw new IllegalArgumentException("where is my cat?");
        }
    }
}

class Cat {
    public void meow() {
        System.out.println("Meow");
    }
}

class Dog {
    public void bark() {
        System.out.println("Gav-gav");
    }
}