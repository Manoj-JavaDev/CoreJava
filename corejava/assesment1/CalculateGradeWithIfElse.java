package corejava.assesment1;

import java.util.Scanner;

public class CalculateGradeWithIfElse {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks between 0 to 100:");
        int marks = sc.nextInt();

        if(marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        }

        else if(marks >= 90 && marks < 100){
            System.out.println("Grade - A");
        }
        else if(marks >= 80 && marks < 90){
            System.out.println("Grade - B");
        }
        else if(marks >= 60 && marks < 80){
            System.out.println("Grade - C");
        }
        else if(marks >= 40 && marks < 60){
            System.out.println("Grade - D");
        }
        else {
            System.out.println("Fail");
        }



    }
}
