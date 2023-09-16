package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {

    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();

        /*
         * Add(value) operation adds elements to the array list.
         * It maintains insertion order.
         * Time complexity - O(1)
         */
        integerList.add(101);
        integerList.add(102);

        /*
         * Add(index, value) operation adds elements to the array list.
         * It adds element to the array list by particular index number.
         * Subsequent elements are shifted after the add operation.
         * Time complexity - O(n)
         */
        integerList.add(2, 103);
        integerList.add(3, 104);

        printList(integerList);

        /*
         * It returns the size of the array list.
         * Return type is always integer.
         * Time complexity - O(1)
         */
        int size = integerList.size();
        System.out.println("\n\nThe size of the ArrayList is " + size);

        /*
         * Set operation replaces elements to the array list by specific index number.
         * Time complexity - O(1)
         */
        integerList.set(0, 201);
        integerList.set(1, 202);

        printList(integerList);

        /*
         * Remove operation removes elements of a specific index from the array list.
         * The subsequent elements are shifted after the removal.
         * Time complexity - O(n)
         */
        integerList.remove(0);

        printList(integerList);

        /*
         * We can sort any ArrayList using Collections.sort<list>
         * Time complexity - O(n log(n))
         */
        Collections.sort(integerList);

        printList(integerList);

        /*
         * Checks if the array list contains particular element
         * Time complexity - O(n)
         */
        boolean contains = integerList.contains(103);
        System.out.println("\n\nThe result of contain is - " + contains);

        /*
         * Checks if the array list contains all the mentioned elements
         * Time complexity - O(n)
         */
        boolean containsAll = integerList.containsAll(List.of(103, 105));
        System.out.println("\n\nThe result of contain is - " + containsAll);

        /*
         * Clear operation removes all the elements from the array list.
         * Time complexity - O(n)
         */
        integerList.clear();

        printList(integerList);
    }

    /**
     * Helper method for printing the array list
     *
     * @param arrayList The array list to be printed
     */
    private static void printList(ArrayList<Integer> arrayList) {
        System.out.println("\n\nPrinting the list");

        for (Integer element : arrayList) {
            System.out.println(element);
        }
    }
}
