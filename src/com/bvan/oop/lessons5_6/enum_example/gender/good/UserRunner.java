package com.bvan.oop.lessons5_6.enum_example.gender.good;

/**
 * @author bvanchuhov
 */
public class UserRunner {

    public static void main(String[] args) {
        User user = new User("John", 25, Gender.MALE);
        System.out.println(user);
    }
}
