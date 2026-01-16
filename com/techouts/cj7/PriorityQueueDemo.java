package com.techouts.cj7;
import java.util.PriorityQueue;
import java.util.Iterator;


public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println("Initial PQ: " + pq);
        pq.add(40);
        pq.offer(10);
        pq.add(30);
        pq.add(20);
        pq.add(50);
        System.out.println("After adding elements: " + pq);
        System.out.println("peek(): " + pq.peek());
        System.out.println("element(): " + pq.element());
        System.out.println("poll(): " + pq.poll());
        System.out.println("remove(): " + pq.remove());
        System.out.println("PQ after removals: " + pq);
        System.out.print("Iteration (heap order): ");
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.print("Sorted order using poll(): ");

        PriorityQueue<Integer> copy = new PriorityQueue<>(pq);
        while (!copy.isEmpty()) {
            System.out.print(copy.poll() + " ");
        }
        System.out.println();

        System.out.println("Size: " + pq.size());
        System.out.println("Contains 30? " + pq.contains(30));
        pq.remove(30);
        System.out.println("After removing 30: " + pq);
        pq.clear();
        System.out.println("After clear(): " + pq);


    }
}