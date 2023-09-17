# Java-Collection
The **Collection** in Java is a framework that provides an architecture to store and manipulate the group of objects.

Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects. Java Collection framework provides many interfaces such as Set, List, Queue, Deque and classes such as ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet.


![java-collection-hierarchy](https://github.com/faiyaz666/Java-Collection/assets/75085369/2274c61f-fc39-4650-b621-2a7ce8232715)

## ArrayList
**ArrayList** is a class that implements List interface. The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

* Implements List interface
* Maintains insertion order
* Internal data structure is regular array
* Dynamic size
* Allows duplicates and any number of null values
* Can not use primitive data type (int, float, double, string)
* Best for storing and accessing data

## LinkedList
**LinkedList** is a class that implements List and Deque interface. The functionality and behaviour of LinkedList class is similar to ArrayList. main difference is in their internal implementation. ArrayList uses regular array and LinkedList uses actual linked list as the internal implementation.

* Implements List and Deque interface
* Maintains insertion order
* Internal data structure is doubly linked list
* Dynamic size
* Allows duplicates and any number of null values
* Can not use primitive data type (int, float, double, string)
* Best for manipulating data

## Vector
Vector implements a dynamic array which means it can grow or shrink as required. Like an array, it contains components that can be accessed using an integer index. They are very similar to ArrayList, but Vector is synchronized and has some legacy methods that the collection framework does not contain.

## PriorityQueue
A **PriorityQueue** is used when the objects are supposed to be processed based on the priority. It is known that a Queue follows the First-In-First-Out algorithm, but sometimes the elements of the queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play.

The PriorityQueue is based on the priority heap. The elements of the priority queue are ordered according to the natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.

## Deque
**Deque** is the acronym for double-ended queue. The Deque (double-ended queue) interface in Java is a subinterface of the Queue interface and extends it to provide a double-ended queue, which is a queue that allows elements to be added and removed from both ends.

## HashSet
**HashSet** is a class that implements Set interface. The functionality and behaviour of HasSet is similar to set. That means it doesn't allow any duplicates. And only one null value is accepted.

* Implements Set interface
* Doesn't maintain insertion order
* Internal data structure is hash table
* Dynamic size
* Doesn't allow duplicates and only one null value is acceptable
* Can not use primitive data type (int, float, double, string)
* Best for storing unique data

## LinkedHashSet
**LinkedHashSet class represents the LinkedList implementation of Set Interface. It extends the HashSet class and implements Set interface. Like HashSet, It also contains unique elements. It maintains the insertion order and permits null elements.


## TreeSet
**TreeSet** is a class that implements NavigableSet interface. The functionality and behaviour of TreeSet is similar to set that maintains insertion order.

* Implements NavigableSet interface
* Doesn't insertion order
* Sorts element upon insertion
* Internal data structure is red-black tree
* Dynamic size
* Doesn't allow duplicates and null values
* Can not use primitive data type (int, float, double, string)
* Best for storing unique data while maintaining insertion order
