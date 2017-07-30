package com.bvan.oop.lessons9_10.io;

import com.bvan.oop.lessons1_2.person.oop.Person;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class PersonIOExample {

    public static void main(String[] args) {
        String fileName = "files/person.csv";

        try {
            List<Person> people = PersonIOUtils.readPeopleFromFile(fileName);
            for (Person person : people) {
                System.out.println(person);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, the file is not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Sorry, IO error: " + e.getMessage());
        } catch (IllegalFormatException e) {
            System.out.println("Sorry, illegal input: " + e.getMessage());
        }
    }
}
