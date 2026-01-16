package com.techouts.cj7;

import java.util.*;

public class FrequencyCounterUsingMap {

    /*
        Return the count of each number in given list using Map.

     */
    static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        for(int i = 0;i < size;i++) {
            list.add(sc.nextInt());
        }

        System.out.println(getFrequencyCounter(list));


    }

    public static Map<Integer,Integer> getFrequencyCounter(List<Integer> list) {

        Map<Integer,Integer> map = new LinkedHashMap<>();
        if(list.size() < 0) return map;

        for(int i = 0;i < list.size();i++) {

            int freq = map.getOrDefault(list.get(i),0);
            System.out.print(freq + " ") ;

            map.put(list.get(i),freq + 1);
        }

        return map;
    }
}
