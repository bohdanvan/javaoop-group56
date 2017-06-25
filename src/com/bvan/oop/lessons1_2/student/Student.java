package com.bvan.oop.lessons1_2.student;

/**
 * @author bvanchuhov
 */
public class Student { // DTO (Data Transfer Object)

    private String name;
    private String email;
    private int level;
    private String currentCourse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCurrentCourse() {
        return currentCourse;
    }

    public void setCurrentCourse(String currentCourse) {
        this.currentCourse = currentCourse;
    }
}
