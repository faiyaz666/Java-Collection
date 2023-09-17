package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        Queue<String> q1 = new PriorityQueue();
        Queue<String> q2 = new ArrayDeque();

//        For enqueing and dequeing methods, the time complexity is O(log(n))
//        For the remove(Object) and contains(Object) methods, the time complexity is O(n).
//        For the retrieval methods, it has constant time complexity O(1).

        q1.add("Rafid");
        q1.add("Sakib");

        System.out.println(q1);

        PriorityQueue<String> queue=new PriorityQueue<>();

        queue.add("rafid");
        queue.add("Atique");
        queue.add("Shreya");

        //Peek holds the highest priority element
        //time complexity O(1);

        System.out.println(queue.peek());

        //Poll deletes and returns the first element;
        //can return null values;
        //time complexity O(log(n))

        System.out.println(queue.poll());

        System.out.println(queue);



        //Array Dequeue

        //ArrayDeque is faster than ArrayList and Stack
        // Has no capacity restrictions.
        Deque<String> deque = new ArrayDeque<String>();

        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        //Traversing elements
        //time complexity O(n)
        for (String str : deque) {
            System.out.println(str);
        }
    }
}

