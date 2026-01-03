package corejava.assesment1;

import java.util.Scanner;

public class PackageDemo {

    static void main(String[] args) {
        /* package is a collection of interfaces and classes that helps to organize the code simple.
           -> Packages are used to avoid the naming conflicts among the classes & code reusability.
           -> Packages are created by using keyword "package" as
                package package_name;
                Example:
                    package com.techouts.project1
                the above line creates a com folder first, and inside com it creates techouts folder, and
                finally it creates a project1 file inside the techouts folder.

         */

        Scanner sc = new Scanner(System.in);
        // Scanner is a predefined class in java.util.package ,,, we can use this Scanner class by importing instead
        // of writing entire code.

        int m = sc.nextInt();
        System.out.println("m = " + m);



    }

}



