package com.techouts.cj6.ExceptionHandling;

public class ArithmeticExceptionDemo {

    static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println("Can not divide by zero !!! " + ae.getMessage());
            System.out.println("Can not divide by zero !!! " + ae.toString());
            ae.printStackTrace();
            System.out.println();
        }
    }


    public static class ArrayIndexOutofBoundsExceptionDemo {

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
}
