package com.techouts.cj6;

public class ArrayIndexOutofBoundsExceptionDemo {

    static void main(String[] args) {
        int arr[] = new int[3];

        try {
            System.out.println("arr[4] = " + arr[4]);
        }

        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae.getMessage());
        }

        finally {
            System.out.println("Finally Block Executed !!");
        }
        }

}
