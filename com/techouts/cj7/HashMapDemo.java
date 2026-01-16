package com.techouts.cj7;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String args[]) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Manoj", 25);
        hashMap.put("Uday", 30);
        hashMap.put("Surendra", 35);


        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println(hashMap.size());
        hashMap.putIfAbsent("Surendra",342);
        System.out.println(hashMap);

        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.entrySet());
    }


}
