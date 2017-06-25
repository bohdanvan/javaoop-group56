package com.bvan.oop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class Person {

    private final String name; // field
    private final int age;

    public Person(String name, int age) {
        checkAge(age);

        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person() {
        this("UNNAMED");
    }

    public String sayHello() {
        if (age == 0) {
            return "Hello, I'm " + name;
        }
        return "Hello, I'm " + name + ", " +
                age + " years old";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void checkAge(int age) {
        if (!isAge(age)) {
            throw new IllegalArgumentException("illegal age: " + age);
        }
    }

    private boolean isAge(int n) {
        return n >= 1 && n <= 120;
    }
}
