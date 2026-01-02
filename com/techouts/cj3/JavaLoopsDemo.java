package com.techouts.cj3;

public class JavaLoopsDemo {
    public static void main(String[] args) {

        // for loop is used to execute a block of statements when number of iterations are already known.

        int num = 10;
        for(int i = 1; i <= num;i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        // while loop in java is used when the number of iterations are not known early !!

        int n = 10;

        while(n != 0)
        {
            System.out.print(n + " ");
            n--;
        }

        // do while loop is a exit controlled loop ,, it works like same as while loop but it first executes
        // body before checking the condition
        System.out.println() ;
        int even = 0;

        do{
            System.out.print(even + " ");
            even += 2;
        }
        while(even <= 100);

    }
}
