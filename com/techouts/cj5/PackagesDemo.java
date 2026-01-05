package com.techouts.cj5;

import java.util.ArrayList;

public class PackagesDemo {
    public static void main(String[] args) {
        // Packages are used to group the classes and interfaces
        // It organizes the code neatly.
        // It helps to avoid naming conflicts of classes and intefaces

      /*  Packages are created using a keyword "package" , and every word in package
        name creates a directory and subdirectory.
        // We can use classes and interfaces in package by importing a package with "import keyword"
        */
        // We can also use a class in package using its Qualified Name
        java.util.ArrayList<Integer> list= new ArrayList<>();
        System.out.println(list);

    }
}
