package com.bvan.oop.lessons5_6.inheritance;

/**
 * @author bvanchuhov
 */
public class Developer extends Person {

    private final String company;

    public Developer(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("I'm cool dev from " + company);
        super.sayHello();
    }

    public void writeCode() {
        System.out.println("I'm cool dev from " + company + ". I'm writing code");
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + "'" +
                ", age=" + getAge() +
                ", company='" + company + '\'' +
                '}';
    }
}