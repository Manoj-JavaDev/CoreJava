package com.techouts.cj6;

import java.util.Scanner;

public class CustomException1 {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age :");
        int age = sc.nextInt();
        checkAge(age);
    }

    public static void checkAge(int age) {
        try {
            if (age < 18) throw new InvalidAgeException("Age must be greater than 18 ");

            System.out.println("Candidate is eligible to vote!!");
        } catch (InvalidAgeException e) {
            System.out.print("Caught Exception :");
            System.out.println(e);
        }
    }

}

class InvalidAgeException extends Exception {

    InvalidAgeException(String str) {
        super(str);
    }

}


