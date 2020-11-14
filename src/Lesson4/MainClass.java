package Lesson4;

import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        task1();
        task2();

    }
    public static void task1() {
        List<String> words = Arrays.asList(
                "Burbank", "Glendale", "Beverly Hills", "Culver City", "Lakewood",
                "Downey", "Carson", "Long Beach", "Ontario", "Pasadena",
                "Pasadena", "Pasadena", "Burbank", "Beverly Hills", "Beverly Hills",
                "Beverly Hills", "Beverly Hills", "Long Beach", "Long Beach", "Long Beach"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Array:");
        System.out.println(words.toString());
        System.out.println("Unique words:");
        System.out.println(unique.toString());
        System.out.println("Number of repetitions of words:");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
        System.out.println("-----------------");
    }

    public static void task2() {
        Phonebook phonebook = new Phonebook();

        System.out.println("Phonebook");
        phonebook.add("Washington", "202-456-11-11");
        phonebook.add("Washington", "202-456-24-61");
        phonebook.add("Kennedy", "202-456-21-54");
        phonebook.add("Carter", "202-456-47-89");
        phonebook.add("Bush", "202-456-52-56");
        phonebook.add("Clinton", "202-456-63-21");
        phonebook.add("Obama", "202-456-77-29");
        phonebook.add("Obama", "202-456-11-12");
        phonebook.add("Trump", "202-456-00-01");
        System.out.println("-----------------");

        System.out.println("Phone number search by last name");
        System.out.println("Washington");
        System.out.println(phonebook.get("Washington"));
        System.out.println("Kennedy");
        System.out.println(phonebook.get("Kennedy"));
        System.out.println("Obama");
        System.out.println(phonebook.get("Obama"));
        System.out.println("Trump");
        System.out.println(phonebook.get("Trump"));
    }
}