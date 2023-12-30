package com.cham.learning.datastructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    public static Map<String, Integer> hm1 = new HashMap<>();
    public static Map<Person, String> personJob = new HashMap<>();
    static Person p1 = new Person("Rasika",30);
    static Person p2 = new Person("Sadun",35);

    public static void tryHashMap() {

        hm1.put("one", 1); //insertion
        hm1.put("four", 4);
        hm1.put("two", 2);
        System.out.println("Is key \"four\" available? : " + hm1.containsKey("four"));
        System.out.println("value of four is : " + hm1.get("four")); //Retrieval

        hm1.remove("four"); //Remove
        System.out.println("Is key \"four\" available? : " + hm1.containsKey("four")); //Availability
        System.out.println("Is value \"4\" available? : " + hm1.containsValue(4));
        System.out.println();

        personJob.put(p1, "Developer");
        personJob.put(p2, "Teacher");
        System.out.println("Second person's job is : " + personJob.get(p2));
    }

    static class Person { //inner class
        String name;
        int age;
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }

}