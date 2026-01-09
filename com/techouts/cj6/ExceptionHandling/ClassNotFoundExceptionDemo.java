package com.techouts.cj6.ExceptionHandling;

public class ClassNotFoundExceptionDemo {

    static void main(String[] args) {

        try {
            Class temp = Class.forName("com.techouts.cj5.StaticBinding");
            System.out.println(temp.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        finally {
            System.exit(12);
            System.out.println("This is finally block !!");
        }

    }

}
