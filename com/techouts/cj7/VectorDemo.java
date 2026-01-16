package com.techouts.cj7;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    static void main(String[] args) {

        Vector v = new Vector();

        // Vector initialised with default capacity of 10
        System.out.println("Default capacity of vector = " + v.capacity());

        v = new Vector(2);
        // 2 is the initial capacity given in the parameter
        System.out.println("Initial Capacity = " + v.capacity());
        v.addElement(23);
        v.addElement("Manoj");
        // When we try to add extra element ,,  it increments capacity to double of the current capacity.
        v.add(232);

        System.out.println("Ensured Capacity = " + v.capacity());

        v.addFirst(100.3221f);
        v.addLast(2311);

        System.out.println("Traversing on vector with Enumaration interface!");
        Enumeration e = v.elements();


        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }









    }

}
