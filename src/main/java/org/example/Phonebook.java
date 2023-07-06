package org.example;

import java.util.HashMap;

public class Phonebook {
    HashMap<String,String> contactList = new HashMap<>();
    public int add(String name,String phonebook){
        if(!contactList.containsKey(name)){
            contactList.put(name,phonebook);
        }
        return contactList.size();
    }
    public String findByNumber(String phoneNumber){
        return String.valueOf(contactList.entrySet()
                .stream()
                .filter(user -> user.getValue().equals("11223344"))
                .findFirst()
                .orElse(null));
    }
}
