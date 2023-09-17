package com.collection;

import java.util.*;

public class SetClass {

    public static void main(String[] args) {
        Set<Integer> hashset = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        //Hashset
        hashset.add(5);
        hashset.add(6);
        hashset.add(7);
        hashset.add(8);

        //Traversing elements
        Iterator<Integer> itr = hashset.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //LinkedHashSet

        linkedHashSet.add("Ravi");
        linkedHashSet.add("Vijay");
        linkedHashSet.add("Ravi");
        linkedHashSet.add("Ajay");
        Iterator<String> itr1 =linkedHashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        //Sorted Treeset
        //Gives sorted result in ascending order

        SortedSet<Integer> set = new TreeSet();

        set.add(9);
        set.add(4);
        set.add(10);

        System.out.println(set);

    }
}
