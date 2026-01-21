package com.techouts.cj8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.function.Supplier;

public class MethodReferenceDemo {

    public static void print(String str) {
        System.out.print(str);
        System.out.print(" ");
    }
    public static void main(String[] args) {

        String []arr = {"Hi","Welcome","To", "Techouts"};

        Arrays.stream(arr).forEach(MethodReferenceDemo::print);

        List<Integer> list = new ArrayList<>();

        list.add(29);
        list.add(20);
        list.add(11);
        list.add(2);
        list.add(23);

        System.out.println("Squares of number in list are : ");
        // Static method reference
        list.forEach(MathUtil::square);

        MathUtil mu = new MathUtil();
        // Instance method reference!
        System.out.println("Double of each number in the list are : ");
        list.forEach(mu::doubleTheNumber);

        //Constructor-Reference
        Supplier<Student1> supplier = (Student1 :: new);
        System.out.println(supplier.get().hashCode());
    }

}

class MathUtil {

    public static void square(int n) {
        System.out.println(n * n);
    }

    public void doubleTheNumber(int n) {
        System.out.println(n + n);
    }

}

class Student1 {

    Student1 () {
        System.out.println("Object Created for Student Class!");
    }

}