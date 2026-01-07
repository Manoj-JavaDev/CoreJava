package com.techouts.cj6;

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


}
