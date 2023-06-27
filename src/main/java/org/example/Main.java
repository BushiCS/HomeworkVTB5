package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] words = {
                "Barsik",
                "Jack",
                "Bill",
                "Yuriy",
                "Lisa",
                "Bill",
                "John",
                "Michael",
                "Ivan",
                "Gary",
                "Donald",
                "Lisa",
                "Ivan",
                "Michael",
                "Phil",
                "Paul",
                "Paul"};

        List<String> stringList = Arrays.stream(words).distinct().collect(Collectors.toList());
        System.out.println(stringList);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Sviridov", "89291066524");
        phoneBook.add("Ivanov", "89213350841");
        phoneBook.add("Gerasimov", "89522223312");
        phoneBook.add("Petrov", "89522283325");
        phoneBook.add("Sviridov", "89213350841");
        phoneBook.getAll();



    }
}