package com.bvan.oop.lessons5_6.inheritance;

/**
 * @author bvanchuhov
 */
public class InheritanceExample {
    public static void main(String[] args) {
        Person person = new Developer("John", 25, "Google");
        person.sayHello();
        System.out.println(person);
    }
}
