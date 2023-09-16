package com.collection;

import java.util.*;
public class ListClass {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2 = new LinkedList();
        List<Integer> list3 = new Vector();
        List<Integer> list4 = new Stack();

        list1.add(5);
        list1.add(6);
        list1.add(7);

        list3.add(3);
        list3.add(5);

        Integer contains = list1.get(1);
        System.out.println(contains);

        System.out.println(list1);
        System.out.println(list3);

    }
}
