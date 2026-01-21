package com.techouts.cj8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntermediateOperationsStream {

    public static void main(String[] args) {

        /*
            flter() -> It is intermediate operation which creates another stream that matches to given condition.

         */

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(3030);
        list.add(45);
        list.add(324);
        list.add(4343);
        list.add(20);
        list.add(354);
        //filter() method with the operation of filtering out the elements divisible by 5.
        System.out.println("The numbers which are divisible by 5 are : ");
        list.stream().filter(num -> num % 5 == 0 && num >= 20).forEach(System.out :: println);

        //filter() method with the operation of picking the elements with an upperCase letter at index 1.

        List<String> al = Arrays.asList("Manoj","rAkesh","hYder","pAvan");

        System.out.println("Names Having Uppercase at index 1 are : ");
        al.stream().filter(str -> Character.isUpperCase(str.charAt(1))).forEach(System.out :: println);

        /*
            map() -> It is used when we want to transform a each element of stream to new element.

            <R> Stream map(Function<? extends T,? extends R> mapper);
         */

        // Multiply the below collection elements with 3;
        List<Integer> list1 = Arrays.asList(2,1,5,10,23,4);

        System.out.println("The numbers after multiplied by 3 are : ");
        list1.stream().map(num -> num * 3).forEach(System.out :: println);
        System.out.println("UpperCase List is : ");
        System.out.println(al.stream().map(String :: toUpperCase).collect(Collectors.toList()));
        System.out.println("Length of all the Strings : ");
        System.out.println(al.stream().map(str -> str.length()).collect(Collectors.toList()));

        //Sorting Numbers :
        System.out.println("Sorting of Numbers are  :  ");
        IntStream.of(2,42,1,4,5).sorted().forEach(System.out :: println);
    }

}
