
package com.techouts.cj7;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        System.out.println("Initial deque: " + deque);

        deque.add("A");
        deque.offer("B");
        deque.addLast("C");
        deque.addFirst("Start");

        System.out.println("After adding elements: " + deque);

        System.out.println("peek(): " + deque.peek());
        System.out.println("peekFirst(): " + deque.peekFirst());
        System.out.println("peekLast(): " + deque.peekLast());
        System.out.println("remove(): " + deque.remove());
        System.out.println("poll(): " + deque.poll());
        System.out.println("removeFirst(): " + deque.removeFirst());
        System.out.println("pollLast(): " + deque.pollLast());
        System.out.println("Deque after removals: " + deque);
        deque.push("X");
        deque.push("Y");
        deque.push("Z");

        System.out.println("Deque as Stack: " + deque);
        System.out.println("pop(): " + deque.pop());

        deque.offer("Q1");
        deque.offer("Q2");

        System.out.println("Deque as Queue: " + deque);
        System.out.println("poll(): " + deque.poll());


        System.out.print("Forward iteration: ");
        Iterator<String> it = deque.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.print("Reverse iteration: ");
        Iterator<String> descIt = deque.descendingIterator();
        while (descIt.hasNext()) {
            System.out.print(descIt.next() + " ");
        }
        System.out.println();

        System.out.println("Contains 'A'? " + deque.contains("A"));
        System.out.println("Size: " + deque.size());

        deque.clear();
        System.out.println("After clear(): " + deque);

    }
}
