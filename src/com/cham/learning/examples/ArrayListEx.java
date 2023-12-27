package com.cham.learning.examples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

    static List<String> arrList1 = new ArrayList<>();
    //ArrayList<String> arrList2 = new ArrayList<>();

    public static void tryArrayList() {
        arrList1.add("item1");
        arrList1.add("item2");
        System.out.println(arrList1);

        arrList1.remove(1);
        arrList1.add("item3");
        System.out.println(arrList1);

        arrList1.clear();
        System.out.println(arrList1);
    }



}
