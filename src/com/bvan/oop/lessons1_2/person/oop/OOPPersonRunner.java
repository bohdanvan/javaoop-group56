package com.bvan.oop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class OOPPersonRunner {

    public static void main(String[] args) {
        Person p = new Person("John", 25);

        String message = p.sayHello();
        System.out.println(message);
    }
}
