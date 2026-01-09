package com.techouts.cj6.ExceptionHandling;

public class NullPointerExceptionDemo {

    static void main(String[] args) {

        String str = null;

        try {
            System.out.println("Length of the String = " + str.length()); // NullPointerException
        }
        catch(RuntimeException re) {
            System.out.println(re);
        }
    }

}
