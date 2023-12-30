package com.cham.learning.datastructures;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

    static Set<String> hs1 = new HashSet<>();

    public static void tryHashSet() {
        hs1.add("1.Nimal"); //add
        hs1.add("3.Kamal");
        hs1.add("2.Ethan");
        hs1.add("4.Bruno");
        System.out.println(hs1);
        System.out.println("Size: " + hs1.size()); //size
        System.out.println("Is 3.Kamal exist? " + hs1.contains("3.Kamal")); //exist?
        System.out.println(hs1.add("2.Ethan")); //if it is duplicate, add will return 'false'

        hs1.remove("3.Kamal"); //remove
        System.out.println("Is 3.Kamal exist? " + hs1.contains("3.Kamal"));

        for (String item : hs1) { //iterating
            System.out.print(item + " ");
        }
    }
}
