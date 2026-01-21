package com.techouts.cj8;

import java.util.ArrayList;
import java.util.Collection;

public class forEachDemo {

    public static void main(String[] args) {

        /*
            forEach() method is a default method in iterable interface that helps to iterate over
            a collection without using traditional for Loop.
            It is introduced in java version 8.
         */

        ArrayList list = new ArrayList();

        list.add(10);
        list.add("india");
        list.add(true);
        list.add('A');
        list.add("Australia");
        System.out.println("Items in List : ");
        list.forEach(item -> System.out.println(item));

        System.out.println("Displaying only String Type Items !!");

        list.forEach(item ->
        {
            if(item instanceof String) {
                System.out.println(item);
            }
        });

        Collection<Integer> collection = new ArrayList<>();

        collection.add(3);
        collection.add(107);
        collection.add(13);
        collection.add(6);
        System.out.println(collection);

        list.addAll(collection);
        System.out.println(list);

        list.forEach(item ->
        {
            if(item instanceof Integer) {
                Integer n =  (Integer) item;
                boolean flag = true;
                for(int i = 2;i <= Math.sqrt(n);i++)
                {
                    if(n % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                System.out.println(n);
            }
        });


    }

}
