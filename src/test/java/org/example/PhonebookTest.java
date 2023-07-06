package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;


class PhonebookTest {
    Phonebook phonebook = new Phonebook();
    HashMap<String,String> contactList = new HashMap<>();

    @BeforeEach
    public void createContact() {
        phonebook.add("Petya", "123456");
        phonebook.add("Masha", "654321");
        phonebook.add("ira", "11223344");
        phonebook.add("ula", "22113344");
    }
    @BeforeEach
    public void putInHash(){
        contactList.put("Petya", "123456");
        contactList.put("Masha", "654321");
        contactList.put("ira", "11223344");
        contactList.put("ula", "22113344");
    }
    @Test
    public void addTest() {
        String name = "Petya";
        String phoneNumber = "32313123";
        if (!contactList.containsKey(name)) {
            contactList.put("Petya", "1231231");
        }
        Assertions.assertEquals(contactList.size(), phonebook.add("Petya", "23123123"));
    }
    @Test
    public void findByNumberTest() {
        String search = String.valueOf(contactList.entrySet()
                .stream()
                .filter(user -> user.getValue().equals("11223344"))
                .findFirst()
                .orElse(null));
        phonebook.add("ira", "11223344");
        Assertions.assertEquals(search, phonebook.findByNumber("11223344"));
    }
    @Test
    void findByName() {
        String search = contactList
                .keySet().stream()
                .filter(user -> user.equals("ira"))
                .findFirst()
                .orElse(null);
        phonebook.add("ira", "11223344");
        Assertions.assertEquals(search,phonebook.findByName("ira"));
    }

    @Test
    public void printAllNames() {
        TreeMap<String,String> sort = new TreeMap<>(contactList);
        String nameList = sort.keySet().toString();
        Assertions.assertEquals(nameList,phonebook.printAllNames());
    }
}

