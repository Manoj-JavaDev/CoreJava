package com.techouts.cj8;

public class Addition {
    public static void main(String[] args) {

        Add add = (a,b) -> a + b;

        System.out.println("Addition of 10 & 20 = " + add.add(10,20));

    }

}

interface Add {
    int add(int a, int b);
}
