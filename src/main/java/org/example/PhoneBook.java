package org.example;

import java.util.*;

public class PhoneBook {

    Map<String, Set<String>> contacts;

    public PhoneBook() {
        this.contacts = new TreeMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (!contacts.containsKey(surname)) {
            contacts.put(surname, new TreeSet<>());
        }
        contacts.get(surname).add(phoneNumber);
    }

    public void get(String surname) {
        System.out.println(surname + ": " + contacts.get(surname));
    }

    public void getAll() {
        System.out.println(contacts);
    }
}
