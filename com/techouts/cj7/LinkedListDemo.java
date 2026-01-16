package com.techouts.cj7;

import java.util.LinkedList;

public class LinkedListDemo {

    /*
        LinkedList is class it implements both List Interface and Deque Interface...
        It is implemented by using doubly linkedList
        It has some safe merhods which doesnt throws exceptions,
            offer(),offerFirst() -- return boolean
            POLL() , pollFirst() -- Doesnt throw exception we are performing on empty list
            peek(),peekFirst() -- Doesnt throw exception we are performing on empty list
     */

    static void main(String[] args) {

        LinkedList ll = new LinkedList<>();
        System.out.println(ll.poll());
        ll.addFirst("India");
        ll.addFirst(34);
        System.out.println(ll);


        LinkedList ll2 = new LinkedList();

        ll2.addFirst(23);

        ll2.addLast("USA");

        ll2.add("Mango");
        ll2.add(454.43);

        ll.addFirst(ll2);
        ll.addAll(ll2);

        System.out.println(ll);

        System.out.println("Removing last element = " + ll.removeLast());
    }

}


