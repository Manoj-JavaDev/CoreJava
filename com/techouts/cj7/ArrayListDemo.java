package com.techouts.cj7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListDemo {

    /*
        Arra
     */
    static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(10);

        arrayList.add(20303);
        arrayList.add(20);
        arrayList.add(303);
        arrayList.add(32);
        arrayList.add(42);

        System.out.println(arrayList);
        arrayList.addFirst(2000);
        System.out.println(arrayList);

        Integer[] normalArray= new Integer[arrayList.size()];

        arrayList.toArray(normalArray);

        System.out.println(Arrays.toString(normalArray));

        arrayList.set(3,1202);
        System.out.println(arrayList);

        System.out.println("Traversing ArrayList using Iterator Interface:\n");
        Iterator<Integer> it = arrayList.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }



    }

}
