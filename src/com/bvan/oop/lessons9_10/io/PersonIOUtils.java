package com.bvan.oop.lessons9_10.io;

import com.bvan.oop.lessons1_2.person.oop.Person;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class PersonIOUtils {

    private PersonIOUtils() {}

    /**
     * @throws FileNotFoundException
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static List<Person> readPeopleFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readPeople(reader);
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static List<Person> readPeople(BufferedReader reader) throws IOException {
        List<Person> people = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            Person person = parsePerson(line);
            people.add(person);
        }
        return people;
    }

    /**
     * @throws FileNotFoundException
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static Person readPersonFromFile(String fileName) throws IOException {
        // try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            return parsePerson(line);
        }
    }

    /**
     * @throws IllegalFormatException
     */
    private static Person parsePerson(String s) {
        String[] tokens = s.split(";");
        String name = tokens[0];
        int age = parseAge(tokens[1]);
        return new Person(name, age);
    }

    /**
     * @throws IllegalFormatException
     */
    private static int parseAge(String s) {
        if (!isInt(s)) {
            throw new IllegalFormatException("not an integer: " + s);
        }
        int n = Integer.parseInt(s);
        if (!isAge(n)) {
            throw new IllegalFormatException("not an age: " + n);
        }
        return n;
    }

    private static boolean isAge(int n) {
        return n > 0 && n <= 120;
    }

    private static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
