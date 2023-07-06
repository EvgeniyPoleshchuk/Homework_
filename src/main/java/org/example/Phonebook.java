package org.example;

import java.util.HashMap;
import java.util.TreeMap;

public class Phonebook {
    HashMap<String, String> contactList = new HashMap<>();

    public int add(String name, String phonebook) {
        if (!contactList.containsKey(name)) {
            contactList.put(name, phonebook);
        }
        return contactList.size();
    }

    public String findByNumber(String phoneNumber) {
        return String.valueOf(contactList.entrySet()
                .stream()
                .filter(user -> user.getValue().equals("11223344"))
                .findFirst()
                .orElse(null));
    }

    public String findByName(String name) {
        return contactList
                .keySet().stream()
                .filter(user -> user.equals(name))
                .findFirst()
                .orElse(null);
    }

    public String printAllNames() {
        TreeMap<String, String> sortedMap = new TreeMap<>(contactList);
        return sortedMap.keySet().toString();
    }
}
