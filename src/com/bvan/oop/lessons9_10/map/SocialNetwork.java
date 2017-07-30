package com.bvan.oop.lessons9_10.map;

import com.bvan.oop.common.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class SocialNetwork {

    public static void main(String[] args) {
        Map<Long, Person> idToUserMap = new HashMap<>();

        idToUserMap.put(3000L, new Person("Jessie", 20));
        idToUserMap.put(100L, new Person("John", 25)); // O(1)
        idToUserMap.put(500L, new Person("Bob", 30));
//        idToUserMap.put(100L, new Person("Phil", 45));

        Person person = idToUserMap.get(100L); // O(1)
        System.out.println(person);

        Set<Long> keySet = idToUserMap.keySet();
        Collection<Person> values = idToUserMap.values();
        Set<Map.Entry<Long, Person>> entries = idToUserMap.entrySet();
        for (Map.Entry<Long, Person> entry : entries) {
            System.out.println(entry);
        }
    }
}
