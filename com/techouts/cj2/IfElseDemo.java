package com.techouts.cj2;

public class IfElseDemo {
    public static void main(String args[])
    {
        // if Statement
        int num = 9;
        if(num >= 0)
        {
            System.out.println("num is positive");
        }

        // if-else statement
        int age = 30;
        if(age > 18)
        {
            System.out.println("Eligible for voting ");
        }
        else {
            System.out.println("Not eligible for voting ");
        }

        // else if ladder

        int marks = 90;
        if(marks >= 90)
        {
            System.out.println("Grade A");
        }
        else if(marks < 90 && marks >= 80)
        {
            System.out.println("Grade B");
        }
        else if(marks < 80 && marks >= 60)
        {
            System.out.println("Grade C");
        }
        else if(marks < 60 && marks >= 40)
        {
            System.out.println("Passed ");
        }
        else
        {
            System.out.println("Failed");
        }

        // nested if - else

        int n = 654;
        if(n > 0)
        {
            if(n % 2 == 0)
            {
                System.out.println("positive number");
            }
            else
            {
                System.out.println("odd number");
            }
        }
        else {
            System.out.println("Negative number");
        }

    }
}

