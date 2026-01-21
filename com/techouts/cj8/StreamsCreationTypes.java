package com.techouts.cj8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsCreationTypes {

    static void main(String[] args) {

        // Stream API - Allows java developers to process the collection of objects efficiently.
        // It enables to perform all operations in a declarative way i.e using functional programming style
        // There are many ways to create Stream....
        // 1) Using Collections...
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(3030);
        list.add(45);
        list.add(324);
        list.add(4343);
        list.add(354);

        System.out.println("Collection Stream Elements are : ");
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out ::println);

        String str[] = {"Manoj","Techouts","Rakesh","Hyder"};

        System.out.println("Array Stream Elements are : ");
        Stream<String> stream2 = Arrays.stream(str);
        stream2.forEach(System.out :: println);

        System.out.println("Stream.of() Elements are : ");
        Stream<Integer> stream3 = Stream.of(12,1,2,3,2,32);
        stream3.forEach(System.out :: println);

        System.out.println("Stream.iterate() elements are : ");
        Stream.iterate(2,(n -> n * 2)).limit(6).forEach(System.out::println);


    }

}
