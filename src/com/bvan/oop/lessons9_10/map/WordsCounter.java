package com.bvan.oop.lessons9_10.map;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class WordsCounter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("X", "A", "B", "A", "F", "R", "A");
        Map<String, Integer> wordToCountMap = countWords(words);
        System.out.println(wordToCountMap);
    }

    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordToCountMap = new LinkedHashMap<>();

        for (String word : words) {
            Integer count = wordToCountMap.get(word);
            if (count == null) {
                wordToCountMap.put(word, 1);
            } else {
                wordToCountMap.put(word, count + 1);
            }
        }

        return wordToCountMap;
    }
}
