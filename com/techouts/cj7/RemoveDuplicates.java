package com.techouts.cj7;

import corejava.assesment1.example.pack1.A;

import java.util.*;

public class RemoveDuplicates {

    static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter Size of list : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i = 0;i < size ;i++) {
            list.add(sc.nextInt());
        }

        System.out.println(removeDuplicates(list));

    }

    public static Set<Integer> removeDuplicates(List<Integer> list) {

        Set<Integer> result = new LinkedHashSet<>();
        if(list.size() <= 0) {
            return result;
        }

        for(int i = 0;i < list.size(); i++) {
            result.add(list.get(i));
        }

        return result;
    }

}
