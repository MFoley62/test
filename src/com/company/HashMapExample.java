package com.company;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"Adana");
        hashMap.put(2,"Adıyaman");
        hashMap.put(23,"Elazığ");
        hashMap.put(62,"Tunceli");
        hashMap.put(47,"Mardin");
        hashMap.put(44,"Malatya");
        System.out.println(hashMap);

        Map<Integer, String> languageHashMap = new HashMap<>();
        languageHashMap.put(1, "c#");
        languageHashMap.put(2, "c");
        languageHashMap.put(3, "c++");
        languageHashMap.put(4, "java");
        languageHashMap.put(5, "python");
        languageHashMap.put(6, "swift");
        languageHashMap.put(7, "go");
        languageHashMap.put(8, "rust");
        System.out.println(languageHashMap);
        String getValue = languageHashMap.get(7);
        System.out.println(getValue);
        System.out.println("Keys : " + languageHashMap.keySet());
        System.out.println("Values : " + languageHashMap.values());
        System.out.println("EntrySet : " + languageHashMap.entrySet());
        System.out.println("PutIfAbsent : " + languageHashMap.putIfAbsent(8,"C#"));
        System.out.println(languageHashMap);

    }

}
