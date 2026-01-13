package com.techouts.cj6.iopackage;

public class SystemOutDemo {

     void main(String[] args) {

        int a = 10;

        // print() is used to stay in the same line.
        System.out.print("a = " + a);

        //println() is used to print the method and control goes to next line.
        System.out.println("2nd time a = " + a);

        System.out.println("Now it prints in new line !!!");

        //printf() is used to print formatted text as like in C

        System.out.printf("The value of a = %d%n" , a);

        float f = 10.3f;

        System.out.printf("f = %.5f%n" ,f);

        double d = 34.43232;

        System.out.printf("d = %.12f%n",d);

        System.err.println("Error : Occurred!!  in " + this.getClass());



    }


}
