package corejava.assesment1;

import java.util.Scanner;

public class CalculateGradeWithSwitch {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks between 0 to 100:");
        int marks = sc.nextInt();

        String grade = switch (marks / 10) {
            case 10, 9 -> "Grade - A";   // 90–100
            case 8 -> "Grade - B";       // 80–89
            case 7, 6 -> "Grade - C";    // 60–79
            case 5, 4 -> "Grade - D";    // 40–59
            default -> "Fail";           // 0–39
        };

        System.out.println(grade);
    }
}
