package com.techouts.cj7;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    static void main(String[] args) {

        /*
            List is a sub-interace of Collection interface that stores the elements
            in a ordered fashion.
            It allows duplicates values and are faster to access
            List Interface is implemented by :
                1) ArrayList
                2) LinkedList
                3) Vector
                    4) Stack
         */

        // List can also stores multiple datatype objects!!
        List list = new ArrayList();

        list.add(100);
        list.add("Welcome to Techouts !!");
        list.add(23.45f);
        list.add(true);
        list.add(67.6805970d);

        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.contains(true));

        List<Integer> al = new ArrayList<>();
        al.add(23);
        al.add(345);

        System.out.println(al);

        list.addAll(al);

        System.out.println("List aftr adding all elements of another list = " + list);

        System.out.println(list.indexOf(23));
        System.out.println(list.lastIndexOf(1));// return -1;

        /*for(var item : list) {
            System.out.print(item + " ");
        }*/


    }
}
