package com.techouts.cj7;

import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push("Manoj");
        stack.push(45.6);

        System.out.println("Stack elements: " + stack);

        System.out.println("Top element : " + stack.peek());


        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);


        System.out.println("Position of 20: " + stack.search(20));

        System.out.println("Is stack empty? " + stack.empty());

        ListIterator listIterator = stack.listIterator(stack.size());

        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
            listIterator.set("New Value");

        }

        listIterator.add(1);

        System.out.println("\n"+stack);

    }
}
