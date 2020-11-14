package Lesson4;

import java.util.*;

public class TaskOne {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Burbank", "Glendale", "Beverly Hills", "Culver City", "Lakewood",
                "Downey", "Carson", "Long Beach", "Ontario", "Pasadena",
                "Pasadena", "Pasadena", "Burbank", "Beverly Hills", "Beverly Hills",
                "Beverly Hills", "Beverly Hills", "Long Beach", "Long Beach", "Long Beach"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Array");
        System.out.println(words.toString());
        System.out.println("Unique words");
        System.out.println(unique.toString());
        System.out.println("Number of repetitions of words");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}