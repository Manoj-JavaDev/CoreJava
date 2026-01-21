package com.techouts.cj8;

import javax.swing.*;
import java.util.*;

public class LamdaExpressionsWithCollections {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(2647);
        al.add(342);
        al.add(48);
        al.add(374930);
        al.add(787);

        System.out.println("Elements after sorting !!!");

        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
        Collections.sort(al, Comparator.reverseOrder());
        System.out.println(al);
        Collections.sort(al, (a,b) -> b.compareTo(a));
        System.out.println(al);
        Collections.sort(al,(a,b) -> a > b ? -1 : a < b ? 1 : 0);

        System.out.println(al);


        TreeSet<String> set = new TreeSet<>((a,b) -> a.compareTo(b));

        set.add("Manoj");
        set.add("Rakesh");
        set.add("Chandu");
        set.add("Pavan");
        set.add("Karthik");
        set.add("Venkat");
        set.add("Praveen");
        set.add("Lokesh");

        System.out.println("Contents of Set are  : ");
        System.out.println(set);

        Map<Integer, Integer> map = new TreeMap<>((a,b) -> b.compareTo(a));

        map.put(1,100);
        map.put(2,20);
        map.put(3,20);
        map.put(-1,34);
        map.put(20,3);
        map.put(11,100);

        System.out.println("Contents of map are  : ");
        System.out.println(map);




    }

}
