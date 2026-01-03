package com.techouts.cj3;

public class JumpStatements {

    public static void main(String args[]) {


        // Continue statement
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        // break Statement
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");

        }

    }
}