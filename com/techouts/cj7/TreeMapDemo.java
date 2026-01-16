package com.techouts.cj7;

import java.util.*;

public class TreeMapDemo {

    static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Apple",1);
        treeMap.put("Car",3);
        treeMap.put("Ball",2);
        treeMap.put("Dance",4);

        treeMap.put("A",12);

        System.out.println(treeMap);

        System.out.println(treeMap.keySet());
        System.out.println(treeMap.values());
        System.out.println(treeMap.entrySet());

        treeMap.put("Hi",null);
        treeMap.replace("Apple",3);
        treeMap.remove("A");

        System.out.println("Map 1  = " + treeMap);

        Map<Integer,String> map = new TreeMap<>();
        map.put(23,"TwentyThree");
        map.put(100,"Hundred");
        map.put(5,"Five");
        map.put(4,"Four");


        System.out.println("Map 2 = " + map);
    }


}