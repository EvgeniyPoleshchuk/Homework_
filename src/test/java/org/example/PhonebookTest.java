package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;


class PhonebookTest {
    Phonebook phonebook = new Phonebook();

    @BeforeEach
    public void createContact() {
        phonebook.add("Petya", "232323");
        phonebook.add("Masha", "232323232");
    }

    @Test
    public void addTest() {
        String name = "Petya";
        String phoneNumber = "32313123";
        HashMap<String, String> contactListTesT = new HashMap<>();
        contactListTesT.put("Petya", "89215885937");
        contactListTesT.put("Masha", "3232323");
        if (!contactListTesT.containsKey(name)) {
            contactListTesT.put("Petya", "1231231");
        }
        Assertions.assertEquals(contactListTesT.size(), phonebook.add("Petya", "23123123"));
    }


}

